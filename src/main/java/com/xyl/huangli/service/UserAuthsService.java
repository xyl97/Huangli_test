package com.xyl.huangli.service;

import com.xyl.huangli.pojo.dto.LoginUser;
import org.springframework.stereotype.Service;

/**
 * 用户登录service接口
 */
@Service
public interface UserAuthsService {

    //用户登录
    LoginUser findUserInfoByLoginName(String user_name);
}
