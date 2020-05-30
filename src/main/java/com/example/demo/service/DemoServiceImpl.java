package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.HealthResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {
	
	@Override
	public HealthResponse getHealthResponse() {
		log.debug("Request for Health");
		HealthResponse healthResponse = new HealthResponse();
		healthResponse.setStatus("UP");
		return healthResponse;
	}
}
