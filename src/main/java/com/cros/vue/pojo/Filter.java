package com.cros.vue.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.*;

/**
 * @author MaLei
 * @description: Filter包装类
 * @create 2020/8/21
 */
@Data
//将该标记放在属性上，如果该属性为NULL则不参与序列化
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Filter implements ElementFilter {
    /**
     * 实例所要查询输出数据对应类名(第一层查询界面使用)
     */
    protected String zlass;
    /**
     * 实例所要查询输出数据对应类名(子查询控件使用)
     */
    protected String assign;
    /**
     * 非日期控件数据
     */
    protected Set<ElementDefinition> sets;
    /**
     * 日期控件数据
     */
    private Set<com.byky.dbms.pojo.FilterHandler> dates;
    /**
     * 装载方法数据
     */
    protected Map<String,Object> methodData;
    private Set<Column> customQueryHeads;
}
