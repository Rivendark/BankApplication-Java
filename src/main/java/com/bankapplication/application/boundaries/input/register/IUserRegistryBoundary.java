package com.bankapplication.application.boundaries.input.register;

import com.bankapplication.application.requests.commands.CreateUserCommand;
import com.bankapplication.application.requests.commands.UpdateUserCommand;
import com.bankapplication.application.responses.UserResponseModel;

public interface IUserRegistryBoundary {
    public UserResponseModel create(CreateUserCommand command) throws Exception;
    public UserResponseModel update(UpdateUserCommand command) throws Exception;
}
