package com.example.zuulapigatewayserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ZuulDemoController{
	
	
	@GetMapping("/chkZull")
	public String getZull(){
		return "Hello Zuul";
	}

}
