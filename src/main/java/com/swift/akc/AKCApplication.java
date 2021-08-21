package com.swift.akc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.swift.akc.repository")
@EntityScan("com.swift.akc.entity")
public class AKCApplication {

    public static void main(String[] args) {
        SpringApplication.run(AKCApplication.class, args);
    }
}
