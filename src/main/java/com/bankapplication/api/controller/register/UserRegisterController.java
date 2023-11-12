package com.bankapplication.api.controller.register;

import com.bankapplication.application.boundaries.input.register.IUserRegistryBoundary;
import com.bankapplication.application.requests.commands.CreateUserCommand;
import com.bankapplication.application.requests.commands.UpdateUserCommand;
import com.bankapplication.application.requests.queries.GetUserQuery;
import com.bankapplication.application.requests.queries.GetUsersQuery;
import com.bankapplication.application.responses.UserResponseModel;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping
    public UserResponseModel update(@RequestBody @Valid UpdateUserCommand command) throws Exception {
        return this.userRegistryBoundary.update(command);
    }

    @GetMapping
    public UserResponseModel get(@RequestBody @Valid GetUserQuery query) throws Exception {
        return this.userRegistryBoundary.get(query);
    }

    @GetMapping("/api/users")
    public List<UserResponseModel> getUsers(@RequestBody @Valid GetUsersQuery query)
    {
        return this.userRegistryBoundary.getUsers(query);
    }
}
