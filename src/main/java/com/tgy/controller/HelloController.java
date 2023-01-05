package com.tgy.controller;

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
}
