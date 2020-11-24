package com.cros.vue.controller;

import com.cros.vue.common.HandlerUtils;
import com.cros.vue.common.PathUtils;


import com.cros.vue.pojo.*;

import com.cros.vue.service.ExcelService;
import com.cros.vue.service.MenuService;
import com.cros.vue.service.StartRunService;

import com.cros.vue.service.annotation.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextImpl;

import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.ParseException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author MaLei
 * @description: 前端查询条件及查询结果组织类
 * 获取spring应用上下文可以直接注入也可以使用ApplicationContextAware接口来注入容器
 * 所有需要与数据库进行交互，初始化数据都在本类进行
 * @create 2020/8/21
 */
//@ControllerAdvice全局异常处理，使用该注解注释的类可以实现全局异常处理、全局数据处理，及全局数据预处理
@RestController
@Slf4j
public class HandlerControl {
    @Autowired
    StartRunService startRunService;
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    MenuService menuService;
    @Autowired
    ExcelService excelService;
    /**
     * 类查询条件组装器
     * @param classname
     * @return
     */
    @PostMapping("/filterHandler")
    public Filter classFilterHandler(String classname){
        //首字母转换成小写
       // com.cros.vue.common.StringUtils.firstCharToLowerCase()
        String name= com.cros.vue.common.StringUtils.firstCharToLowerCase(classname);
        Filter filter=(Filter)startRunService.getFilterData().get(name);
        try {
            //利用反射调用方法获取数据
            reflectInvokingMethod(filter);
        } catch (ClassNotFoundException e) {
            log.error(e.getMessage());
        } catch (IllegalAccessException e) {
            log.error(e.getMessage());
        } catch (InstantiationException e) {
            log.error(e.getMessage());
        } catch (NoSuchMethodException e) {
            log.error(e.getMessage());
        } catch (InvocationTargetException e) {
            log.error(e.getMessage());
        }
        return filter;
    }

    /**
     * 调用指定实例的指定方法。如果方法名称传入null则检测传入类中标注Execute注解的方法
     * @param cclass 原始类型可以输入null
     * @param classPath 必须是容器中已经存在的实例的全路径类名称
     * @param methodName 方法名称
     * @param args 方法参数
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws NullPointerException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    private List<?> invokingMethod(Class<?> cclass,String classPath,String methodName,Object... args)throws ClassNotFoundException,IllegalAccessException,NullPointerException,NoSuchMethodException, InvocationTargetException{
        Class<?> zlass=null;
        if(cclass==null) {
            zlass = HandlerUtils.obtailClassType(classPath);
        }else{
            zlass =cclass;
        }
        //使用spring容器读取bean
        Object objectInstance = applicationContext.getBean(zlass);
        if(objectInstance==null){
            throw new NullPointerException(classPath+"不存在于容器中!");
        }
        //调用方法获取数据,在调用无参数方法时为了抑制报错使用new  Class[0]。使用null会编译警告
        Method methodBook = zlass.getDeclaredMethod(methodName, new  Class[0]);
        methodBook.setAccessible(true);
        List<?> list = (List<?>) methodBook.invoke(objectInstance, args);
        return list;
    }

    /**
     * 调用指定实例的指定方法。如果方法名称传入null则检测传入类中标注Execute注解的方法
     * @param serviceClassPath 要查询出返回第三个参数集合类型的服务类全路径名称
     * @param requestParam 请求参数
     * @param assgin 指定要返回查询数据列的类名称
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws NullPointerException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    private List<?> invokingMethod(String serviceClassPath,Map<String,String> requestParam,String assgin)throws ClassNotFoundException,IllegalAccessException,NullPointerException,NoSuchMethodException, InvocationTargetException,InstantiationException, ParseException{
        Class<?> zlass = HandlerUtils.obtailClassType(serviceClassPath);
        Class<?> dataClass = HandlerUtils.obtailClassType(assgin);
        Method _method=null;
        Class<?> _methodParamClass=null;
        //在传入的服务类中查找Execute注解
        Object[] objects=HandlerUtils.findAnnotationMethod(zlass,Execute.class);
        _method=(Method) objects[0];
        _methodParamClass=(Class<?>)objects[1];
        //将查询数据类所有字段装载入map，key对应字段名称
        Map<String,String> fieldDefinitions=getFieldDefinitions(assgin,dataClass);;
        return calculateExampleAndInvoked(zlass,_method,_methodParamClass,requestParam,fieldDefinitions);
    }

    /**
     * 调用指定传入服务类标注Editor注解的方法向数据库插入或更新数据
     * 调用指定的服务类(serviceClassPath)，利用反射查询出Editor注解标注的方法及方法参数类型组装查询条件
     * @param serviceClassPath
     * @param requestParam
     * @param assgin
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws NullPointerException
     * @throws InstantiationException
     * @throws NoSuchFieldException
     * @throws InvocationTargetException
     */
    private Boolean invokingUpdateMethod(String serviceClassPath,Map<String,String> requestParam,String assgin)throws ClassNotFoundException,IllegalAccessException,NullPointerException,InstantiationException, NoSuchFieldException,InvocationTargetException,ParseException{
        Class<?> zlass = HandlerUtils.obtailClassType(serviceClassPath);
        Method _method=null;
        Class<?> _methodParamClass=null;
        //在传入的服务类中查找Execute注解
        Object[] objects=HandlerUtils.findAnnotationMethod(zlass, Editor.class);
        _method=(Method) objects[0];
        _methodParamClass=(Class<?>)objects[1];
        //将查询数据类所有字段装载入map，key对应字段名称
        Map<String,String> fieldDefinitions=getFieldDefinitions(assgin,_methodParamClass);
        //根据方法的参数类型组装参数实例
        //先根据参数类型获得实体所属的Example实例
        Object instance=_methodParamClass.newInstance();
        //根据实例类型按照传入的参数进行组装
        HandlerUtils.assembleInstance(instance,requestParam,fieldDefinitions);
        //调用方法然后将组装的查询条件实例参数传入
        //先从容器中获取服务类实例
        Object object = applicationContext.getBean(zlass);

        return (Boolean) _method.invoke(object,instance);
    }

