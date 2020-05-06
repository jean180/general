package UD11_02_Ejer128;

public class Coche extends Vehiculo {
	private int puertas;

	public Coche(String matricula, int puertas) {
		super(matricula);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}
}
