package com.cros.vue.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * @description Cros拦截器
 * @author hjj
 * @createTime 2020/10/18
 */
@Component
public class CrosInterceptor implements HandlerInterceptor {
    //在controller之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;//返回true放行 返回falser 拦截
    }
    //在controller执行之后，跳转页面之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //配置cookie
        //获取cookie
        Cookie[] cookies = request.getCookies();
        boolean flag=false;
        for (Cookie c:cookies){
            if(c.getName().equals("JSESSIONID")){
                flag=true;
            }
        }
        if(flag==false) {
            //设置cookie
            Cookie cookie = new Cookie("JSESSIONID", request.getSession().getId());
            cookie.setPath("/");
            response.addCookie(cookie);
        }
    }
    //所有操作完毕之后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
