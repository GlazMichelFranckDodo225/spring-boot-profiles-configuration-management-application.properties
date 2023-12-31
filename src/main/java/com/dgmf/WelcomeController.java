package com.dgmf;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgmf.configuration.BasicConfiguration;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService service;

	@Autowired
	private BasicConfiguration configuration;

	@GetMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}

	@GetMapping("/dynamic-configuration")
	public Map<String, Object> dynamicConfiguration() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", configuration.getMessage());
		map.put("number", configuration.getNumber());
		map.put("value", configuration.isValue());
		return map;
	}
}
