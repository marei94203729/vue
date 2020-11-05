package com.cros.vue.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author MaLei
 * @description: handler.xml中column的包装类
 * @create 2020/8/28
 */
@Data
//将该标记放在属性上，如果该属性为NULL则不参与序列化
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Column implements Comparable<Column>{
    private String sortable;
    private boolean fixed;
    private String label;
    private int width;
    private String prop;
    private boolean tooltip;
    private Boolean element;
    @JsonIgnore
    private int order;
    @Override
    public int compareTo(Column o) {
        return this.order-o.getOrder();
    }
}