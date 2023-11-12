package com.bankapplication.application.boundaries.input.register;

import com.bankapplication.application.requests.commands.CreateUserCommand;
import com.bankapplication.application.requests.commands.DeleteUserCommand;
import com.bankapplication.application.requests.commands.UpdateUserCommand;
import com.bankapplication.application.requests.queries.GetUserQuery;
import com.bankapplication.application.requests.queries.GetUsersQuery;
import com.bankapplication.application.responses.UserResponseModel;

import java.util.List;

public interface IUserRegistryBoundary {
    UserResponseModel create(CreateUserCommand command) throws Exception;
    UserResponseModel update(UpdateUserCommand command) throws Exception;
    void delete(DeleteUserCommand command) throws Exception;
    UserResponseModel get(GetUserQuery query) throws Exception;
    List<UserResponseModel> getUsers(GetUsersQuery query);
}
