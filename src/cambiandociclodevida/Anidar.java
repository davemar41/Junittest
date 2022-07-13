package cambiandociclodevida;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
@DisplayName("testanidados")
class Anidar {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Test1")
	void test1() {
		assertTrue(true);
		System.out.println("test1");
		
	}
	@Nested
	@DisplayName("grupo1")
	class Grupo1{
		@Test
		@DisplayName("Busqueda")
		@RepeatedTest(value =2, name="{displayname}:test {currentRepetition} of {totalRepetitions}")
		void testbusqueda() {
			System.out.println("ha buscado");
			assertTrue(true);
			
			
		}
		
	}
	@Nested
	@DisplayName("grupo2")
	class Grupo2{
		@Test
		@DisplayName("recuperando")
		void testrecupero() {
			System.out.println("ha recuperado");
			assertTrue(true);
			
			
		}
		
	}

}
