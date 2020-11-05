package com.cros.vue.config.security;

import org.springframework.security.core.AuthenticationException;

/**
 * @author MaLei
 * @description: 验证码错误异常
 * @create 2020/8/12
 */
public class CaptchaErrorException  extends AuthenticationException {
    public CaptchaErrorException(String msg) {
        super(msg);
    }

    public CaptchaErrorException(String msg, Throwable t) {
        super(msg, t);
    }
}
