package com.cros.vue.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Set;

/**
 * @author MaLei
 * @description: 查询条件包装类
 * @create 2020/8/21
 */
@Data
//将该标记放在属性上，如果该属性为NULL则不参与序列化
@JsonInclude(JsonInclude.Include.NON_NULL)
//需要忽略某些字段的bean上添加
//@JsonFilter("order")
public class FilterHandler implements Comparable<FilterHandler>,ElementDefinition {
    //忽略json输出该字段
    @JsonIgnore
    private int order;
    private String name;
    private String label;
    @JsonIgnore
    private boolean enable;
    private String tag;
    private Filter filter;
    @Override
    public int compareTo(FilterHandler o) {
        return this.order-o.getOrder();
    }
    @JsonIgnore
    private String zlass;
    private String method;
    private String size;
    private Set<Column> customQueryHeads;
}
