package com.bankapplication.domain.models;

import java.util.UUID;

public class User {
    private final UUID CorrelationId;
    private final UUID Id;
    private final String FirstName;
    private final String LastName;
    private final String Email;

    private User(UUID correlationId, UUID id, String firstName, String lastName, String email) {
        CorrelationId = correlationId;
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }

    public User create(UUID correlationId, UUID id, String firstName, String lastName, String email)
    {
        return new User(correlationId, id, firstName, lastName, email);
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
