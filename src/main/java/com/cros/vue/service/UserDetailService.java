package com.cros.vue.service;

import com.cros.vue.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author MaLei
 * @description: 用户登录服务类,security中用户服务类接口的实现
 * @create 2020/10/21
 */
@Component
public class UserDetailService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    HttpServletRequest request;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //本地数据库读取账户
        UserDetails user = userMapper.selectByName(username);
        if (user == null)
            throw new UsernameNotFoundException("登录账户不存在");
        return user;
    }
}
