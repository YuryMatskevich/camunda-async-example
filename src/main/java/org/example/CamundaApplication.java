package org.example;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableProcessApplication
@EnableAsync
public class CamundaApplication {

    public static void main(String... args) {
        SpringApplication.run(CamundaApplication.class, args);
    }
}
