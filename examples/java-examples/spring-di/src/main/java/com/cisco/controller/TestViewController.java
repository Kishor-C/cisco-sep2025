package com.cisco.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.service.EmployeeServiceImpl;
import com.cisco.service.StudentServiceImpl;

public class TestViewController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
//		StudentServiceImpl service = (StudentServiceImpl)context.getBean("service");
//		service.testCRUD();
		
		EmployeeServiceImpl service2 = (EmployeeServiceImpl)context.getBean("service2");
		service2.testAllDBs();
		
		
		// write at the end
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
	}
}
