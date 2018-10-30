package com.liu.interceptor.practise.interceptor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/get")
    public String get(){
        System.out.println("hello world!");
        return "hello world ";
    }


}
