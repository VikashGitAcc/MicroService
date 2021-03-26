package com.example.servicecloudconfigserver4SVN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServiceCloudConfigServer4SvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCloudConfigServer4SvnApplication.class, args);
	}

}
