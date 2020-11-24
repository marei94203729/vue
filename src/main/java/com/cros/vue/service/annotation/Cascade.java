package com.cros.vue.service.annotation;

import java.lang.annotation.*;

/**
 * @author MaLei
 * @description: 数据库orm实体字段所对应的实体类名称，可以使全路径名称也可以是简写名称
 * @create 2020/9/4
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface Cascade {
    /**
     * 指定要调用哪个类
     * @return
     */
    String value() default "";

    /**
     * 指定调用上面指定类中的某个方法
     * @return
     */
    String method();

    /**
     * 方法返回参数类类型
     * @return
     */
    Class<?> argsType();

    /**
     * 指定实体类型
     * @return
     */
    Class<?> assign();
}
