package com.helppoint.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelppointClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelppointClientApplication.class, args);
	}

}
