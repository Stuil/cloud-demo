package com.productdemo.controller;

import com.productdemo.aop.ConAop;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @title: TestAopController
 * @description: 测试AOP
 * @date: 2019/12/26
 * @author: Stuil
 * @copyright: Copyright (c) 2019
 * @version:
 */
@RestController
@RequestMapping("/text")
public class TestAopController {
    @RequestMapping("/auto")
    @ConAop
    //@RequestParam("name") String name
    public String auto(HttpServletRequest request){
        System.out.println("auto");
        String s1=request.getParameter("name");
        return "auto+success";
    }
    @RequestMapping("/token")
    public String token(String name){
        System.out.println("token");
        return "token+success";
    }
}
