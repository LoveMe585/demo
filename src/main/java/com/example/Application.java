package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wulu on 2018/9/11.
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.printf("*******************项目启动开始************************");

        SpringApplication.run(Application.class, args);

        System.out.printf("*******************项目启动结束************************");

    }

}
