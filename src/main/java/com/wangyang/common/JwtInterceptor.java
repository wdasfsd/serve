package com.wangyang.common;


import cn.hutool.core.util.StrUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.wangyang.domain.LoginInfo;
import com.wangyang.exception.BusinessException;
import com.wangyang.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class JwtInterceptor implements HandlerInterceptor {
    @Autowired
    UserLoginService userLogin;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String token=request.getHeader("token");//在header里面传过来的参数
        if(StrUtil.isBlank(token)){
            token=request.getParameter("token");//url参数
        }
        //执行认证
        if(StrUtil.isBlank(token)){
            throw new BusinessException("没找到token");
        }
        //获取token中的username
        String username;
        try{
            username = JWT.decode(token).getAudience().get(0);//通过token获取username
        }catch (JWTDecodeException jwtDecodeException){
            throw new BusinessException("没有获取到名字");
        }
        //根据token中的userid查询数据库
        LoginInfo loginInfo = userLogin.SelectByname(username);
        if(loginInfo == null){
            throw new BusinessException("数据库中没找到名字");
        }
        //通过用户名密码加密后生成一个验证器
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(loginInfo.getPassword())).build();
        try{
            jwtVerifier.verify(token);//验证token
        }catch (JWTVerificationException e){
            throw new BusinessException("token验证失败");
        }
        return true;
    }
}
