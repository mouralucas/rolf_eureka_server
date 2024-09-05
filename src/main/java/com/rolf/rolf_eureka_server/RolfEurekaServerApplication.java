package com.rolf.rolf_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RolfEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RolfEurekaServerApplication.class, args);
    }

}
