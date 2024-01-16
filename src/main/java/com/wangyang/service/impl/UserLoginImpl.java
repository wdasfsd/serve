package com.wangyang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.wangyang.dao.UserDao;
import com.wangyang.domain.LoginInfo;
import com.wangyang.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;

@Service
public class UserLoginImpl implements UserLoginService {
    @Autowired
    UserDao userDao;


    @Override
    public boolean SelectUser(LoginInfo loginInfo) {
        QueryWrapper<LoginInfo> loginInfoQueryWrapper = new QueryWrapper<>();
        loginInfoQueryWrapper.eq("username",loginInfo.getUsername()).eq("password",loginInfo.getPassword());
        LoginInfo DBuser = userDao.selectOne(loginInfoQueryWrapper);//查询数据库看用户是否存在
        if(DBuser!=null){
            return true;
        }
        return false;
    }

    @Override
    public LoginInfo SelectByname(String name) {
        QueryWrapper<LoginInfo> loginInfoQueryWrapper = new QueryWrapper<>();
        loginInfoQueryWrapper.eq("username",name);
        LoginInfo loginInfo = userDao.selectOne(loginInfoQueryWrapper);
        return loginInfo;
    }
}
