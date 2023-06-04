package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    private final String prefix = "test/";

    // 返回json数据
    @PostMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

    // 返回一个页面
    @GetMapping("/hello")
    public String hello(){
        return prefix + "hello";
    }

    @GetMapping("/hello1")
    public String hello1(){
        return prefix + "hello1";
    }

}
