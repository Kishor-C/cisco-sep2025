package com.cisco.beans;

import java.time.LocalDate;

import jakarta.persistence.*;
@Entity
@Table(name = "profile") // optional if the name of the class and table are same
public class Profile {
	// all the annotations are built-in
	@Id // annotation that marks the primary key property
	@GeneratedValue(strategy = GenerationType.IDENTITY) // annotation to auto-generate the primary key
	@Column(name = "id") // required only if name of the property and column are different
	private int id; // property name must match to the column name
	
	@Column(name = "name") // optional because property & column names are same
	private String name; // this maps to name column
	
	@Column(name = "dob") // optional because property & column names are same
	private LocalDate dob; // this maps to dob column
	// generate setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
	
	
}