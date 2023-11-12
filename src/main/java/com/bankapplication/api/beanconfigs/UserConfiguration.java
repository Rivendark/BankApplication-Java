package com.bankapplication.api.beanconfigs;

import com.bankapplication.application.boundaries.input.register.IUserRegistryBoundary;
import com.bankapplication.application.interactors.UserInteractor;
import com.bankapplication.application.services.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    public IUserRegistryBoundary userRegistryBoundary(@Autowired IUserRepository userService) {
        return new UserInteractor(userService);
    }
}
