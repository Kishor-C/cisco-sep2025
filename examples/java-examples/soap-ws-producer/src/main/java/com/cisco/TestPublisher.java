package com.cisco;

import jakarta.xml.ws.Endpoint;

public class TestPublisher {
	public static void main(String[] args) {
		String url = "http://localhost:9999/ws/calci";
		Calculator calculator = new CalculatorImpl();
		Endpoint.publish(url, calculator);
		System.out.println("Published at "+url);
	}
}
