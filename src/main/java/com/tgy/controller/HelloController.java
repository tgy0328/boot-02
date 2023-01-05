package com.tgy.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
    public String helloTest(@PathVariable("username") String username) {

        System.out.println("你好：" + username);
        System.out.println("hello git");
        System.out.println("master test");
        System.out.println("hot-fix test!");
        System.out.println("push test");
        return "你好：" + username;
    }
    @RequestMapping("/test")
    public Map<String,Object> testParam(@RequestParam("age") Integer age,
                                        @RequestParam("name") String name,
                                        @RequestParam  Map<String,String> pv){
        Map<String,Object> map=new HashMap<>();
        map.put("age",age);
        map.put("name",name);
        map.put("pv",pv);
        return map;
    }
}
