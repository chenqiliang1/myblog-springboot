package com.cql.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author 陈琪亮
 * @version 1.0
 * @date 2020/8/7 17:39
 */
@RestController//两个作用 1：表明当前是个controller 2，代替注解ResponseBody，对象转化为json字符串
public class helloController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
