package com.example.backend.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GitHubPushEventRequest {
    private String ref;
    private String before;
    private String after;
    private String git_url;
    private RepositoryDTO repository;
    private PusherDTO pusher;
}
