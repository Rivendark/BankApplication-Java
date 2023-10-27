package com.bankapplication.application.responses;

import com.bankapplication.domain.models.User;

import java.util.UUID;

public class UserResponseModel {
    private final UUID CorrelationId;
    private final UUID Id;
    private final String FirstName;
    private final String LastName;
    private final String Email;

    public UserResponseModel(UUID correlationId, UUID id, String firstName, String lastName, String email)
    {
        CorrelationId = correlationId;
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }

    public UserResponseModel(User user, UUID correlationId)
    {
        CorrelationId = correlationId;
        Id = user.getId();
        FirstName = user.getFirstName();
        LastName = user.getLastName();
        Email = user.getEmail();
    }

    public UUID getCorrelationId() {
        return CorrelationId;
    }

    public UUID getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }
}
