package com.cisco.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.beans.Profile;
import com.cisco.service.ProfileService;

public class TestViewController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-orm-mysql.xml");
		ProfileService service = context.getBean(ProfileService.class);// no need of bean id, it gets the object based on the type
		Scanner scan = new Scanner(System.in);
		int option = 0;
		
		do { 
			System.out.println("Enter options");
			System.out.println("1: Save 2: Find All 3: Find By Id 4: Update dob by id 5: Update name by id");
			System.out.println("6: Save many profiles 7: Delete by id 8: Delete many profiles by id 9: Exit");
			option = scan.nextInt();
			switch(option) {
			case 1: 
				break;
			case 2: 
				List<Profile> list = service.fetchProfiles();
				for(Profile item : list) {
					System.out.println(item);
				}
				break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			default : 
				option = 9;
			}
		} while(option == 9);
		scan.close();
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
	}
}
