package com.xyl.huangli.service.impl;

import com.xyl.huangli.dao.UserAuthsMapper;
import com.xyl.huangli.pojo.dto.LoginUser;
import com.xyl.huangli.service.UserAuthsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户登录实现类
 */
@Service
public class UserAuthsServiceImpl implements UserAuthsService {
  @Autowired
  private UserAuthsMapper userAuthsMapper;

    //用户登录
    @Override
    public LoginUser findUserInfoByLoginName(String user_name) {
        return userAuthsMapper.selectUserByLoginName(user_name);
    }
}
