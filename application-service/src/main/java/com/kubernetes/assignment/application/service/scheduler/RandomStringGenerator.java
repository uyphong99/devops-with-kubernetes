package com.kubernetes.assignment.application.service.scheduler;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RandomStringGenerator {
    private String randomString;

    public RandomStringGenerator() {
        this.randomString = UUID.randomUUID().toString();
    }

    public String getRandomString() {
        return randomString;
    }
}
