package com.alfinandika.training.microservice2019.frontend;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class FrontendApplication {
	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}
	public static void main(String[] args) {
		SpringApplication.run(FrontendApplication.class, args);
	}

}
