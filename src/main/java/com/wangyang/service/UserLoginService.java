package com.wangyang.service;

import com.wangyang.domain.LoginInfo;

public interface UserLoginService {
    /*
    * 根据用户名和密码进行查询
    * */
    boolean SelectUser(LoginInfo loginInfo);
    LoginInfo SelectByname(String name);
}
