package com.cros.vue;

import com.cros.vue.filter.CookieFilter;
import com.cros.vue.interceptor.CrosInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * @description 配置文件
 * @author hjj
 * @createTime 2020/10/18
 */
//@Configuration
public class configation implements WebMvcConfigurer {
    @Autowired
    CrosInterceptor crosInterceptor;
    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加自定义拦截器
        registry.addInterceptor(crosInterceptor)
            //拦截器拦截那些路径
                .addPathPatterns("/apis/home");
        //不拦截的路径
        // .excludePathPatterns("");
    }
}
