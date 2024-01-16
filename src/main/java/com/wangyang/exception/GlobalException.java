package com.wangyang.exception;

import com.wangyang.controller.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Result BusinessException(BusinessException e){
        return new Result(e.Code);
    }
}
