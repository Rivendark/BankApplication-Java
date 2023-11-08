package com.bankapplication.application.interactors;

import com.bankapplication.application.boundaries.input.register.IUserRegistryBoundary;
import com.bankapplication.application.requests.commands.CreateUserCommand;
import com.bankapplication.application.requests.commands.UpdateUserCommand;
import com.bankapplication.application.responses.UserResponseModel;
import com.bankapplication.application.services.IUserService;
import com.bankapplication.domain.models.User;

import java.util.UUID;

public class UserInteractor implements IUserRegistryBoundary {

    private final IUserService userService;

    public UserInteractor(IUserService userService)
    {

        this.userService = userService;
    }

    @Override
    public UserResponseModel create(CreateUserCommand command) throws Exception {
        User user = this.userService.createUser(User.create(
                UUID.randomUUID(),
                command.getFirstName(),
                command.getLastName(),
                command.getEmail()
        ));

        return new UserResponseModel(user, command.getCorrelationId());
    }

    @Override
    public UserResponseModel update(UpdateUserCommand command) throws Exception {
        return null;
    }
}
