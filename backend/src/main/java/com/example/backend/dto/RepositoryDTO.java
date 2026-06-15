package com.example.backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class RepositoryDTO {

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("git_url")
    private String gitUrl;
}
