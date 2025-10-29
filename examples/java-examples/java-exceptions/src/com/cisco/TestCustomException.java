package com.cisco;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TestCustomException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter dob in yyyy-MM-dd format");
		LocalDate dob = LocalDate.parse(scan.next());
		validateAge(dob);
		scan.close();
	}
	
	public static void validateAge(LocalDate dob) {
		LocalDate currentDate = LocalDate.now();
		Period age = Period.between(dob, currentDate);
		int years = age.getYears();
		if(years < 18) {
			throw new AgeInvalidException(years+" is not a valid age to vote");
		} else {
			System.out.println(years+" is a valid age to vote");
		}
	}
}
