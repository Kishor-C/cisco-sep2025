package com.cisco;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTestCase {
	
	@BeforeAll
	public static void before() {
		System.out.println("beforeAll() is called");
	}
	@AfterAll
	public static void after() {
		System.out.println("afterAll() is called");
	}
	
	@Test
	public void test1() {
		System.out.println("test1() is called");
	}
	
	@Test
	public void tes2() {
		System.out.println("test2() is called");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("setUp() is called");
	}
	@AfterEach
	public void tearDown() {
		System.out.println("tearDown() is called");
	}
}
