package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.model.HealthResponse;

@Service
public class DemoServiceImpl implements DemoService {

	
	private static final Logger log = LoggerFactory.getLogger(DemoServiceImpl.class);
	
	@Override
	public HealthResponse getHealthResponse() {
		log.debug("Request for Health");
		HealthResponse healthResponse = new HealthResponse();
		healthResponse.setStatus("UP");
		return healthResponse;
	}

}
