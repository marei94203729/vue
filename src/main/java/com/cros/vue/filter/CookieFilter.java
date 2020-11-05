package com.cros.vue.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @description cookie过滤器
 * @author hjj
 * @createTime 2020/10/18
 */
//@WebFilter(urlPatterns = "/apis/home", filterName = "reqResFilter")
//@Component
public class CookieFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //定义可访问域名数组
       /* String[] allowAccessUrl={"http://localhost:8080","http://localhost:8082"};
        Set<String> sets=new HashSet<>(Arrays.asList(allowAccessUrl));
        String origin=((HttpServletRequest)servletRequest).getHeader("Origin");
        if(origin!=null&&sets.contains(origin)) {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            //response.setHeader("Access-Control-Allow-Headers", "*");
            response.setHeader("Access-Control-Allow-Origin", origin);
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,HEAD,PATCH");
            response.setHeader("Access-Control-Max-Age", "1728000l");
            response.setHeader("Access-Control-Allow-Headers", "content-type,token");
            response.setHeader("Access-Control-Allow-Credentials", "true");
            //允许加入的自定义响应头
            response.setHeader("Access-Control-Expose-Headers", "token");
            response.addHeader("token", "token123456abc");
        }*/
        //((HttpServletResponse)servletResponse).addHeader("token","token123456abc");
        filterChain.doFilter(servletRequest,servletResponse);
        //((HttpServletResponse)servletResponse).addHeader("token","token123456abc");
        //配置cookie
        //获取cookie
       /* Cookie[] cookies = ((HttpServletRequest)servletRequest).getCookies();
        boolean flag=false;
        if(cookies!=null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("JSESSIONID")) {
                    flag = true;
                }
            }
        }*/
       /* if(flag==false) {
            //设置cookie
            Cookie cookie = new Cookie("JSESSIONID", ((HttpServletRequest)servletRequest).getSession().getId());
            cookie.setPath("/");
            ((HttpServletResponse)servletResponse).addCookie(cookie);
        }*/
    }

    @Override
    public void destroy() {

    }
}
