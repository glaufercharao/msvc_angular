package com.gsamtecnologia.application.microservico_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MicroservicoApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicoApiGatewayApplication.class, args);
    }

}
