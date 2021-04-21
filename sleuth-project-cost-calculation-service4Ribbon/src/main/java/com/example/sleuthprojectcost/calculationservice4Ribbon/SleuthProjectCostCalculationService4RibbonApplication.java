package com.example.sleuthprojectcost.calculationservice4Ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.example.sleuthprojectcost.calculationservice4Ribbon")
public class SleuthProjectCostCalculationService4RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthProjectCostCalculationService4RibbonApplication.class, args);
	}
	
	@Bean
	public Sampler defaultsample() {
		return Sampler.ALWAYS_SAMPLE;
	}
	

}
