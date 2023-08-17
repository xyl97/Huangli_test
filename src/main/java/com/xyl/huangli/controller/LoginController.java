package com.xyl.huangli.controller;


import com.xyl.huangli.pojo.User;
import com.xyl.huangli.pojo.dto.LoginUser;
import com.xyl.huangli.service.UserAuthsService;
import com.xyl.huangli.utlis.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 登录控制器
 */
@RestController
public class LoginController {

    @Autowired
    private UserAuthsService userAuthsService;


    @PostMapping("login")
    public ResponseResult login(HttpSession session, @RequestBody LoginUser loginUser) {
//        loginUser.setUsername(username);
//        loginUser.setPassword(password);
        if (loginUser.getUsername() == null) {
            return ResponseResult.fail("用户名不能为空");

        }
        if (loginUser.getPassword() == null) {
            return ResponseResult.fail("登录密码不能为空");
        }
        LoginUser userInfoByLoginName = userAuthsService.findUserInfoByLoginName(loginUser.getUsername());



        if (userInfoByLoginName == null) {
            return ResponseResult.fail("用户不存在");

        } else {

            boolean bl  = loginUser.getPassword().equals(userInfoByLoginName.getPassword());
            if (!bl) {
                return ResponseResult.fail("用户名密码错误");
            } else {
                User user = new User();
                user.setId(userInfoByLoginName.getId());
                user.setUser_name(userInfoByLoginName.getUsername());

                session.setAttribute("userinfo", user);

                return ResponseResult.success("登录成功");
            }


        }


    }

}
