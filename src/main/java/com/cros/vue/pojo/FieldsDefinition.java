package com.cros.vue.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;
import java.util.Set;

/**
 * @author MaLei
 * @description: handle配置文件中fields包装类
 * @create 2020/9/7
 */
@Data
//将该标记放在属性上，如果该属性为NULL则不参与序列化
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldsDefinition implements ElementFilter,Cloneable{
    /**
     * 实例所要查询输出数据对应类名(第一层查询界面使用)
     */
    private String zlass;
    /**
     * 实例所要查询输出数据对应类名(子查询控件使用)
     */
    private String assign;
    /**
     * 控件数据
     */
    private Set<ElementDefinition> sets;


    /**
     * 装载方法数据
     */
    private Map<String,Object> methodData;
    /**
     * 装载字段值
     */
    private Object fieldvalue;

    /**
     * 此处实现克隆方法，需要注意前度克隆，克隆体的基础值属性改变不影响被克隆原对象的基础值属性，但是克隆体的引用类型属性改变会
     * 影响被克隆对象的引用类型属性的值。比如数组、类等引用类型属性。深度克隆就是将所有引用类型也进行二次克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        FieldsDefinition fd=(FieldsDefinition)super.clone();
        fd.setFieldvalue(null);
        return fd;
    }

    /**
     * 克隆对象，将Fieldvalue字段设置为null，因为Fieldvalue字段是每个线程都不同的
     * @return
     */
    public FieldsDefinition deepClone()throws CloneNotSupportedException{
        return (FieldsDefinition)this.clone();
    }
}
