package com.cisco;

public class TestClient {
	public static void main(String[] args) {
		/*
		 * This program just uses Calculator interface & CalculatorImplService
		 * CalculatorImplService provides the binding between Calculator at client to CalculatorImpl at server
		 */
		CalculatorImplService service = new CalculatorImplService();
		Calculator calci = service.getCalculatorImplPort(); // this binds the CalculatorImpl object to Calculator interface
		System.out.println("Add: "+calci.add(20, 30));
		System.out.println("Sub: "+calci.sub(30, 20));
		
	}
}
