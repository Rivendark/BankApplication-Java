package com.bankapplication.application.requests.queries;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public final class GetUsersQuery {
    @JsonProperty("CorrelationId")
    @NonNull
    private UUID correlationId;

    public GetUsersQuery(@NonNull UUID correlationId) {
        this.correlationId = correlationId;
    }

    @NonNull
    public UUID getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(@NonNull UUID correlationId) {
        this.correlationId = correlationId;
    }
}
