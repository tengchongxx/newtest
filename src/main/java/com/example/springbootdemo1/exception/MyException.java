package com.example.springbootdemo1.exception;


import static com.example.springbootdemo1.exception.ExceptionEnum.MY_EXCEPTION;

public class MyException extends BaseException {
    public MyException() {
        super(MY_EXCEPTION);
        System.out.println("调Myxecepttion的构造方法");

    }


}
