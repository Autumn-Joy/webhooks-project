package com.example.backend.controller;

import com.example.backend.dto.GitHubPushEventRequest;
import com.example.backend.dto.GitHubWebhookResponse;
import com.example.backend.service.WebhookServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/webhooks")
@Slf4j
public class GitHubWebhookController {

    private final WebhookServiceImpl webhookService;

    public GitHubWebhookController(WebhookServiceImpl webhookService) {
        this.webhookService = webhookService;
    }

    // method that handles POST request from GitHub

    @PostMapping("/github")
    public ResponseEntity<GitHubWebhookResponse> handleGitHubWebhook(@RequestHeader Map<String, String> headers,
                                                                     @RequestBody GitHubPushEventRequest body) {

        webhookService.handleGithubWebhook(body);

        return ResponseEntity.ok(new GitHubWebhookResponse("Webhook received"));
    }


}
