package com.cisco.controller;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.beans.Profile;
import com.cisco.dao.ProfileDAO;

public class TestViewController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ProfileDAO dao = (ProfileDAO)context.getBean("profileDAOJdbc");
		Profile profile = new Profile();
		profile.setName("Vishnu");
		profile.setDob(LocalDate.parse("2015-08-25"));
		
		int status = dao.save(profile);
		System.out.println("Stored: "+status+" record");
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
	}
}
