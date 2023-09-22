package com.kubernetes.assignment.application.service.controller;

import com.kubernetes.assignment.application.service.scheduler.RandomStringGenerator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@AllArgsConstructor
public class RandomStringController {
    private RandomStringGenerator randomStringGenerator;

    @GetMapping("/app1/timestamp")
    public String getCurrentTime() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        String randomString = randomStringGenerator.getRandomString();
        return (timestamp + ": " + randomString);
    }
}
