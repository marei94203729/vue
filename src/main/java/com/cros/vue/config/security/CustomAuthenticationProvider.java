package com.cros.vue.config.security;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * @author MaLei
 * @description: 自定义的AuthenticationProvider用来实现自定义登录验证
 * 将本类加入spring容器后，会自动加入AuthenticationManagerBuilder 中。无需再WebSecutiryConfig中的下面代码中增加
 * @Override
 *     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
 *         // 加入自定义的安全认证
 *         auth.userDetailsService(this.authUserDetailsService)
 *                 .passwordEncoder(this.passwordEncoder())
 *              .and()
 *                 //添加自定义的认证管理类
 *                 .authenticationProvider(customAuthenticationProvider);
 *     }
 * @create 2020/8/12
 */
@Component
@Slf4j
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    PasswordEncoder md5PasswordEncoder;
    @Autowired
    UserDetailsService userDetailsService;
    @Autowired
    HttpServletRequest request;
    //使用springboot的时间发布器对登录失败进行登录，后台进行监听
    @Autowired
    ApplicationEventPublisher publisher;
    /**
     * 认证处理，返回一个Authentication的实现类则代表认证成功，返回null则代表认证失败
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        if(StringUtils.isBlank(username)){
            throw new UsernameNotFoundException("username用户名不可以为空");
        }
        if(StringUtils.isBlank(password)){
            throw new BadCredentialsException("密码不可以为空");
        }
        //获取用户信息
        UserDetails user = userDetailsService.loadUserByUsername(username);
        //比较前端传入的密码明文和数据库中加密的密码是否相等
        if (!md5PasswordEncoder.matches(password, user.getPassword())) {
            //发布密码不正确事件
            throw new BadCredentialsException("403");
        }
        //顺利登陆发布登陆事件,在监听侧可以实现积分累计、发卡、发券等一些列算法
        //publisher.publishEvent(new AuthenticationEvent(authentication));
        //获取用户权限信息
        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user, password, authorities);

    }

    /**
     * 如果该AuthenticationProvider支持传入的Authentication对象，则返回true
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
