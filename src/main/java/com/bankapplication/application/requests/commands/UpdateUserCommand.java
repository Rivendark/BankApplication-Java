package com.bankapplication.application.requests.commands;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class UpdateUserCommand {
    @JsonProperty("CorrelationId")
    @NonNull
    private UUID correlationId;
    @JsonProperty("Id")
    @NonNull
    private UUID id;
    @JsonProperty("FirstName")
    @NonNull
    @Size(min = 2, max = 255)
    private String firstName;
    @JsonProperty("LastName")
    @NonNull
    @Size(min = 2, max = 255)
    private String lastName;
    @JsonProperty("Email")
    @Email
    private String email;

    public UpdateUserCommand(@NonNull UUID correlationId, @NonNull UUID id, @NonNull String firstName, @NonNull String lastName, String email) {
        this.correlationId = correlationId;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @NonNull
    public UUID getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(@NonNull UUID correlationId) { this.correlationId = correlationId; }

    @NonNull
    public UUID getId() { return id; }

    public void setId(@NonNull UUID id) { this.id = id; }

    @NonNull
    public String getFirstName() { return firstName; }

    public void setFirstName(@NonNull String firstName) { this.firstName = firstName; }

    @NonNull
    public String getLastName() { return lastName; }

    public void setLastName(@NonNull String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}
