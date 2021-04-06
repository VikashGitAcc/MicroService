package com.example.eurekanamingclientWithRibbon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;


@Service
@Entity
@Table(name="project_cost123")
public class ProjectCost {
	
	@Id
	private int id;
	
	//@Column(name="projLang1")
	private String projLang;
	
	//@Column(name="projMonth")
	private int projMonth;
	
	//@Column(name="projResource")
	private int projResource;
	
	public ProjectCost() {
		
	}
	
	public ProjectCost(int id, String projLang, int projMonth, int projResource) {
		super();
		this.id = id;
		this.projLang = projLang;
		this.projMonth = projMonth;
		this.projResource = projResource;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjLang() {
		return projLang;
	}

	public void setProjLang(String projLang) {
		this.projLang = projLang;
	}

	public int getProjMonth() {
		return projMonth;
	}

	public void setProjMonth(int projMonth) {
		this.projMonth = projMonth;
	}

	public int getProjResource() {
		return projResource;
	}

	public void setProjResource(int projResource) {
		this.projResource = projResource;
	}
	
	

}
