package com.kubernetes.assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrintOutPortServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrintOutPortServerApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String home() {
        return "Server started in port " + port;
    }
}
