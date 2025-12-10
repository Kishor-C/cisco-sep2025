package com.cisco;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cisco.beans.Account;

@FeignClient("http://FIRST-MS")
public interface RemoteClient {

	@PutMapping(path = "/account/debit", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Account debitAmount(@RequestBody Account account);
	
	@GetMapping(path = "/account")
	public Map<String, String> testLoad();
}
