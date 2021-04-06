package com.example.eurekanamingclientCallingAppWithRibbon.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Service
@Entity
@Table(name = "resource_cost")
public class ResorceCost {

	@Id
	private int id;

	@Column(name="proj_lang")
	private String projLang;

	@Column(name="res_cost")
	private int resCost;

	public ResorceCost() {

	}

	public ResorceCost(int id, String projLang, int resCost) {
		super();
		this.id = id;
		this.projLang = projLang;
		this.resCost = resCost;
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

	public int getResCost() {
		return resCost;
	}

	public void setResCost(int resCost) {
		this.resCost = resCost;
	}

}
