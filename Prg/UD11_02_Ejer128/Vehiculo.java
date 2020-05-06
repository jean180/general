package UD11_02_Ejer128;

public class Vehiculo {
	private String matricula;
	protected int velocidad;

	public Vehiculo(String matricula) {
		this.matricula = matricula;
		this.velocidad = 0;
	}

	public String toString() {
		return "matricula: " + this.matricula + " -- Velocidad: " + this.velocidad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void acelerar(int aumento) throws Exception {
		this.velocidad += aumento;
	}
}
