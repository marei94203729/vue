package com.cros.vue.config.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author MaLei
 * @description: 读取自定义配置
 * @create 2020/6/26
 */
//@Configuration
//引入属性文件，可以同时引入多个
//@PropertySource(value = {"classpath:send.properties"}, ignoreResourceNotFound = false, encoding = "UTF-8")
public class SendConfig {
    //@Value("${local.second}")//读取属性文件中相关配置
    private int second;

    public int getSecond() {
        return second;
    }
}
