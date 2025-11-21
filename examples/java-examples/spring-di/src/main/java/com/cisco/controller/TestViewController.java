package com.cisco.controller;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.service.EmployeeServiceImpl;

public class TestViewController {
	public static void main(String[] args) {
		BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");
		
//		StudentServiceImpl service = (StudentServiceImpl)context.getBean("service");
//		service.testCRUD();
		
		EmployeeServiceImpl service2 = (EmployeeServiceImpl)context.getBean("service2");
		service2.testAllDBs();
		
		
		// write at the end
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
	}
}
