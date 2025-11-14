package com.cisco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	private Calculator calci;
	
	@BeforeEach
	public void setUp() {
		calci = new Calculator();
	}
	@AfterEach
	public void tearDown() {
		calci = null;
	}
	@Test // test the add method
	public void testAdd() {
		int x = 10;
		int y = 20;
		int expected = x + y;
		int actual = calci.add(x, y);
		// assertEquals(expected, actual) -> test is passed if both are equal else test is failed
		assertEquals(expected, actual);
	}
}
