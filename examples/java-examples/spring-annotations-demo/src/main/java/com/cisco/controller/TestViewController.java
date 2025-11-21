package com.cisco.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.dao.EmployeeDAO;

public class TestViewController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO dao = (EmployeeDAO) context.getBean("employeeDAO");
		// you can customize the id i.e., @Repository("empDao") this will create id as empDao
		dao.save();
		
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
	}
}
