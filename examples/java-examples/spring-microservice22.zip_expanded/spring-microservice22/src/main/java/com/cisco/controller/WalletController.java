package com.cisco.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.WalletService;
import com.cisco.beans.Account;
import com.cisco.beans.Wallet;

@RestController
@RequestMapping("/wallet")
public class WalletController {

	@Autowired
	private WalletService service;
	
	@PutMapping(path = "/addFunds", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> debit(@RequestBody Account account) {
		Wallet wallet = service.debit(account);
		return ResponseEntity.ok(wallet);
	}
	
	@GetMapping
	public ResponseEntity<Object> greet() {
		Map<String, String> map = service.testGreet();
		return ResponseEntity.ok(map);
	}
}
