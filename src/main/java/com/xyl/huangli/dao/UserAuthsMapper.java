package com.xyl.huangli.dao;


import com.xyl.huangli.pojo.dto.LoginUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登录mapper接口
 */
@Mapper
public interface UserAuthsMapper {

    //用户登录
    LoginUser selectUserByLoginName(String user_name);
}
