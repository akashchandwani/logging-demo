package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HealthResponse;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	private DemoService demoService;
	
	public DemoController(DemoService demoService) {
		this.demoService = demoService;
	}

	@GetMapping("/health")
	public ResponseEntity<HealthResponse> getHealth() {
		return ResponseEntity.ok(demoService.getHealthResponse());
	}
}
