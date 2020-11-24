package com.cros.vue.service.annotation;

import java.lang.annotation.*;

/**
 * Filter包装类中定义的执行方法入库注解
 * 该注解需要定义在Filter包装类zlass字段所对应的实例上的方法
 * 该方法按照<columnset></columnset>标签定义的column的顺序输出
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface Execute {
    String value() default "";
}
