package com.demo.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloJunit {
	@BeforeAll
	public static void helloBeforeAll() {
		System.out.println("Hello from helloBeforeAll()");
	}
	
	@BeforeEach
	public void helloBeforeEach() {
		System.out.println("Hello from helloBeforeEach(). This will be executed before any test within this class");
	}
	
	@AfterEach
	public void helloAfterEach() {
		System.out.println("Hello from helloAftereEach(). This will be executed after any test within this class");
	}
	
	@Test
	public void testHello1() {
		System.out.println("Hello from testHello1()");
	}
	
	
	@Test
	public void testHello2() {
		System.out.println("Hello from testHello2()");
	}
	
	@AfterAll
	public static void helloAfterAll() {
		System.out.println("Hello from helloAfterAll()");
		}

}
