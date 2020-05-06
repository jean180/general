package UD11_02_Ejer125;

public class Multimedia {
	protected String titulo, autor, formato;
	protected int duracion;

	public Multimedia(String titulo, String autor, String formato, int duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	// GETTER
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getFormato() {
		return formato;
	}

	public int getDuracion() {
		return duracion;
	}

	// SETTER
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	// TO STRING
	public String toString() {
		String resultado = "";
		resultado = this.titulo + "|" + this.autor + "|" + this.formato + "|" + this.duracion;
		return resultado;
	}

	// EQUALS
	public boolean equals(Multimedia AuxMultimedia) {
		boolean iguales = false;
		if (this.titulo.equals(AuxMultimedia.getTitulo()) && this.autor.equals(AuxMultimedia.getAutor())) {
			iguales = true;
		}
		return iguales;
	}
}
