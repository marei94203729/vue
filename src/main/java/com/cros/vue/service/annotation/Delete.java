package com.cros.vue.service.annotation;

import java.lang.annotation.*;

/**
 * @author MaLei
 * @description: 用来标识删除实体类的方法入口
 * @create 2020/9/14
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface Delete {
    String value() default "";
}
