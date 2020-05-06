package UD11_02_Ejer127;

public class Conejo extends Mascota {
	private String nombre;
	private String sonido;

	public Conejo(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public String sonido() {
		return "rabiiit raaaaabit";
	}
}
