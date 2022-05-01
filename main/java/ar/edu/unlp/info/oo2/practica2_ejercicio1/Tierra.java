package ar.edu.unlp.info.oo2.practica2_ejercicio1;

public class Tierra extends Atom {

	public Tierra() {
		super();
		this.valor = 0;
	}
	
	public boolean compararMixto(ZonaCompose zona) {
		return false;
	}

	@Override
	public boolean equals(Zona other) {
		return other.getValor() == this.getValor();
	};
}
