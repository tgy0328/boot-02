package com.tgy.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tgy
 * @date 2023/1/4 9:04
 */
@RestController
public class HelloController {

    @RequestMapping("/bug.jpg")
    public String hello(){
        return "aaa";
    }

    @RequestMapping("/hello/{username}")
    public String helloTest(@PathVariable("username") String username){

        System.out.println("你好："+username);
        return "你好："+username;

    }
}
