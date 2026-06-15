package com.example.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Builder
@ToString
public class GitHubPushEventRequest {

    @JsonProperty("ref")
    private String ref;

    @JsonProperty("before")
    private String before;

    @JsonProperty("after")
    private String after;

    @JsonProperty("repository")
    private RepositoryDTO repository;

    @JsonProperty("pusher")
    private PusherDTO pusher;
}
