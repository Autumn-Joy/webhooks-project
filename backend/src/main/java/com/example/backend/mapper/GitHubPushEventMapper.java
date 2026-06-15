package com.example.backend.mapper;

import com.example.backend.dto.GitHubPushEventRequest;
import com.example.backend.entity.GitHubPushEvent;
import org.springframework.stereotype.Component;

@Component
public class GitHubPushEventMapper {

//    public GitHubPushEventRequest toDto(GitHubPushEvent gitHubPushEvent){
//
//    }

    public GitHubPushEvent toEntity(GitHubPushEventRequest gitHubPushEventRequest) {

        return GitHubPushEvent.builder()
                .ref(gitHubPushEventRequest.getRef())
                .before(gitHubPushEventRequest.getBefore())
                .after(gitHubPushEventRequest.getAfter())
                .gitUrl(gitHubPushEventRequest.getRepository().getGitUrl())
                .repositoryFullName(gitHubPushEventRequest.getRepository().getFullName())
                .pusherName(gitHubPushEventRequest.getPusher().getName())
                .build();

    }
}
