package com.example.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GitHubPushEventRequest {

    @JsonProperty("ref")
    private String ref;

    @JsonProperty("before")
    private String before;

    @JsonProperty("after")
    private String after;

    @JsonProperty("git_url")
    private String git_url;

    @JsonProperty("repository")
    private RepositoryDTO repository;

    @JsonProperty("pusher")
    private PusherDTO pusher;
}
