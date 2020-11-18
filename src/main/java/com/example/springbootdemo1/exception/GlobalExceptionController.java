package com.example.springbootdemo1.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
@RestController
public class GlobalExceptionController {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ExceptionResponse> handleMyException(BaseException be, HttpServletRequest req) {
        System.out.println(be);
        ExceptionResponse exceptionResponse = new ExceptionResponse(be,req.getRequestURI());
        log.info("以下是异常信息在日志中输出");
        System.out.println(exceptionResponse);
        return ResponseEntity.ok(exceptionResponse);

    }
}
