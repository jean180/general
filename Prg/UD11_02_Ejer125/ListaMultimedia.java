package UD11_02_Ejer125;

public class ListaMultimedia {
	private Multimedia[] lista;
	private int tam;

	// CONSTRUCTOR
	public ListaMultimedia(int tam) {
		this.tam = tam;
		lista = new Multimedia[tam];
	}

	// TAMANYO
	public int size() {
		return lista.length;
	}

	// AGREGAR
	public boolean add(Multimedia AgregarMultimedia) {
		boolean agregado = false;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				lista[i] = AgregarMultimedia;
				agregado = true;
				break;
			}
		}
		return agregado;
	}

	// POSICION
	public Multimedia get(int posicion) {
		return lista[posicion];
	}

	// BUSCAR
	public int indexOf(Multimedia BuscarMultimedia) {
		int posicion = -1;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].equals(BuscarMultimedia)) {
				return i;
			}
		}
		return posicion;
	}

	// TO STRING
	public String toString() {
		String resultado = "";
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				break;
			}
			resultado = resultado + lista[i].toString() + "\n";

		}
		return resultado;
	}
}
