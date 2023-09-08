package com.kubernetes.assignment.application.service.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class RandomStringOutputTask {
    private final RandomStringGenerator randomStringGenerator;

    public RandomStringOutputTask(RandomStringGenerator randomStringGenerator) {
        this.randomStringGenerator = randomStringGenerator;
    }

    @Scheduled(fixedRate = 5000) // Run every 5 seconds
    public void outputRandomString() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        String randomString = randomStringGenerator.getRandomString();
        System.out.println(timestamp + ": " + randomString);
    }
}
