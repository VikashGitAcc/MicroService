package com.example.limitsclient2.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitsclient2.bean.Configuration;
import com.example.limitsclient2.bean.LimitConfiguration;



@RestController
public class LimitServiceController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimitConfigurationFromApplication() {
		//return  new LimitConfiguration(1000, 99);
		return  new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum(), configuration.getName());
		
	}
	
	/*@GetMapping("/limits")
	public String getLimitConfigurationFromApplication() {
		//return  new LimitConfiguration(1000, 99);
		return  "Hello App";
		
	}*/

	
}
