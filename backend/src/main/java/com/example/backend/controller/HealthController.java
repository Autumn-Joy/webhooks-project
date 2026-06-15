package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    // this really isn't needed, we could have just used /actuator/health, but anyway.

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
