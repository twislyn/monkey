package com.google.style.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangz
 * @date 2018/1/30 16:21
 *  登录实现
 **/
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "";
    }
}
