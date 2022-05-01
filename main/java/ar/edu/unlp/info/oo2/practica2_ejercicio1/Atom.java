package ar.edu.unlp.info.oo2.practica2_ejercicio1;

public abstract class Atom  extends Zona{
	
	public float getValor() {
		System.out.print(this.valor+"\n");
		return this.valor;
	}
	
	//@Override
	//public boolean equals(Zona zona) {
	//	return zona.equals(this);
	//}
	
}
