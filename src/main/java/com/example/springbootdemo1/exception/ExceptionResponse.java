package com.example.springbootdemo1.exception;

import lombok.Data;
import org.springframework.stereotype.Component;


import java.security.Timestamp;
import java.util.Date;
@Data
public class ExceptionResponse {
    private String code;
    private String message;
    private Date date;
    private String url;

    public ExceptionResponse(BaseException be,String url) {
        System.out.println("调用ExceptionResponse的构造方法");
        this.url = url;
        this.code=be.getExceptionEnum().getCode();
        this.message=be.getExceptionEnum().getMessage();
        this.date=new Date();
    }
}
