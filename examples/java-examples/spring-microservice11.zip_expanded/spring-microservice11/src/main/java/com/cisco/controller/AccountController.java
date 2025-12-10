package com.cisco.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.beans.Account;
import com.cisco.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Value("${server.port}") 
	private String port;
	
	@Autowired
	private AccountService service;
	
	@PutMapping(path = "/debit", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> debitApi(@RequestBody Account acc) {
		try {
			Account account = service.debit(acc.getAccountNumber(), acc.getAmount());
			return ResponseEntity.ok(account);
		} catch(Exception e) {
			Map<String, String> map = Map.of("error", "Account not found");
			return ResponseEntity.status(404).body(map);
		}
	}
	
	@GetMapping
	public ResponseEntity<Object> greet() {
		Map<String, String> map = Map.of("port", port, "message", "first-ms");
		return ResponseEntity.ok(map);
	}
	

}
