package com.wangyang.exception;

public class BusinessException extends RuntimeException {
    Integer Code;

    public BusinessException(String number) {
    }

    public Integer getCode() {
        return Code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        Code = code;
    }

    public BusinessException(Integer code,String message, Throwable cause) {
        super(message, cause);
        Code = code;
    }
}
