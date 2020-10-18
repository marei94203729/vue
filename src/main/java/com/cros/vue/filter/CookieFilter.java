package com.cros.vue.filter;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * @description cookie过滤器
 * @author hjj
 * @createTime 2020/10/18
 */
//@WebFilter(urlPatterns = "/apis/home", filterName = "reqResFilter")
public class CookieFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        //配置cookie
        //获取cookie
        Cookie[] cookies = ((HttpServletRequest)servletRequest).getCookies();
        boolean flag=false;
        for (Cookie c:cookies){
            if(c.getName().equals("JSESSIONID")){
                flag=true;
            }
        }
        if(flag==false) {
            //设置cookie
            Cookie cookie = new Cookie("JSESSIONID", ((HttpServletRequest)servletRequest).getSession().getId());
            cookie.setPath("/");
            ((HttpServletResponse)servletResponse).addCookie(cookie);
        }
    }

    @Override
    public void destroy() {

    }
}
