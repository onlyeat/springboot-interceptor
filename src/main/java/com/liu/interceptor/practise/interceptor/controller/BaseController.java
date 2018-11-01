package com.liu.interceptor.practise.interceptor.controller;

import com.liu.interceptor.practise.interceptor.mode.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/get")
    public String get(){
        System.out.println("hello world!");
        return "hello world ";
    }

    @RequestMapping("/get2")
    public Order get2(){
         Order order = new Order();
         order.setOrderId(123L);
         order.setOrderName("liuq1");
        return order;
    }


}
