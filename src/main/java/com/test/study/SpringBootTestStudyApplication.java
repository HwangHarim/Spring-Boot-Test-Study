package com.test.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootTestStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestStudyApplication.class, args);
    }
}
