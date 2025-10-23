package com.cisco.org;

public class Demo {
	private int id = 20; // visible inside Demo
	String name = "Raj"; // package private - visible only within the package - com.cisco.org
	// visible to all the within the package, but outside the package you can only inherit protected members
	protected double salary = 40000; 
	public long phone = 9939293; // public is visible to all 
}

class Example { 
	void print() {
		Demo d = new Demo();
		System.out.println(d.name);
		System.out.println(d.salary);
		System.out.println(d.phone);
	}
}
