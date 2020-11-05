package com.cros.vue.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @description Cros拦截器
 * @author hjj
 * @createTime 2020/10/18
 */
@Component
@Slf4j
public class CrosInterceptor implements HandlerInterceptor {
    //在controller之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String[] allowAccessUrl={"http://localhost:8080","http://localhost:8082"};
        Set<String> sets=new HashSet<>(Arrays.asList(allowAccessUrl));
        String origin=request.getHeader("Origin");
        //String token=request.getHeader("token");
        if(origin!=null&&sets.contains(origin)) {
            response.setHeader("Access-Control-Allow-Origin", origin);
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,HEAD,PATCH");
            response.setHeader("Access-Control-Max-Age", "1728000l");
            //response.setHeader("Access-Control-Allow-Headers", "*");
            response.setHeader("Access-Control-Allow-Headers", "content-type,Authorization,token");
            response.setHeader("Access-Control-Allow-Credentials", "true");
            //允许加入的自定义响应头
            response.setHeader("Access-Control-Expose-Headers", "token");
           // response.addHeader("token", "token123456abc");
        }
        return true;//返回true放行 返回falser 拦截
    }
    //在controller执行之后，跳转页面之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
    //所有操作完毕之后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
