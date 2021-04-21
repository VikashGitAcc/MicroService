package com.example.sleuthprojectcostservice4Ribbon.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.sleuthprojectcostservice4Ribbon.model.ProjectCost;








@Repository
@Service
public interface ProjectCostRepositoyu extends JpaRepository<ProjectCost, Integer> {
	
	//ProjectCost FindByprojLangAndprojMonth(String projLang, int projMonth);

}
