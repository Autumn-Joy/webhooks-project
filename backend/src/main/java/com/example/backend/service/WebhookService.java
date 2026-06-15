package com.example.backend.service;

import com.example.backend.dto.GitHubPushEventRequest;
import org.springframework.scheduling.annotation.Async;

public interface WebhookService {

    public void handleGithubWebhook(GitHubPushEventRequest gitHubPushEventRequest);

}
