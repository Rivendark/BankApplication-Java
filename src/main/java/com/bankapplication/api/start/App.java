package com.bankapplication.api.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.bankapplication.application.boundaries.output.register")
@EntityScan("com.bankapplication.infrastructure.gateways.mapper")
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
