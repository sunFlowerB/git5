package com.youzhong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.youzhong.dao")
public class Git5Application {
    public static void main(String[] args) {
        SpringApplication.run(Git5Application.class,args);
    }
}
