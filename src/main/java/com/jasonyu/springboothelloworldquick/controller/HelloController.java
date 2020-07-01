package com.jasonyu.springboothelloworldquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:spring-boot-helloworld-quick
 * @description:
 * @author:JasonYu
 * @date:2020-06-17 16-57
 **/
//@ResponseBody可加在类首
//@Controller
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!";
    }
}
