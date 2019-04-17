package com.greeva.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreevaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreevaGatewayApplication.class, args);
    }

}
