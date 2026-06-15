package com.example.backend.dto;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Builder
@ToString
public class RepositoryDTO {

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("git_url")
    private String gitUrl;
}
