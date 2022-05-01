package ar.edu.unlp.info.oo2.practica2_ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ZonaTest {
	
	ZonaCompose zona1;
	ZonaCompose zona2;
	Tierra tierra = new Tierra();
	Agua agua = new Agua();
	
	
	@BeforeEach
	void setUp() {
		zona1 = new ZonaCompose(Arrays.asList(tierra,agua,tierra,tierra));
		zona2 = new ZonaCompose(Arrays.asList(agua,agua,agua,agua));
	}
	
	@Test
	public void valueTest() {
		assertEquals(0.25, zona1.getValor());
		assertEquals(1.0, zona2.getValor());
	}
	
	@Test
	public void equalsTest() {
		assertEquals(true, new Tierra().equals(new Tierra()));
		assertEquals(true, new Agua().equals(new Agua()));
		assertEquals(true, agua.equals(agua));
		assertEquals(false, zona1.equals(zona2));
		assertEquals(true, zona1.equals(new ZonaCompose(Arrays.asList(tierra,agua,tierra,tierra))));
	}
	
	@Test
	public void  pantanoTest() {
		Pantano pantano = new Pantano();
		assertEquals(0.7, pantano.getValor());
	}
	
}




