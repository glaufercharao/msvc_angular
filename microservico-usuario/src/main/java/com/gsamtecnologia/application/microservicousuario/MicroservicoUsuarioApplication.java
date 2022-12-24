package com.gsamtecnologia.application.microservicousuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MicroservicoUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicoUsuarioApplication.class, args);
	}

}
