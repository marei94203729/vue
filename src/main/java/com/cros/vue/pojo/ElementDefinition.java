package com.cros.vue.pojo;

/**
 * @author MaLei
 * @description: 配置文件读取后用来定义基础元素需要调用执行数据的方法和类的接口
 * @create 2020/9/7
 */
public interface ElementDefinition {
    /**
     * 获取配置文件中class
     * @return
     */
    String getZlass();

    /**
     * 获取配置文件中method
     * @return
     */
    String getMethod();
    ElementFilter getFilter();
}
