package com.cisco.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// spring framework creates object and its id will be class name
// and its id will be employeeDAO
@Repository
public class EmployeeDAO {
	
	@Autowired // injects the object of DBUtil type - throws error if it finds multiple objects of same type
	private DBUtil util;
	
	public void save() {
		System.out.println("saves() employee object");
		System.out.println("DB Info username: "+util.getUsername()+", url: "+util.getUrl());
	}
}
