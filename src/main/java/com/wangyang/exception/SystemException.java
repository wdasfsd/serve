package com.wangyang.exception;

public class SystemException extends RuntimeException{
    Integer Code;

    public Integer getCode() {
        return Code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        Code = code;
    }

    public SystemException(Integer code,String message, Throwable cause) {
        super(message, cause);
        Code = code;
    }




}
