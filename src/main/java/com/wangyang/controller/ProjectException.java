package com.wangyang.controller;

import com.wangyang.exception.BusinessException;
import com.wangyang.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectException {

    //未知异常
    @ExceptionHandler(Exception.class)
    public Result DoException(Exception ex){
        System.out.println(ex);
        return new Result(666,null,"系统繁忙，请稍后再试");
    }

    //系统异常
    @ExceptionHandler(SystemException.class)
    public Result DoRunException(SystemException exception){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        return new Result(exception.getCode(),null, exception.getMessage());
    }

    //用户异常
    @ExceptionHandler(BusinessException.class)
    public Result DoBusinessException(BusinessException exception){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        return new Result(exception.getCode(),null, exception.getMessage());
    }
}
