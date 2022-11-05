package com.calwen.template.service;

import com.calwen.template.entity.UserEntity;
import com.calwen.template.request.UserRequest;

/**
 * @author calwen
 * @since 2022/10/28
 */
public interface AuthService {
    /**
     * 登录
     *
     * @return 令牌
     */
    String login(UserRequest request);

    /**
     * 注册
     *
     * @return 令牌
     */
    String register(UserRequest request);

    Integer getUserId();

    UserEntity getUser();

    boolean removeToken();

    String saveToken(Integer uid, String userType, int hour);

    String createToken(Integer uid);

    boolean verifyToken();

    Long getExpireTime();

    void renew(Integer hour);


}
