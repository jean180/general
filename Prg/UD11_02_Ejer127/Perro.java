package UD11_02_Ejer127;

public class Perro extends Mascota {

	public Perro(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public String sonido() {
		return "guau guau";
	}
}
