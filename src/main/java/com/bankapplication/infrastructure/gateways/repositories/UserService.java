package com.bankapplication.infrastructure.gateways.repositories;

import com.bankapplication.application.contexts.IDbContext;
import com.bankapplication.application.services.IUserService;
import com.bankapplication.domain.models.User;
import com.bankapplication.infrastructure.gateways.mapper.UserJpaMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("userService")
public class UserService implements IUserService {

    private final IDbContext context;

    public UserService(IDbContext context) {
        this.context = context;
    }

    public User createUser(User user)
    {
        return populateUserData(context.GetUsers().save(populateUserDbo(user)));
    }

    public User updateUser(User user)
    {
        this.getUser(user.getId());
        return populateUserData(context.GetUsers().save(populateUserDbo(user)));
    }

    public boolean deleteUser(UUID userId)
    {
        context.GetUsers().deleteById(userId);

        return true;
    }

    public boolean deleteUser(User user)
    {
        context.GetUsers().delete(populateUserDbo(user));

        return true;
    }

    public User getUser(UUID userId)
    {
        return populateUserData(context.GetUsers().findById(userId).orElseThrow(() -> new EntityNotFoundException("User not found")));
    }

    private User populateUserData(UserJpaMapper mapper)
    {
        return User.create(mapper.getId(), mapper.getFirstName(), mapper.getLastName(), mapper.getEmail());
    }

    private UserJpaMapper populateUserDbo(User user)
    {
        var mapper = new UserJpaMapper();
        mapper.setId(user.getId());
        mapper.setFirstName(user.getFirstName());
        mapper.setLastName(user.getLastName());
        mapper.setEmail(user.getEmail());

        return mapper;
    }
}
