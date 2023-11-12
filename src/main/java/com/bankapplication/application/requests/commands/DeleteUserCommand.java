package com.bankapplication.application.requests.commands;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class DeleteUserCommand {
    @JsonProperty("CorrelationId")
    @NonNull
    private UUID correlationId;
    @JsonProperty("Id")
    @NonNull
    private UUID id;

    public DeleteUserCommand(@NonNull UUID correlationId, @NonNull UUID id) {
        this.correlationId = correlationId;
        this.id = id;
    }

    @NonNull
    public UUID getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(@NonNull UUID correlationId) {
        this.correlationId = correlationId;
    }

    @NonNull
    public UUID getId() {
        return id;
    }

    public void setId(@NonNull UUID id) {
        this.id = id;
    }
}
