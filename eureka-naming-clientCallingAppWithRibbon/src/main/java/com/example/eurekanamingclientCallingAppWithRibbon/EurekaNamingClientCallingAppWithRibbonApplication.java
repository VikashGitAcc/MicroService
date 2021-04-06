package com.example.eurekanamingclientCallingAppWithRibbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.example.eurekanamingclientCallingAppWithRibbon")
public class EurekaNamingClientCallingAppWithRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingClientCallingAppWithRibbonApplication.class, args);
	}

}
