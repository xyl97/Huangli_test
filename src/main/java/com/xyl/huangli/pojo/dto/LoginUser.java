package com.xyl.huangli.pojo.dto;

import lombok.Data;

/**
 * 登录实体类
 */
@Data
public class LoginUser {

    //登录用户id
    private int id;

    //登录用户姓名
    private String username;

    //登录用户密码
    private String password;
}
