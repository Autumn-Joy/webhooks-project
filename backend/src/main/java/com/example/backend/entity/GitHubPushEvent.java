package com.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GitHubPushEvent {
    @Id
    private Long id;
    private String ref;
    private String before;
    private String after;
    private String gitUrl;
    private String repositoryFullName;
    private String pusherName;
}
