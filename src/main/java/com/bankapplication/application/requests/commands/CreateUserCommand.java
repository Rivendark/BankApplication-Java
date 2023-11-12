package com.bankapplication.application.requests.commands;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserCommand {
    @JsonProperty("CorrelationId")
    @NonNull
    private UUID correlationId;
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

    public CreateUserCommand(@NonNull UUID correlationId, @NonNull String firstName, @NonNull String lastName, String email) {
        this.correlationId = correlationId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @NonNull
    public UUID getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(@NonNull UUID correlationId) {
        this.correlationId = correlationId;
    }

    @NonNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NonNull String firstName) {
        this.firstName = firstName;
    }

    @NonNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@NonNull String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
