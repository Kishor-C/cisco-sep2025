package com.cisco.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApi {

	@Value("${user.name}")
	private String name;
	@GetMapping
	public String greet() {
		return "Hello "+name;
	}
}
