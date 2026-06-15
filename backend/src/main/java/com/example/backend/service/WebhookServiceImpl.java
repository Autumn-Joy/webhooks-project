package com.example.backend.service;

import com.example.backend.dto.GitHubPushEventRequest;
import com.example.backend.entity.GitHubPushEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@lombok.extern.slf4j.Slf4j
public class WebhookServiceImpl implements WebhookService{

    @Override
    @Async
    public void handleGithubWebhook(GitHubPushEventRequest gitHubPushEventRequest) {

         GitHubPushEvent gitHubPushEvent = GitHubPushEvent.builder()
                 .ref(gitHubPushEventRequest.getRef())
                 .before(gitHubPushEventRequest.getBefore())
                 .after(gitHubPushEventRequest.getAfter())
                 .gitUrl(gitHubPushEventRequest.getGit_url())
                 .repositoryName(gitHubPushEventRequest.getRepository().getName())
                 .pusherName(gitHubPushEventRequest.getPusher().getName())
                 .build();

         log.info("GitHubPushEvent processed successfully: {}", gitHubPushEvent);

    }
}
