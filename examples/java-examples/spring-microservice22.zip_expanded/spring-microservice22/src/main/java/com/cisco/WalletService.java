package com.cisco;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.beans.Account;
import com.cisco.beans.Wallet;

@Service
public class WalletService {

	@Autowired
	private RemoteClient httpClient;
	
	public Map<String, String> testGreet() {	
		return httpClient.testLoad();
	}
	
	public Wallet debit(Account account) {
		Account account2 = httpClient.debitAmount(account);
		Wallet wallet = new Wallet();
		wallet.setFunds(wallet.getFunds() + account.getAmount());
		wallet.setAccount(account2);
		return wallet;
	}

}
