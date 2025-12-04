package com.cisco.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myresource/v1")
public class MyResource {
	
	//http://localhost:9090/myresource/v1/greet1
	@GetMapping(path = "/greet1")
	public ResponseEntity<Object> greet() {
		// below code is similar to ResponseEntity.status(200).body("Hello REST")
		ResponseEntity<Object> response = ResponseEntity.ok("Hello REST");
		return response;
	}
	// http://localhost:9090/myresource/v1/greet2
	@GetMapping(path = "/greet2")
	public ResponseEntity<Object> greetJSON() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", "Hello REST");
		ResponseEntity<Object> response = ResponseEntity.ok(map);
		return response;
	}
}
