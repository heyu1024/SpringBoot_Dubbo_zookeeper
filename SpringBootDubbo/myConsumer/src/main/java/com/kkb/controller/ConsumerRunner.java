package com.kkb.controller;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ConsumerRunner {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerRunner.class,args);
    }
}
