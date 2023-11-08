package com.bankapplication.infrastructure.gateways.contexts;

import com.bankapplication.application.boundaries.output.register.IUserRegisterGateway;
import com.bankapplication.application.contexts.IDbContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dbContext")
public class DbContext implements IDbContext {
    public final IUserRegisterGateway Users;

    public DbContext(@Autowired IUserRegisterGateway users)
    {
        this.Users = users;
    }

    @Override
    public IUserRegisterGateway GetUsers() {
        return Users;
    }
}
