package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wulu on 2018/9/11.
 */

@RestController
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/")
    public String home(){

        return "Hello world";
    }

}
