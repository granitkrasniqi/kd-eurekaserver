package com.karteladentare.kdeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KdEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(KdEurekaserverApplication.class, args);
    }

}
