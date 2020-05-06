package UD11_02_Ejer124;

public class Poligono {
	private Punto[] listado_puntos;

	public Poligono(Punto[] listado_puntos) {
		this.listado_puntos = listado_puntos;
	}

	public String toString() {
		String resultado = "";
		for (int i = 0; i < listado_puntos.length; i++) {
			resultado = resultado + listado_puntos[i].toString();
		}
		return resultado;
	}

	public void trasladar(int desX, int desY) {
		for (int i = 0; i < listado_puntos.length; i++) {
			listado_puntos[i].setX(listado_puntos[i].getX() + desX);
			listado_puntos[i].setY(listado_puntos[i].getY() + desY);
		}
	}

	public void escalar(int mulX, int mulY) {
		for (int i = 0; i < listado_puntos.length; i++) {
			listado_puntos[i].setX(listado_puntos[i].getX() * mulX);
			listado_puntos[i].setY(listado_puntos[i].getY() * mulY);
		}
	}

	public int numVertices() {
		return (this.listado_puntos.length);
	}
}
