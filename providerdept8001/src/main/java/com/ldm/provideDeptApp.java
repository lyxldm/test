package com.ldm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class provideDeptApp {
    public static void main(String[] args) {
        SpringApplication.run(provideDeptApp.class, args);
    }
}
