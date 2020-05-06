package UD11_02_Ejer127;

public class Periquito extends Mascota {
	private String nombre;

	public Periquito(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public String sonido() {
		return "pio pio";
	}
}
