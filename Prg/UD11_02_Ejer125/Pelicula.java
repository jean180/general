package UD11_02_Ejer125;

public class Pelicula extends Multimedia {
	private String actor, actriz;

	public Pelicula(String titulo, String autor, String formato, int duracion, String actor, String actriz) {
		super(titulo, autor, formato, duracion);
		this.actor = actor;
		this.actriz = actriz;
	}

	// GETTER
	public String getActor() {
		return actor;
	}

	public String getActriz() {
		return actriz;
	}

	// SETTER
	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setActriz(String actriz) {
		this.actriz = actriz;
	}

	// TO STRING
	public String toString() {
		String resultado = "";
		resultado = this.titulo + "|" + this.autor + "|" + this.formato + "|" + this.duracion + "|" + this.actor + "|"
				+ this.actriz;
		return resultado;
	}
}
