package com.nttdata.gateweyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateweyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateweyServiceApplication.class, args);
	}

}
