package com.example.projectcostcalculationservice4Feign.contoller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectcostcalculationservice4Feign.bean.ResorceCost;

public interface ResorceCostRepository extends JpaRepository<ResorceCost, Integer> {

}
