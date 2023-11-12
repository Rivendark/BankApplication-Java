package com.bankapplication.application.services;

import com.bankapplication.domain.models.User;

import java.util.List;
import java.util.UUID;

public interface IUserRepository {
    public User createUser(User user);
    public User updateUser(User user);
    public boolean deleteUser(UUID userId);
    public boolean deleteUser(User user);
    public User getUser(UUID userId);
    public List<User> getUsers();
}
