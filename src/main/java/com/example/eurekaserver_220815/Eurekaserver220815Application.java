package com.example.eurekaserver_220815;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaserver220815Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaserver220815Application.class, args);
    }

}
