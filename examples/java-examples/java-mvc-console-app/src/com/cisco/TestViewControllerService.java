package com.cisco;

import java.util.List;
import java.util.Scanner;

import com.cisco.beans.Profile;
import com.cisco.dao.ProfileDao;

public class TestViewControllerService {
	public static void main(String[] args) {
		openUI();
	}
	public static void openUI() {
		Scanner scan = new Scanner(System.in);
		ProfileDao dao = new ProfileDao();
		int option = 0;
		do { 
			System.out.println("1: Register 2: Find All 3: Find By Id 4: Update Dob by Id 5: Delete by Id -1: Exit");
			option = scan.nextInt();
			switch(option) {
			case 2: 
				List<Profile> list = dao.findAll();
				for(Profile profile : list) {
					System.out.println(profile);
				}
				break;
			case 3: 
				System.out.println("Enter id");
				int id = scan.nextInt();
				Profile profile = dao.findById(id);
				if(profile != null)
					System.out.println(profile);
				else
					System.err.println("Profile with an id "+id+" not found");
				break;
			}
			
		} while(option != -1);
		scan.close();
	}
}
