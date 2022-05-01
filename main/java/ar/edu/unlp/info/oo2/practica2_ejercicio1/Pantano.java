package ar.edu.unlp.info.oo2.practica2_ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pantano extends ZonaCompose{

	public Pantano() {
		super(Arrays.asList(
				new Agua(), new Tierra(), 
				new ZonaCompose(Arrays.asList(new Agua(), new Tierra(),new Agua(),new Agua())), 
				new ZonaCompose(Arrays.asList(new Agua(), new Tierra(),new Agua(),new Agua()))
		));	
	}
	
	@Override
	public float getValor() {
		return (float) 0.7;
	}
	
}
