package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import modelo.Legible;
import modelo.Libro;

public class LegibleTest {
	Legible instancia;
	
	@Before
	public void setUp(){
		instancia=new Libro("JuegoTronos.txt",1000);
	}

	@Test
	public void testAvanzarPagina() {
		int paginaActual=((Libro)instancia).getActual();
		System.out.println(instancia.irAPagina(0));
		System.out.println(instancia.avanzarPagina());
		assertEquals(paginaActual+1, ((Libro)instancia).getActual());
		//Nos queda por probar que la ultima pagina no permite avanzar
		
	}

	@Ignore
	public void testRetrocederPagina() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testMarcarPagina() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testIrAPagina() {
		fail("Not yet implemented");
	}

}
