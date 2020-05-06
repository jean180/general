package UD11_02_Ejer127;

public abstract class Mascota {
	private String nombre;
	protected String tipo;

	public Mascota(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public abstract String sonido();
}
