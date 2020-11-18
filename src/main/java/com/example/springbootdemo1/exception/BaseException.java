package com.example.springbootdemo1.exception;

public class BaseException extends RuntimeException {
    private ExceptionEnum exceptionEnum;
    public BaseException(ExceptionEnum ee){
        System.out.println("调BaseExecepttion的构造方法");
        System.out.println(ee);
        System.out.println(ee.getCode());
        this.exceptionEnum=ee;
    }

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }
}
