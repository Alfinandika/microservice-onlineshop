package com.alfinandika.training.microservice2019.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}

@RestController
class ConfigServerFallback{

	@GetMapping("/configserveroffline")
	public Map<String, String> configServerOffline(){
		Map<String, String> result = new HashMap<>();
		result.put("succes", "false");
		result.put("message", "config server offline");

		return result;
	}
}
