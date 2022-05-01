package ar.edu.unlp.info.oo2.practica2_ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ZonaCompose extends Zona{
	private List<Zona> elements;
	
	public ZonaCompose(Zona element) {
		this.elements = new ArrayList<Zona>();
		this.elements.add(element);
	}
	
	public ZonaCompose(List<Zona> elements) {
		this.elements = new ArrayList<Zona>(elements);
	}
	
	public void add(Zona element) {
		if(this.elements.size() == 4) {
			return;
		}
		this.add(element);
	}
	
	public float getValor() {
		return (float) (elements.stream().mapToDouble(element -> element.getValor()).sum()/4);
	}
	
	public List<Zona> getLista(){
		return elements;
	}
	
	public boolean compararMixto(ZonaCompose zona) {
		return zona.getLista().equals(this.getLista());
	}

	public boolean equals(Zona other) {
		if(other.getValor() == this.getValor()) {
			return other.compararMixto(this);
		}
		return false;
	}
	
}
