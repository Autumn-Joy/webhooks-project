package com.example.backend.service;

import com.example.backend.dto.GitHubPushEventRequest;
import com.example.backend.entity.GitHubPushEvent;
import com.example.backend.mapper.GitHubPushEventMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@lombok.extern.slf4j.Slf4j
public class WebhookServiceImpl implements WebhookService{

    private final GitHubPushEventMapper gitHubPushEventMapper;

    public WebhookServiceImpl(GitHubPushEventMapper gitHubPushEventMapper) {
        this.gitHubPushEventMapper = gitHubPushEventMapper;
    }


    @Override
    @Async
    public void handleGithubWebhook(GitHubPushEventRequest gitHubPushEventRequest) {

         GitHubPushEvent gitHubPushEvent = gitHubPushEventMapper.toEntity(gitHubPushEventRequest);

         log.info("GitHubPushEvent processed successfully: {}", gitHubPushEvent);

         // TO DO: add actual processing here.

    }
}
