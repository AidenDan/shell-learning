package com.example.shelllearing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ShellLearingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShellLearingApplication.class, args);
    }

}
