package com.cisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIoc {
	public static void main(String[] args) {
		// Referring the IoC - ApplicationContext = new ClassPathApplicationContext("xml-file-name")
		/*
		 * Below code initializes the spring container and creates all the objects configured with <bean>
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// getBean(ID) returns the object 
		HelloWorld hello = (HelloWorld) context.getBean("b1");
		System.out.println(hello.greet("Kishor"));
		
		ClassPathXmlApplicationContext cptx = (ClassPathXmlApplicationContext)context;
		cptx.close();
	}
}
