package com.cros.vue.service;

import com.cros.vue.common.Dom4jUtils;

import com.cros.vue.pojo.*;
import lombok.Cleanup;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author MaLei
 * @description: 启动后加载运行服务
 * 这里加载读取handler.xml配置文件，所有handler.xml读取都在本类进行
 * 获取spring应用上下文可以直接注入也可以使用ApplicationContextAware接口来注入容器
 * @create 2020/8/21
 */
@Component
@Slf4j
public class StartRunService implements CommandLineRunner{
    //用来缓存所有页面查询条件及查询输出数据集合的集合
    @Getter
    private Map<String,Object> filterData=new HashMap<>(0);
    //用来缓存所有页面需要初始化字段的集合
    @Getter
    private Map<String,Object> fieldsData=new HashMap<>(0);
    //用来前端需要调用返回table查询数据的类的字段，HashMap线程不安全。ConcurrentHashMap线程安全的
    @Getter
    private Map<String,Map<String,String>> classMethodInfo=new ConcurrentHashMap<>(0);

    @Override
    public void run(String... args) throws Exception {
        Document document =readXMLDocument();
        if(document!=null) {
            loadFilter(document);
            loadFields(document);
        }else{
            log.error("读取handler.xml文件出错");
        }
    }

    /**
     * 读取类路径下的handler.xml文件
     * @return
     */
    private Document readXMLDocument(){
        Resource resource=new ClassPathResource("handler.xml");
        if(resource==null){
            return null;
        }
        try {
            @Cleanup InputStream inputStream=resource.getInputStream();
            Document document = Dom4jUtils.parse(inputStream);
            return document;
        } catch (DocumentException e) {
            log.error("读取handler.xml出错",e);
            return null;
        } catch (IOException e) {
            log.error("读取handler.xml出错",e);
            return null;
        }
    }

    /**
     * 读取handle.xml并将相关配置转化成包装类后载入fieldsData map
     * @param document
     */
    private void loadFields(Document document){
        Element root=document.getRootElement();
        //解析outputFiled节点下fields节点
        Element outputFiled=root.element("outputFiled");
        if(outputFiled!=null) {
            loadField(outputFiled);
        }
    }

    /**
     * 向fieldsData map中装载fieldsDefinition数据
     * @param parentElement
     */
    private void loadField(Element parentElement){
        Iterator<Element> ite=parentElement.elementIterator("fields");
        while (ite.hasNext()){
            Element element=ite.next();
            FieldsDefinition fieldsDefinition=new FieldsDefinition();
            fieldsDefinition.setZlass(element.attributeValue("class"));
            fieldsDefinition.setAssign(element.attributeValue("assign"));
            //遍历载入field
            Iterator<Element> itf=element.elementIterator("field");
            while(itf.hasNext()){
                Element field=itf.next();
                //读取field元素
                FieldDefinition fieldDefinition=readFieldDefinition(field);
                //装载控件数据
                if(fieldsDefinition.getSets()==null) fieldsDefinition.setSets(new TreeSet<ElementDefinition>());
                fieldsDefinition.getSets().add(fieldDefinition);
            }
            //将组装好的fields加入fieldsData map
            fieldsData.put(element.attributeValue("name"), fieldsDefinition);
        }
    }

