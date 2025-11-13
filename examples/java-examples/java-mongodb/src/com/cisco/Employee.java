package com.cisco;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

public class Employee {
	
	@BsonId
	private ObjectId id;
	
	private String name;
	
	private double salary;
	// create - 2 argument & default constructor, toString method & setters and getters
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
