package ar.edu.unlp.info.oo2.practica2_ejercicio1;

public class Agua extends Atom {
	
	public Agua() {
		super();
		this.valor = 1;
	}
	
	public boolean compararMixto(ZonaCompose zona) {
		return false;
	}

	public boolean equals(Zona other) {
		return	other.getValor() == this.getValor();
	}
	
}
