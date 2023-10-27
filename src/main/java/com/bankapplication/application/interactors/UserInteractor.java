package com.bankapplication.application.interactors;

import com.bankapplication.application.boundaries.input.register.IUserRegistryBoundary;
import com.bankapplication.application.requests.commands.CreateUserCommand;
import com.bankapplication.application.requests.commands.UpdateUserCommand;
import com.bankapplication.application.responses.UserResponseModel;

import java.util.UUID;

public class UserInteractor implements IUserRegistryBoundary {

    public UserInteractor()
    {

    }

    @Override
    public UserResponseModel create(CreateUserCommand command) throws Exception {
        return new UserResponseModel(
                command.getCorrelationId(),
                UUID.randomUUID(),
                command.getFirstName(),
                command.getLastName(),
                command.getEmail()
        );
    }

    @Override
    public UserResponseModel update(UpdateUserCommand command) throws Exception {
        return null;
    }
}
