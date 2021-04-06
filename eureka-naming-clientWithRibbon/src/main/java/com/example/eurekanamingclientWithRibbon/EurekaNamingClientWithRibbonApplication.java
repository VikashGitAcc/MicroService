package com.example.eurekanamingclientWithRibbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaNamingClientWithRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingClientWithRibbonApplication.class, args);
	}

}
