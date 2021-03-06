package Ciclovida;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import paquete.Metodos;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Orden {
	String resultadoesperado="raton";
	Metodos mimetodoprueba=new Metodos();
	String resultadoobtenido=mimetodoprueba.miMetodo();
	@BeforeEach
	void setUp() throws Exception {
		Metodos mimetodoprueba=new Metodos();
		System.out.println("primero");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("segundo");

	}
	@Disabled("se deshabilita")
	@Order(2)
	@Test
	void test1() {
		assert(true);
		System.out.println("test1");

	}
	@EnabledOnOs(OS.WINDOWS)
	@EnabledIfEnvironmentVariable(named ="USERNAME",matches="pmart")
	@Order(1)
	@Test
	void test2() {
		assert(true);
		System.out.println("test2");

	}
	@Test
	void printenv() {
		System.getenv().forEach(
				(key,value)->System.out.println(key+"-"+value));
		System.getProperties().forEach(
				(key,value)->System.out.println(key+"-"+value));

		}
	
	
	
	

}
