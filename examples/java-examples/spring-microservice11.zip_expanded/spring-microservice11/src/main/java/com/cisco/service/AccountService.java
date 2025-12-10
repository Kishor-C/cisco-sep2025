package com.cisco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cisco.beans.Account;

@Service
public class AccountService {
	// hard-coded account structure
	List<Account> accounts = List.of(
			new Account(1234, 50000),
			new Account(1235, 60000),
			new Account(1236, 40000)
	);
	public Account debit(int accountNo, double amount) {
		Optional<Account> option =  
				accounts.stream().filter(x -> x.getAccountNumber()==accountNo)
				.findAny();
		Account acc = option.orElseThrow(() -> new RuntimeException());
		acc.setAmount(acc.getAmount() - amount);
		return acc;
	}
	
}
