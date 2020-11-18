package com.example.springbootdemo1.exception;

import lombok.Data;
import lombok.Setter;



/*
* 将代码中会出现的异常通过枚举列出来，若需要新加异常，就增加枚举实现
* */
public enum ExceptionEnum {
    MY_EXCEPTION("001","这是第一种异常"),

    MY_SECOND_EXCEPTION("002","这是第二种异常");


    private final String code;
    private final String message;

    ExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }



    public String getMessage() {
        return message;
    }


}
