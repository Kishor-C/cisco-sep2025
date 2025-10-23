package com.cisco;

class X { 
	static void test() {
		System.out.println("test() in X");
	}
}
class Y extends X { 
	static void test() { 
		System.out.println("test() in Y");
	}
}

public class TestStaticOverriding {
	public static void main(String[] args) {
		Y y1 = new Y();
		printObject(y1);
	}
	public static void printObject(X x) {
		x.test();
	}
}
