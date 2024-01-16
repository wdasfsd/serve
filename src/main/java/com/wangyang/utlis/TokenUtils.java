package com.wangyang.utlis;
import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

public class TokenUtils {


    /*生成token*/
    public static String genToken(String username,String sign){
        return JWT.create().withAudience(username)//将username保存到 token里面作为荷载
                .withExpiresAt(DateUtil.offsetHour(new Date(),2))//2小时后token过期
                .sign(Algorithm.HMAC256(sign));//以password作为token的密钥

    }



}
