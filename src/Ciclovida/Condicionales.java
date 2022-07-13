package Ciclovida;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


import paquete.Metodos;

class Condicionales {

	String resultadoesperado="raton";
	Metodos mimetodoprueba=new Metodos();
	String resultadoobtenido=mimetodoprueba.miMetodo();
	
	@BeforeAll
	static void printenv() {
		System.getenv().forEach(
				(key,value)->System.out.println(key+"-"+value));
		System.getProperties().forEach(
				(key,value)->System.out.println(key+"-"+value));

		}
	@Test
	 void test3() {
		String jdk=System.getenv("JAVA_HOME");
		assumeTrue(jdk.contains("jre"));
		assumeFalse(jdk.contains("jre")); //aqui lo obviara
		System.out.println("continua");

	}
	/*@Test
	 void test4() {
		String jdk=System.getenv("JAVA_HOME");
		assumingThat(jdk.contains("jre"),
				()->{});
		
		System.out.println("continua");

	}*/

}
