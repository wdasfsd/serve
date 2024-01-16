package com.wangyang.controller;
import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.baomidou.mybatisplus.extension.api.R;
import com.wangyang.domain.LoginInfo;
import com.wangyang.exception.BusinessException;
import com.wangyang.service.impl.UserLoginImpl;
import com.wangyang.utlis.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;

@RestController
@RequestMapping("/api/user")
public class User {
    @Autowired
    UserLoginImpl userLogin;

    @PostMapping("/login")
    public Result login(@RequestBody LoginInfo loginInfo){
        if(userLogin.SelectUser(loginInfo)){//登录成功
            loginInfo.setToken(TokenUtils.genToken(loginInfo.getUsername(),loginInfo.getPassword()));//设置token
            return new Result(20000,loginInfo);
        }else {//登录失败
            return new Result(50000,null,"用户名密码错误");
        }
    }
    @GetMapping("/info")
    public Result userinfo(String token){
        String username;
        try{
            username = JWT.decode(token).getAudience().get(0);//通过token获取username
        }catch (JWTDecodeException jwtDecodeException){
            throw new BusinessException("没有获取到名字");
        }
        LoginInfo loginInfo = userLogin.SelectByname(username);
        loginInfo.setRoles(new String[]{loginInfo.getRole()});
        if(loginInfo!=null){
            return new Result(20000,loginInfo);
        }else {
            return new Result(50000,null,"用户名密码错误");
        }

    }
    @PostMapping("/logout")
    public Result UserLogout(){
        return new Result(20000);
    }
}
