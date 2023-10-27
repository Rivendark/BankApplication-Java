package com.bankapplication.api.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bankapplication.api.beanconfigs")
@ComponentScan(basePackages = "com.bankapplication.api.controller.register")
@ComponentScan(basePackages = "com.bankapplication.application")
@ComponentScan(basePackages = "com.bankapplication.domain")
@ComponentScan(basePackages = "com.bankapplication.infrastructure")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
