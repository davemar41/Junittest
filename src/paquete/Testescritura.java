package paquete;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Testescritura {
	String resultadoesperado="raton";
	Metodos mimetodoprueba=new Metodos();
	String resultadoobtenido=mimetodoprueba.miMetodo();

	@Test
	@DisplayName("escritura")
	void escrituratest() {
		//String nombre="perro";
		
		//assertEquals(resultadoesperado, resultadoobtenido);
		assertAll("comprobaciones",
				()->assertNotNull(resultadoobtenido),
				()->assertTrue(resultadoobtenido=="perro"));
	}
	
	@Test
	@DisplayName("igualtest")
	void igualestest() {
		//String nombre="perro";
		String resultadoesperado="raton";
		Metodos mimetodoprueba=new Metodos();
		String resultadoobtenido=mimetodoprueba.miMetodo();
		//assertEquals(resultadoesperado, resultadoobtenido);
		
				
				
				assertEquals(resultadoesperado, resultadoobtenido);
	}
}
