package com.bankapplication.application.contexts;

import com.bankapplication.application.boundaries.output.register.IUserRegisterGateway;

public interface IDbContext {
    public IUserRegisterGateway GetUsers();
}
