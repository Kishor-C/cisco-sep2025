package com.cisco.controller;

import java.util.List;
import java.util.Scanner;

import org.bson.types.ObjectId;

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
				System.out.println("Enter id");
				ObjectId pid = new ObjectId(scan.next());
				Profile profile2 = dao.findById(pid);
				System.out.println(profile2);
				break;
			case 3: 
				List<Profile> list = dao.findAll();
				for(Profile p : list) {
					System.out.println(p);
				}
				break;
			case 4: 
				System.out.println("Enter id");
				ObjectId id = new ObjectId(scan.next());
				System.out.println("Enter phone");
				long phone = scan.nextLong();
				Profile updatedProfile = dao.updatePhonById(id, phone);
				System.out.println(updatedProfile);
				break;
			case 5: 
				System.out.println("Enter id");
				ObjectId id2 = new ObjectId(scan.next());
				int status = dao.delete(id2);
				System.out.println("Deleted "+status);
				break;
				
			}
		} while(option != -1);
		
		scan.close();
	}
}
