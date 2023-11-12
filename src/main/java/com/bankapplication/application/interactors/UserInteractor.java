package com.bankapplication.application.interactors;

import com.bankapplication.application.boundaries.input.register.IUserRegistryBoundary;
import com.bankapplication.application.requests.commands.CreateUserCommand;
import com.bankapplication.application.requests.commands.DeleteUserCommand;
import com.bankapplication.application.requests.commands.UpdateUserCommand;
import com.bankapplication.application.requests.queries.GetUserQuery;
import com.bankapplication.application.requests.queries.GetUsersQuery;
import com.bankapplication.application.responses.UserResponseModel;
import com.bankapplication.application.services.IUserRepository;
import com.bankapplication.domain.models.User;

import java.util.*;
import java.util.stream.Collectors;

public class UserInteractor implements IUserRegistryBoundary {

    private final IUserRepository userService;

    public UserInteractor(IUserRepository userService) {

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
        User user = this.userService.updateUser(User.create(
                command.getId(),
                command.getFirstName(),
                command.getLastName(),
                command.getEmail()
        ));

        return new UserResponseModel(user, command.getCorrelationId());
    }

    @Override
    public void delete(DeleteUserCommand command) throws Exception {
        this.userService.deleteUser(command.getId());
    }

    @Override
    public UserResponseModel get(GetUserQuery query) throws Exception {
        var user =  this.userService.getUser(query.getId());
        return new UserResponseModel(user, query.getCorrelationId());
    }

    @Override
    public List<UserResponseModel> getUsers(GetUsersQuery query)
    {
        return this.userService
                .getUsers()
                .stream()
                .map(x -> new UserResponseModel(x, query.getCorrelationId()))
                .collect(Collectors.toList());
    }
}
