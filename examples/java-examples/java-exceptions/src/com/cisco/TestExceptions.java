package com.cisco;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestExceptions {
	public static void main(String[] args) {
		//readFile("abc.txt");
		try { 
			readFile("abc.txt");
		} catch(FileNotFoundException e) {
			System.out.println("catch: File Not Found");
		} catch(IOException e) {
			System.out.println("catch: IO Exception");
		}
	}
	public static void readFile(String fileName) throws FileNotFoundException, IOException {
		// throws FileNotFoundException - checked exception
		FileReader reader = new FileReader(fileName);
		// throws IOException - checked exception
		char singleChar = (char)reader.read();
		System.out.println(singleChar);
		reader.close();
	}
}
