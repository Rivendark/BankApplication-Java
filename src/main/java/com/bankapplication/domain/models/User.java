package com.bankapplication.domain.models;

import java.util.UUID;

public class User {
    private final UUID Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private User(UUID id, String firstName, String lastName, String email) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }

    public static User create(UUID id, String firstName, String lastName, String email)
    {
        return new User(id, firstName, lastName, email);
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        Email = email;
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
