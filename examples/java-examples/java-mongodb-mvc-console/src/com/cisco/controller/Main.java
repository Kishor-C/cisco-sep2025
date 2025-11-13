package com.cisco.controller;

import java.util.Scanner;

import com.cisco.beans.Profile;
import com.cisco.dao.ProfileDAOImpl;

public class Main {
	public static void main(String[] args) {
		int option = 0;
		Scanner scan = new Scanner(System.in);
		ProfileDAOImpl dao = new ProfileDAOImpl();
		do {
			System.out.println("1: Store 2: Find By Id 3: Find All 4: Update phone by id 5: Delete by id -1: Exit");
			option = scan.nextInt();
			switch(option) {
			case 1: 
				Profile profile = new Profile();
				System.out.println("Enter name");
				profile.setName(scan.next());
				System.out.println("Enter gender");
				profile.setGender(scan.next());
				System.out.println("Enter phone");
				profile.setPhone(scan.nextLong());
				Profile saved = dao.save(profile);
				System.out.println(saved);
				break;
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				break;
				
			}
		} while(option != -1);
		
		scan.close();
	}
}
