package com.example.servicecloudconfigclient4SVN.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicecloudconfigclient4SVN.bean.Configuration;
import com.example.servicecloudconfigclient4SVN.bean.LimitConfiguration;



@RestController
public class LimitServiceController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimitConfigurationFromApplication() {
		//return  new LimitConfiguration(1000, 99);
		return  new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}

	
}
