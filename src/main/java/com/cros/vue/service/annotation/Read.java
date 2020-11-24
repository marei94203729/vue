package com.cros.vue.service.annotation;

import java.lang.annotation.*;

/**
 * @author MaLei
 * @description: 用来标识读取实体类数据的方法入口
 * @create 2020/9/11
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface Read {
    String value() default "";
}
