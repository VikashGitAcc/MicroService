package com.example.limitsserviceconfigclient4Hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitsserviceconfigclient4Hystrix.bean.Configuration;
import com.example.limitsserviceconfigclient4Hystrix.bean.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;





@RestController
public class LimitServiceController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimitConfigurationFromApplication() {
		//return  new LimitConfiguration(1000, 99);
		return  new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}
	
	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod="getLimitConfigurationFallabck")
	public LimitConfiguration getLimitConfiguration() {
		
		throw new RuntimeException("Not available");
		
	}
	
	
	
	public LimitConfiguration getLimitConfigurationFallabck() {
		return  new LimitConfiguration(1000, 10);
			
	}

	
}
