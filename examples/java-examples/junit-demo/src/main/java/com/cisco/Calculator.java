package com.cisco;
/*
 * Business requirement says Calculator must have 3 methods
 * add should return addition of 2 parameters
 * div should throw an exception if 2nd parameter is 0
 * mapToTenX must return array that has multiples of 10 for the input array
 */
public class Calculator {

	public int add(int x, int y) {
		return (x + y);
	}
	public int div(int x, int y) {
		if(y == 0) {
			throw new ArithmeticException("divide by 0 is impossible");
		}
		return (x / y);
	}
	// mapToTenX(1, 2, 3, 4) -> 10, 20, 30, 40
	public int[] mapToTenX(int... x) {
		int[] items = new int[x.length];
		for(int i = 0; i < items.length; i++) {
			items[i] = x[i] * 10;
		}
		return items;
	}
}
