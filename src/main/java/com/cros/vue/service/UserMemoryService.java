package com.cros.vue.service;

import com.cros.vue.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author MaLei
 * @description: 用户账户存储Redis中操作服务类
 * @create 2020/10/23
 */
@Service
public class UserMemoryService {
    @Autowired
    RedisService redisService;

    /**
     * 从redis中检索指定用户名的登录账户
     * @param username
     * @return
     */
    public User getUserFromRedis(String username){
        User user=null;
        //判断是否存在账户于redis中
        if(redisService.exists(username)){
            user=(User) redisService.get(username);
        }
        return user;
    }

    /**
     * 向redis中配置指定用户名的登录账户
     * 有效期为12小时
     * @param user
     */
    public void setUserFromRedis(User user){
        //设置登录账户有效期12小时，如果存在记录直接覆盖
        redisService.set(user.getUsername(), user, 43200l);
    }
}
