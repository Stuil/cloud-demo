package com.productdemo.webSocket;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title: WevbSocketController
 * @description:
 * @date: 2020/12/23
 * @author: stuil
 * @copyright: Copyright (c) 2020
 * @version: 1.0
 */
@Controller
public class WevbSocketController {
    @RequestMapping("/websocket/{name}")
    public String webSocket(@PathVariable String name, Model model){
        try{
            model.addAttribute("username",name);
            return "index";
        }
        catch (Exception e){
            return "error";
        }
    }
}
