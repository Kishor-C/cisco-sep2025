package com.cisco;

public class TestInheritance {
	public static void main(String[] args) {
		Employee employee1 = new Employee(123, "Kishor", 9393932, 40000);
		Person person1 = new Person("Ajay", 923903);
		printObject(person1);
		printObject(employee1);
	}
	// runtime polymorphism
	public static void printObject(Person obj) { // obj = employee1 = new Employee(123, ...)
		System.out.println(obj); //obj = person1 = person1.toString(), 2nd time obj = employee1 = employee1.toString()
		System.out.println("______________________________");
	}
	/*
	 * HT = LT
	 * long = int, short, byte
	 * int x = 50;
	 * long y = x;
	 */
}
