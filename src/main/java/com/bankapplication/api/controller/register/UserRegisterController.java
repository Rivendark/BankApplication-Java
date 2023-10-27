package com.bankapplication.api.controller.register;

import com.bankapplication.application.boundaries.input.register.IUserRegistryBoundary;
import com.bankapplication.application.requests.commands.CreateUserCommand;
import com.bankapplication.application.responses.UserResponseModel;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/user")
public class UserRegisterController {

    IUserRegistryBoundary userRegistryBoundary;

    public UserRegisterController(IUserRegistryBoundary userRegistryBoundary) {
        this.userRegistryBoundary = userRegistryBoundary;
    }

    @PostMapping
    public UserResponseModel create(@RequestBody @Valid CreateUserCommand command) throws Exception {
        return this.userRegistryBoundary.create(command);
    }
}
