package br.edu.ufabc.poo.carro;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestCarro {
	
	private Carro c; 
	
	@Before
	public void inicializaCarro(){
		c = new Carro(8, 100);
	}

	@Test
	public void criaCarroParado() {
		assertEquals(0,c.getVelocidade());
	}
	
	@Test
	public void acelerar(){
		c.acelerar();
		assertEquals("Acelerou 1 vez",8,c.getVelocidade());
		c.acelerar();
		c.acelerar();
		assertEquals("Acelerou 3 vez", 24,c.getVelocidade());
	}
	
	@Test
	public void frear(){
		c.acelerar();
		c.frear();
		assertEquals(4,c.getVelocidade());
	}
	
	@Test
	public void frearAteParar(){
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals("Frear e parar", 0,c.getVelocidade());
		c.frear();
		assertEquals("Continuar freando",0,c.getVelocidade());
	}
	
	@Test
	public void atingeVelocidadeMaxima(){
		for(int i =0; i<20; i++){
			c.acelerar();
		}
		assertEquals(100,c.getVelocidade());
	}

}