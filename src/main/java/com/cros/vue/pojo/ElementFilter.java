package com.cros.vue.pojo;

import java.util.Map;
import java.util.Set;

/**
 * @author MaLei
 * @description: 用来定义外层包装类统一行为的接口，本接口定义了getMethodData方法
 * @create 2020/9/7
 */
public interface ElementFilter {
    /**
     * 获取当前子包装类中select控件需要提前序列化的数据
     * @return
     */
    Map<String,Object> getMethodData();
    Set<ElementDefinition> getSets();
    void setMethodData(Map<String,Object> set);
}
