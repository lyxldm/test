package cn.ldm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.ldm.service")
@ComponentScan(basePackages = {"com.ldm.service","cn.ldm"})
public class CustomerDeptAppfeign {
    public static void main(String[] args) {
        SpringApplication.run(CustomerDeptAppfeign.class, args);
    }
}
