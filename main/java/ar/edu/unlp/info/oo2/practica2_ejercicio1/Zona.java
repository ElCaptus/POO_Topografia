package ar.edu.unlp.info.oo2.practica2_ejercicio1;

public abstract class Zona {
	protected float valor;
	
	public abstract float getValor();
	public abstract boolean equals(Zona other);
	public abstract boolean compararMixto(ZonaCompose zona);
	
}
