package com.cisco.beans;

public class Wallet {
	private String name = "CiscoPay";
	private Account account;
	private double funds = 25000;
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wallet(String name, Account account, double funds) {
		super();
		this.name = name;
		this.account = account;
		this.funds = funds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getFunds() {
		return funds;
	}
	public void setFunds(double funds) {
		this.funds = funds;
	}
	
}
