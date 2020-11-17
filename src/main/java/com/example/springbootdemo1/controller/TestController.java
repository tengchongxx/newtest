package com.example.springbootdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
      System.out.println("remember this");
      return "failure is mama of success";
    }

}
