package com.example.limitsencdscexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LimitsServiceConfigServerEncdscexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceConfigServerEncdscexampleApplication.class, args);
	}

}
