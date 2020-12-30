package com.springboot.microservice.first.project.eureka.naming.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootMicroserviceFirstProjectEurekaNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMicroserviceFirstProjectEurekaNamingServerApplication.class, args);
    }

}
