package com.gsamtecnologia.application.microservico.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicoEurekaApplication.class, args);
    }

}
