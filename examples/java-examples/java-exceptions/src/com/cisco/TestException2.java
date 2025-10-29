package com.cisco;
import java.util.Scanner;
public class TestException2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of x and y");
		int x = scan.nextInt();
		int y = scan.nextInt();
		try { 
			test(x, y);
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(RuntimeException e) {
			System.out.println("RTE: "+e);
		}
		finally {
			System.out.println("Finally block is executed");
			scan.close();
		}
		System.out.println("Program exited normally");
	}
	static void test(int x, int y) {
		if(y == 0) {
			throw new ArithmeticException("divisor is 0 it will raise divide by zero error");
		}
		if(x == 1) {
			throw new NullPointerException();
		}
		if(y == -1) {
			throw new ArrayIndexOutOfBoundsException("index is -1 might lead to AIOBE");
		}
	}
}
