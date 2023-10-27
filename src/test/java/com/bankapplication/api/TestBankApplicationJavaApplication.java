package com.bankapplication.api;

import com.bankapplication.api.start.App;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestBankApplicationJavaApplication {

    public static void main(String[] args) {
        SpringApplication.from(App::main).with(TestBankApplicationJavaApplication.class).run(args);
    }

}
