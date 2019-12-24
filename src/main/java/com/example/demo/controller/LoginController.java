package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ligegang
 * @title: LoginController
 * @projectName securityStudy
 * @description: TODO
 * @date 2019/12/24 12:09
 */
@RestController
public class LoginController {

    @RequestMapping("hello")
    public String sayHello(String name){
        return "hello " + name ;
    }

}
