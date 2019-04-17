package com.greeva.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GreevaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreevaConfigApplication.class, args);
    }

}
