package com.cisco.spring_cloud_config_client_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class MyApi {

	//@Value("${message}")
	private String property;
	
	@GetMapping
	public ResponseEntity<Object> getProperty() {
		return ResponseEntity.ok(property);
	}
	
}
