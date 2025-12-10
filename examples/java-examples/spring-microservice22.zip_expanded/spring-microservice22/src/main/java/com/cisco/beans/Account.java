package com.cisco.beans;

public class Account {
	private int accountNumber;
	private double amount;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
