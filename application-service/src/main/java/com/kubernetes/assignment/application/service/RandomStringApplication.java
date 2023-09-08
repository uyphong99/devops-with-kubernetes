package com.kubernetes.assignment.application.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RandomStringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomStringApplication.class, args);
    }
}