package com.example.springcloudconfigserver4CloudBus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServer4CloudBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServer4CloudBusApplication.class, args);
	}

}
