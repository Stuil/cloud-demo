package com.consumerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: Indexontroller
 * @description:
 * @date: 2020/8/22
 * @author: zwh
 * @copyright: Copyright (c) 2020
 * @version:
 */
@RestController
public class Indexontroller {
    @RequestMapping("/index")
    public String index(){
        return "8012";
    }
}
