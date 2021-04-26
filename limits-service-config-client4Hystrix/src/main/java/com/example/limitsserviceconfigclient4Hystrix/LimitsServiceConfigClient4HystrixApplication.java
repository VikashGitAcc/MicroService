package com.example.limitsserviceconfigclient4Hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableAutoConfiguration
public class LimitsServiceConfigClient4HystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceConfigClient4HystrixApplication.class, args);
	}

}
