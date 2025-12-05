package com.cisco.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Value("${server.port}") 
	private String port;
	
	@GetMapping
	public ResponseEntity<Object> greet() {
		Map<String, String> map = Map.of("port", port, "message", "first-ms");
		return ResponseEntity.ok(map);
	}
}
