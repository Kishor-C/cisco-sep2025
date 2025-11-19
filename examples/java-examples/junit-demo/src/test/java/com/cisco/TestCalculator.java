package com.cisco;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
		assertEquals(expected, actual);
	}
	@Test // testing arrays
	public void testTenX() {
		int[] items = {1, 2, 3, 4, 5};
		int[] actual = calci.mapToTenX(items);
		int[] expected = {10, 20, 30, 40, 50};
		assertArrayEquals(expected, actual);
	}
	@Test // test for exceptions
	public void testException() {
		ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
			calci.div(20, 0);
		});
		assertEquals(thrown.getMessage(), "divide by 0 is impossible");
	}
	
}
