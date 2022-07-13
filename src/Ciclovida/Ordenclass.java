package Ciclovida;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Ordenclass {

	@BeforeAll
	static void beforeAll() {
		System.out.println("antesdetodo");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("despuesdetodo");
		
	}
	@Test
	void test1() {
		assert(true);
		System.out.println("test1");

	}
	
	@Test
	void test2() {
		assert(true);
		System.out.println("test2");

	}
	
}
