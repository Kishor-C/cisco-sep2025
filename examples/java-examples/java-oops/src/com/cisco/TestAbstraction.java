package com.cisco;
interface Vehicle {
	void mileage();
	void wheels();
}
abstract class Car implements Vehicle {
	public void wheels() {
		System.out.println("4 wheeler");
	}
}
class Nexon extends Car {
	public void mileage() { System.out.println("Nexon mileage is 18kmpl"); }
}
class Brezza extends Car {
	public void mileage() { System.out.println("Brezza mileage is 20kmpl"); }
}
// activity - create Bike that implements Vehicle and create 2 subclasses of Bike and pass their objects to the print() method
public class TestAbstraction {
	public static void print(Vehicle v) {
		// client code doesn't change if implementation changes
		v.mileage();
		v.wheels();
		System.out.println("__________________________");
	}
	public static void main(String[] args) {
		Nexon nexon = new Nexon();
		Brezza brezza = new Brezza();
		print(nexon);
		print(brezza);
	}
}
