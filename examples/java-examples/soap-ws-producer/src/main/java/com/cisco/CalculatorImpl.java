package com.cisco;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.cisco.Calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public int add(int x, int y) {
		System.out.println("add(int, int)");
		return (x + y);
	}

	@Override
	public int sub(int x, int y) {
		System.out.println("sum(int, int)");
		return (x - y);
	}
	
}
