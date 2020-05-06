package UD11_02_Ejer127;

public class Gato extends Mascota {
	private String nombre;

	public Gato(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public String sonido() {
		return "miau";
	}
}
