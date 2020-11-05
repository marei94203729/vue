package com.cros.vue.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Set;

/**
 * @author MaLei
 * @description: handle配置文件中field包装类
 * @create 2020/9/7
 */
@Data
//将该标记放在属性上，如果该属性为NULL则不参与序列化
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldDefinition implements Comparable<FieldDefinition>,ElementDefinition{
    //忽略json输出该字段
    @JsonIgnore
    private int order;
    private String name;
    private String label;
    private boolean require;
    private String tag;
    private String note;
    @Override
    public int compareTo(FieldDefinition o) {
        return this.order-o.getOrder();
    }
    @JsonIgnore
    private String zlass;
    private String method;
    private String size;

    @Override
    public ElementFilter getFilter() {
        return null;
    }
}
