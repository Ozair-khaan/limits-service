package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.Configurationn;
import com.microservices.controller.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configurationn configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retreiveLimitsConfigurations() {
		
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}
	
}
