package com.example.sleuthprojectcostservice4Ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class SleuthProjectCostService4RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthProjectCostService4RibbonApplication.class, args);
	}

	@Bean
	public Sampler defaultsample() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
