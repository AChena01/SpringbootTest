package com.springtest.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘怡琛
 * @version 1.0
 * @description: TODO
 * @date 2023/10/8 15:18
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello Spring Boot!";
    }
}
