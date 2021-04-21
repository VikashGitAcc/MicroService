package com.example.sleuthprojectcostservice4Ribbon.controller;

import java.util.Optional;

import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.sleuthprojectcostservice4Ribbon.model.ProjectCost;







@RestController
public class ProjectCostController {
	
	private  Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ProjectCost projectCost;
	
	
	@Autowired
	private ProjectCostRepositoyu projectCostRepositoyu;
	
	
	@GetMapping("proj-cost/projectID/{projectID}")
	public ProjectCost getFinalCost( @PathVariable int projectID) {
		//int id, String projLang, int projMonth, int projResource
		
		
		//logger.info("{}", RequestContext.getC);
		
		Optional<ProjectCost> projectCost123  = projectCostRepositoyu.findById(projectID);
		
				projectCost = projectCost123.get();	
				System.out.println("333333333333333333333333333333333333333333");
				logger.info("{}", projectCost);
				System.out.print("444444444444444444444444444444444444444444444");		
				return  projectCost;
	}
	

	
}