    /**
     * 读取配置文件handle.xml中field元素的内容
     * @param property
     * @return
     */
    private FieldDefinition readFieldDefinition(Element property){
        FieldDefinition fieldDefinition=new FieldDefinition();
        fieldDefinition.setName(property.attributeValue("name"));
        fieldDefinition.setLabel(property.attributeValue("label"));
        fieldDefinition.setRequire(property.attributeValue("require")==null?false:(StringUtils.equals(property.attributeValue("require"),"true")?true:false));
        fieldDefinition.setTag(property.attributeValue("tag"));
        fieldDefinition.setZlass(property.attributeValue("class"));
        fieldDefinition.setMethod(property.attributeValue("method"));
        fieldDefinition.setSize(property.attributeValue("size"));
        fieldDefinition.setNote(property.attributeValue("note"));
        //需要判断是否是数字
        fieldDefinition.setOrder(StringUtils.isBlank(property.attributeValue("order"))?0:(StringUtils.isNumeric(property.attributeValue("order"))?Integer.valueOf(property.attributeValue("order")):0));
        return fieldDefinition;
    }
    /**
     * 读取配置文件的Filter
     * @param document
     */
    private void loadFilter(Document document){
        Element root=document.getRootElement();
        //解析condition节点下filter节点
        Element condition=root.element("condition");
        if(condition!=null) {
            loadFilter(condition,null);
        }
    }
    private void loadFilter(Element parentElement,FilterHandler handler){
        Iterator<Element> ite=parentElement.elementIterator("filter");
        while (ite.hasNext()){
            Element element=ite.next();
            Filter filter=new Filter();
            loadColumnSet(element,filter);
            filter.setZlass(element.attributeValue("class"));
            filter.setAssign(element.attributeValue("assign"));
            //将包装的属性读取出来
            Iterator<Element> itp=element.elementIterator("property");
            while (itp.hasNext()){
                Element property=itp.next();
                FilterHandler filterHandler=readFilterHandler(property);
                //装载自定义控件的filter属性
                if(StringUtils.equals(filterHandler.getTag(),"custom")){
                    loadFilter(property,filterHandler);
                    loadColumnSet(property,filterHandler);
                }
                //装载控件数据
                if(StringUtils.equals(filterHandler.getTag(),"date")){//日期控件
                    if(filter.getDates()==null) filter.setDates(new TreeSet<>());
                    filter.getDates().add(filterHandler);
                }else {//非日期控件
                    if(filter.getSets()==null) filter.setSets(new TreeSet<>());
                    filter.getSets().add(filterHandler);
                }
            }
            //判断是否有日期组件
            if(filter.getDates()!=null&&filter.getDates().size()>0){
                filter.getSets().add(filter.getDates().iterator().next());
            }
            if(handler==null) {
                //将组装好的filter加入map
                filterData.put(element.attributeValue("name"), filter);
            }else{
                handler.setFilter(filter);
            }
        }
    }
    private void loadColumnSet(Element parentElement,Object handler){
        Iterator<Element> ite=parentElement.elementIterator("columnset");
        while (ite.hasNext()){
            Element element=ite.next();
            //将包装的属性读取出来
            Iterator<Element> itp=element.elementIterator("column");
            while (itp.hasNext()){
                Element col=itp.next();
                Column column=new Column();
                readColumn(col,column);
                //装载控件数据
                if(handler instanceof FilterHandler) {
                    if(((FilterHandler)handler).getCustomQueryHeads()==null)((FilterHandler)handler).setCustomQueryHeads(new TreeSet<>());
                    ((FilterHandler)handler).getCustomQueryHeads().add(column);
                }else if(handler instanceof Filter){
                    if(((Filter)handler).getCustomQueryHeads()==null)((Filter)handler).setCustomQueryHeads(new TreeSet<>());
                    ((Filter)handler).getCustomQueryHeads().add(column);
                }
            }
        }
    }
    /**
     * 向包装类装载数据
     * @param property
     * @return
     */
    private FilterHandler readFilterHandler(Element property){
        FilterHandler filterHandler=new FilterHandler();
        filterHandler.setName(property.attributeValue("name"));
        filterHandler.setLabel(property.attributeValue("label"));
        filterHandler.setEnable(property.attributeValue("enable")==null?false:(StringUtils.equals(property.attributeValue("enable"),"true")?true:false));
        filterHandler.setTag(property.attributeValue("tag"));
        filterHandler.setZlass(property.attributeValue("class"));
        filterHandler.setMethod(property.attributeValue("method"));
        filterHandler.setSize(property.attributeValue("size"));
        //需要判断是否是数字
        filterHandler.setOrder(StringUtils.isBlank(property.attributeValue("order"))?0:(StringUtils.isNumeric(property.attributeValue("order"))?Integer.valueOf(property.attributeValue("order")):0));
        return filterHandler;
    }

    /**
     * 读取自定义查询表头
     * @param col
     * @param column
     */
    private void readColumn(Element col, Column column){
        column.setFixed(col.attributeValue("fixed")==null?false:(StringUtils.equals(col.attributeValue("fixed"),"true")?true:false));
        column.setElement(col.attributeValue("element")==null?null:(StringUtils.equals(col.attributeValue("element"),"true")?true:null));
        column.setLabel(col.attributeValue("label"));
        column.setProp(col.attributeValue("prop"));
        column.setSortable(col.attributeValue("sortable"));
        column.setTooltip(col.attributeValue("tooltip")==null?false:(StringUtils.equals(col.attributeValue("tooltip"),"true")?true:false));
        column.setWidth(StringUtils.isBlank(col.attributeValue("width"))?0:(StringUtils.isNumeric(col.attributeValue("width"))?Integer.valueOf(col.attributeValue("width")):0));
        //需要判断是否是数字
        column.setOrder(StringUtils.isBlank(col.attributeValue("order"))?0:(StringUtils.isNumeric(col.attributeValue("order"))?Integer.valueOf(col.attributeValue("order")):0));
    }
}
