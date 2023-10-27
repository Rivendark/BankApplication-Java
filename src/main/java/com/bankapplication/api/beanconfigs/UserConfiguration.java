package com.bankapplication.api.beanconfigs;

import com.bankapplication.application.boundaries.input.register.IUserRegistryBoundary;
import com.bankapplication.application.interactors.UserInteractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    public IUserRegistryBoundary userRegistryBoundary() {
        return new UserInteractor();
    }
}
