package UD11_02_Ejer129;

import java.util.Comparator;

public class Pelicula implements Comparator<Pelicula> {
	private String titulo, genero;
	private int duracion, valoracion;

	public Pelicula(String titulo, String genero, int duracion, int valoracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.valoracion = valoracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getValoracion() {
		return valoracion;
	}

	@Override
	public String toString() {
		return "-" + titulo + " Duracion: " + duracion + "min. Valoracion:" + valoracion + "/10 Genero:" + genero;
	}

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		if (o1.getValoracion() > o2.getValoracion()) {
			return -1;
		} else if (o1.getValoracion() > o2.getValoracion()) {
			return 0;
		} else {
			return 1;
		}
	}

}
