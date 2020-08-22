package com.productdemo.controller.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: AppController
 * @description: 测试普通AOP
 * @date: 2019/12/26
 * @author: zwh
 * @copyright: Copyright (c) 2019
 * @version:
 */
@RestController
@RequestMapping("/app")
public class AppController {
    @RequestMapping("/apps")
    public String apps(String name){
        System.out.println("token");
        return "app+success";
    }
}
