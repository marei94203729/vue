package com.cros.vue.service.annotation;

import java.lang.annotation.*;

/**
 * @author MaLei
 * @description: 用来标识编辑实体类的方法入口
 * @create 2020/9/8
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface Editor {
    String value() default "";
}