    private List<?> invokingMethod(String serviceClassPath,String methodName,Class<?> methodParamterType,Map<String,String> requestParam,String assgin)throws ClassNotFoundException,IllegalAccessException,NullPointerException,NoSuchMethodException, InvocationTargetException,InstantiationException, ParseException{
        Class<?> zlass = HandlerUtils.obtailClassType(serviceClassPath);
        Class<?> dataClass = HandlerUtils.obtailClassType(assgin);
        Method _method=null;
        Class<?> _methodParamClass=null;
        //在传入的服务类中查找Execute注解
       // Object[] objects=HandlerUtils.findAnnotationMethod(zlass,Execute.class);
        _method=zlass.getDeclaredMethod(methodName,methodParamterType);
        _methodParamClass=methodParamterType;
        //将查询数据类所有字段装载入map，key对应字段名称
        Map<String,String> fieldDefinitions=getFieldDefinitions(assgin,dataClass);
        return calculateExampleAndInvoked(zlass,_method,_methodParamClass,requestParam,fieldDefinitions);
    }

    /**
     * 获取指定名称(assgin)的类类型中定义的字段信息，获取信息后将字段信息集合存在startRunService
     * 实例的classMethodInfo字段的map集合中，存储key即为assgin，实现缓存提高效率
     * @param assgin
     * @param dataClass
     * @return
     */
    private Map<String,String> getFieldDefinitions(String assgin,Class<?> dataClass){
        Map<String,String> fieldDefinitions=null;
        //先从startRunService中请求是否存在，不存在则获取后存入。存在则直接使用
        //降低时间复杂度
        if(startRunService.getClassMethodInfo().containsKey(assgin)){
            fieldDefinitions= startRunService.getClassMethodInfo().get(assgin);
        }else{
            fieldDefinitions= HandlerUtils.obtailFieldsByClass(dataClass);
            startRunService.getClassMethodInfo().put(assgin,fieldDefinitions);
        }
        return fieldDefinitions;
    }
    private List<?> calculateExampleAndInvoked(Class<?> zlass,Method method,Class<?> _methodParamClass,Map<String,String> requestParam,Map<String,String> param)throws ClassNotFoundException,IllegalAccessException,NullPointerException,NoSuchMethodException, InvocationTargetException,InstantiationException, ParseException {
        //先根据参数类型获得实体所属的Example实例
        Object exampleInstance=_methodParamClass.newInstance();
        //调用Example实例的无参方法createCriteria创建Criteria实例
        //判断前端传入的参数中是否有排序字段，如果存在则调用Example实例的setOrderByClause方法进行排序字段配置
        if(requestParam.containsKey("_ordering")) {
            Method methodOrder = HandlerUtils.findMethod(exampleInstance.getClass(),"setOrderByClause",String.class);
            methodOrder.invoke(exampleInstance, requestParam.get("_ordering"));
        }
        //调用Example实例的无参方法createCriteria创建Criteria实例
        Method methodCriteria=HandlerUtils.findMethod(exampleInstance.getClass(),"createCriteria",null);
        Object criteriaInstance=methodCriteria.invoke(exampleInstance,null);
        //循环前端传入的参数来组装。前端传入的参数page,pagesize无需组装
        for (Map.Entry<String, String> m : requestParam.entrySet()) {
            //关于分页及用于反射寻找类型参数过滤掉
            if(!StringUtils.equals(m.getKey(),"page")&&!StringUtils.equals(m.getKey(),"pagesize")&&!StringUtils.equals(m.getKey(),"_class")&&!StringUtils.equals(m.getKey(),"_assign")&&!StringUtils.equals(m.getKey(),"_subclass")){
                String _paramName= m.getKey();
                //通过参数名检索该参数对应类字段的类型,如果是数字类型则用等于，是字符串则like，日期则between
                String _fieldType=param.get(_paramName);
                //根据参数类型组装查询条件
                HandlerUtils.setSQLWhereOfString(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, BigDecimal.class.getName()))
                    HandlerUtils.setSQLWhereOfBigDecimal(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, BigInteger.class.getName()))
                    HandlerUtils.setSQLWhereOfBigInteger(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, Boolean.class.getName()))
                    HandlerUtils.setSQLWhereOfBoolean(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, boolean.class.getName()))
                    HandlerUtils.setSQLWhereOfboolean(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, Double.class.getName()))
                    HandlerUtils.setSQLWhereOfDouble(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, double.class.getName()))
                    HandlerUtils.setSQLWhereOfdouble(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, Float.class.getName()))
                    HandlerUtils.setSQLWhereOfFloat(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, float.class.getName()))
                    HandlerUtils.setSQLWhereOffloat(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, int.class.getName()))
                    HandlerUtils.setSQLWhereOfint(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, Integer.class.getName()))
                    HandlerUtils.setSQLWhereOfInteger(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, Long.class.getName()))
                    HandlerUtils.setSQLWhereOfLong(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, long.class.getName()))
                    HandlerUtils.setSQLWhereOflong(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, Short.class.getName()))
                    HandlerUtils.setSQLWhereOfShort(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                if(StringUtils.isNotEmpty(_fieldType)&&StringUtils.equals(_fieldType, short.class.getName()))
                    HandlerUtils.setSQLWhereOfshort(_fieldType,criteriaInstance,m.getKey(),m.getValue());
                HandlerUtils.setSQLWhereOfDate(_fieldType,criteriaInstance,m.getKey(),m.getValue());
            }
        }
        //从容器中查询出服务类实例，并传入组装的查询条件进行查询
        Object object = applicationContext.getBean(zlass);
        return (List<?>)method.invoke(object,exampleInstance);
    }
    /**
     * 调用指定实例的指定方法。如果方法名称传入null则检测传入类中标注Execute注解的方法
     * @param classPath
     * @param methodName
     * @param args
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws NullPointerException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    private List<?> invokingMethod(String classPath,String methodName,Object... args)throws ClassNotFoundException,IllegalAccessException,NullPointerException,NoSuchMethodException, InvocationTargetException,InstantiationException{
        return  invokingMethod(null,classPath,methodName,args);
    }
    /**
     * 终端自定义查询表格数据时使用的查询类
     * @param param 所有查询参数按照key组装到param中
     * @return
     */
    @PostMapping("/conditionDataHandler")
    public DataPackingBox queryConditionData(@RequestParam Map<String,String> param){
       /* String classPath=PathUtils.matchServicePackagePath((String)param.get("_class"));
        String assignName=PathUtils.matchEntityPackagePath(param.get("_assign"));
        Map<String,Map<String,String>> all=new HashMap<>(0);
        //查询是否有参数等于传递对象,由于要在遍历时删除元素这里使用迭代器
        Iterator<Map.Entry<String,String>> it=param.entrySet().iterator();
        while (it.hasNext()){
           Map.Entry<String,String>e= it.next();
           if(StringUtils.countMatches(e.getKey(),"_")==2){//出现两个_
              String _param=StringUtils.substring(e.getKey(),1);
              String key= StringUtils.substringBefore(_param,"_");
              String value= StringUtils.substringAfter(_param,"_");
              if( all.containsKey(key)){
                  all.get(key).put(value,e.getValue());
              }else{
                 Map<String,String> map=new HashMap<>(0);
                 map.put(value,e.getValue());
                 all.put(key,map);
              }
              //移除参数提高效率
               it.remove();
           }
        }
        //前端所有全部查询类型参数重新组装字段查询值
        for (Map.Entry<String,Map<String,String>> e:all.entrySet()) {
            try {
                Class<?> zlass = HandlerUtils.obtailClassType(assignName);
                //获取字段
                Field field = zlass.getDeclaredField(e.getKey());
                //读取注解
                if (field.isAnnotationPresent(Cascade.class)) {
                    Cascade annotation = field.getAnnotation(Cascade.class);
                    String inst = PathUtils.matchServicePackagePath(annotation.value());
                    String meth = annotation.method();
                    Class<?> type=annotation.argsType();
                    List<?>list = invokingMethod(inst,meth,type,e.getValue(),assignName);
                    //组装查询参数，将数组的sysid转成字符串数组
                    StringBuilder sb=new StringBuilder("");
                    list.forEach(s->{
                        try {
                            if(StringUtils.equals(sb.toString(),"")){
                                sb.append(HandlerUtils.getFieldValue(s,"sysid"));
                            }else{
                                sb.append(",");
                                sb.append(HandlerUtils.getFieldValue(s,"sysid"));
                            }
                        } catch (NoSuchFieldException e1) {
                            log.error(e1.toString());
                        } catch (IllegalAccessException e1) {
                            log.error(e1.toString());
                        }
                    });
                    //将前端传入的参数sysid进行覆盖
                    param.put(e.getKey(),sb.toString());
                }
            } catch (ClassNotFoundException e1) {
                log.error(e1.toString());
            } catch (Exception e1) {
                log.error(e1.toString());
            }
        }*/
        List<?> list= null;
        try {
            PageHelper.startPage(Integer.valueOf(param.get("page")),Integer.valueOf(param.get("pagesize")));
            list = queryData(param);
            PageInfo page=new PageInfo(list);
            DataPackingBox dataPackingBox=new DataPackingBox();
            dataPackingBox.setTotal(page.getTotal());
            dataPackingBox.setPage(page.getPageNum());
            dataPackingBox.setData(list);
            return dataPackingBox;
        } catch (ClassNotFoundException e) {
            log.error(e.toString());
        } catch (IllegalAccessException e) {
            log.error(e.toString());
        } catch (NoSuchMethodException e) {
            log.error(e.toString());
        } catch (InvocationTargetException e) {
            log.error(e.toString());
        }catch (InstantiationException e) {
            log.error(e.toString());
        }catch (ParseException e) {
            log.error(e.toString());
        }
        return null;
    }

    /**
     * 根据前端传入的参数map查询出对象结果集
     * @param param
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws ParseException
     */
    private List<?> queryData(Map<String,String> param) throws ClassNotFoundException,IllegalAccessException,NoSuchMethodException,InvocationTargetException,InstantiationException,ParseException{
        String classPath=PathUtils.matchServicePackagePath((String)param.get("_class"));
        String assignName=PathUtils.matchEntityPackagePath(param.get("_assign"));
        Map<String,Map<String,String>> all=new HashMap<>(0);
        //查询是否有参数等于传递对象,由于要在遍历时删除元素这里使用迭代器
        Iterator<Map.Entry<String,String>> it=param.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String>e= it.next();
            if(StringUtils.countMatches(e.getKey(),"_")==2){//出现两个_
                String _param=StringUtils.substring(e.getKey(),1);
                String key= StringUtils.substringBefore(_param,"_");
                String value= StringUtils.substringAfter(_param,"_");
                if( all.containsKey(key)){
                    all.get(key).put(value,e.getValue());
                }else{
                    Map<String,String> map=new HashMap<>(0);
                    map.put(value,e.getValue());
                    all.put(key,map);
                }
                //移除参数提高效率
                it.remove();
            }
        }
        //前端所有全部查询类型参数重新组装字段查询值
        for (Map.Entry<String,Map<String,String>> e:all.entrySet()) {
            try {
                Class<?> zlass = HandlerUtils.obtailClassType(assignName);
                //获取字段
                Field field = zlass.getDeclaredField(e.getKey());
                //读取注解
                if (field.isAnnotationPresent(Cascade.class)) {
                    Cascade annotation = field.getAnnotation(Cascade.class);
                    String inst = PathUtils.matchServicePackagePath(annotation.value());
                    String meth = annotation.method();
                    Class<?> type=annotation.argsType();
                    Class<?> asign=annotation.assign();
                    //List<?>list = invokingMethod(inst,meth,type,e.getValue(),assignName);
                    List<?>list = invokingMethod(inst,meth,type,e.getValue(),asign.getName());
                    //组装查询参数，将数组的sysid转成字符串数组
                    StringBuilder sb=new StringBuilder("");
                    list.forEach(s->{
                        try {
                            if(StringUtils.equals(sb.toString(),"")){
                                sb.append(HandlerUtils.getFieldValue(s,"id"));
                            }else{
                                sb.append(",");
                                sb.append(HandlerUtils.getFieldValue(s,"id"));
                            }
                        } catch (NoSuchFieldException e1) {
                            log.error(e1.toString());
                        } catch (IllegalAccessException e1) {
                            log.error(e1.toString());
                        }
                    });
                    //将前端传入的参数sysid进行覆盖
                    param.put(e.getKey(),sb.toString());
                }
            } catch (ClassNotFoundException e1) {
                log.error(e1.toString());
            } catch (Exception e1) {
                log.error(e1.toString());
            }
        }
        List<?> list= null;
        list = invokingMethod(classPath,param,assignName);
        return list;
    }
    /**
     * 通过指定的查询控件名称从startRunService的fieldsData map中查询指定需要初始化数据的数组
     * @param param
     * @return
     */
    @PostMapping("/fieldHandler")
    public FieldsDefinition obtainFieldsDefinition(@RequestParam Map<String,String> param)throws CloneNotSupportedException{
        String classname=(String) param.get("classname");
        //首字母转换成小写
        String name= com.cros.vue.common.StringUtils.firstCharToLowerCase(classname);
        FieldsDefinition fieldsDefinition=((FieldsDefinition)startRunService.getFieldsData().get(name)).deepClone();
        try {
            //利用反射调用方法获取数据
            reflectInvokingMethod(fieldsDefinition);
            //当参数中存在sysid值时代表是编辑不是新增，需要查询出当前的编辑值
            if(param.containsKey("id")){
                long sysid=Long.valueOf(param.get("id"));
                //读取指定类的read注解标注的方法
                Class<?> zlass=HandlerUtils.obtailClassType(PathUtils.matchServicePackagePath(fieldsDefinition.getZlass()));
                Object[] objects= HandlerUtils.findAnnotationMethod(zlass, Read.class);
                //读取实例反射调用方法
                Object object = applicationContext.getBean(zlass);
                Method method=(Method)objects[0];
                Object result=method.invoke(object,sysid);
                fieldsDefinition.setFieldvalue(result);
            }
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
        return fieldsDefinition;
    }
    @PostMapping("/delHandler")
    public ObjectNode delHandler(@RequestParam Map<String,String> param)throws CloneNotSupportedException{
        String classname=(String) param.get("classname");
        //首字母转换成小写
        String name= StringUtils.lowerCase(classname);
        //由于不需要向前端输出fieldsDefinition，所以不需要克隆
        FieldsDefinition fieldsDefinition=(FieldsDefinition)startRunService.getFieldsData().get(name);
        JsonNodeFactory jsonNodeFactor=JsonNodeFactory.instance;
        ObjectNode objectNode=jsonNodeFactor.objectNode();
        try {
            //当参数中存在sysid值时代表是编辑不是新增，需要查询出当前的编辑值
            if(param.containsKey("sysid")){
                long sysid=Long.valueOf(param.get("sysid"));
                //读取指定类的read注解标注的方法
                Class<?> zlass=HandlerUtils.obtailClassType(PathUtils.matchServicePackagePath(fieldsDefinition.getZlass()));
                Object[] objects= HandlerUtils.findAnnotationMethod(zlass, Delete.class);
                //读取实例反射调用方法
                Object object = applicationContext.getBean(zlass);
                Method method=(Method)objects[0];
                Object result=method.invoke(object,sysid);
                objectNode.put("code","成功");
            }
        } catch (Exception e) {
            log.error(e.getMessage(),e);
            objectNode.put("message",e.getMessage());
        }
        return objectNode;
    }
    /**
     * 调用执行需要调用的反射方法
     * @param elements
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    private void reflectInvokingMethod(ElementFilter elements) throws ClassNotFoundException,IllegalAccessException,InstantiationException,NoSuchMethodException, InvocationTargetException {
        if(elements==null){
            return;
        }
        Iterator<ElementDefinition> it=elements.getSets().iterator();
        while(((Iterator) it).hasNext()) {
            ElementDefinition element=it.next();
            //方法及类都不为空或null时
            if (StringUtils.isNoneBlank(element.getZlass(), element.getMethod())) {
                //判断是否数据已经存在
                if(elements.getMethodData()==null) elements.setMethodData(new ConcurrentHashMap<String, Object>(0));
                if(!elements.getMethodData().containsKey(element.getMethod())) {
                    List<?> list = invokingMethod(element.getZlass(),element.getMethod(),null);
                    //装载数据
                    elements.getMethodData().put(element.getMethod(), list);
                }
            }
            //判断是否filterHandler的filter属性是否存在，存在在加载数据
            if(element.getFilter()!=null){
                reflectInvokingMethod(element.getFilter());
            }
        }
    }
    @PostMapping("/editorHandler")
    public ObjectNode editorHandler(@RequestParam Map<String,String> param) throws Exception{
        //首字母转换成小写
        String classPath=PathUtils.matchServicePackagePath((String)param.get("_class"));
        String assignName=PathUtils.matchEntityPackagePath(param.get("_assign"));
        Long sysid=param.containsKey("sysid")?Long.valueOf(param.get("sysid")):null;
        //通过sysid判断是更新还是插入

        JsonNodeFactory jsonNodeFactory = JsonNodeFactory.instance;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        //try {
            objectNode.put("code",invokingUpdateMethod(classPath,param,assignName));
       // } catch (ClassNotFoundException e) {
           //log.error(e.getMessage(),e);
           // objectNode.put("code",false);
       // }
        return objectNode;
    }

    @PostMapping(value = "exportInfoList")
    public void exportInfoList(@RequestParam Map<String,String> param, HttpServletResponse response) {
        try {
            //根据传入的classname读取对应的filter
            Filter filter=(Filter) startRunService.getFilterData().get((String) param.get("_classname"));
            param.remove("_classname");
            excelService.exportExcel(queryData(param),filter.getCustomQueryHeads(),response);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
    }
    // 定制一个已有异常的HTTP状态码
    @ResponseStatus(value= HttpStatus.NOT_FOUND,reason="请先登录账户!")  // 409
    @ExceptionHandler(BadCredentialsException.class)
    public void conflict() {
        // 啥也不干
    }
    // 指定view来渲染对应的异常
    @ExceptionHandler(Exception.class)
    public ObjectNode databaseError(HttpServletRequest req, Exception ex) {
        JsonNodeFactory jsonNodeFactory = JsonNodeFactory.instance;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        objectNode.put("code",false);
        // 啥也不干，就返回异常页面view的名称
        // 注意这里的view访问不到异常，因为异常没有添加到model中
        return objectNode;
    }
}
