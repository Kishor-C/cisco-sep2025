package com.cisco.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile_contacts")
public class Contacts {
	@Id
	//@SequenceGenerator(name = "generate_contact_id", sequenceName = "profile_contact_sequence", allocationSize = 1)
	//@GeneratedValue(generator = "generate_contact_id", strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "useridref")
	private int userIdRef;
	private String name;
	private long phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getUserIdRef() {
		return userIdRef;
	}
	public void setUserIdRef(int userIdRef) {
		this.userIdRef = userIdRef;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", userIdRef=" + userIdRef + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}
