package com.ldm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@ComponentScan("com")
public class ProvideDeptApphystrix {
    public static void main(String[] args) {
        SpringApplication.run(ProvideDeptApphystrix.class, args);
    }
}
