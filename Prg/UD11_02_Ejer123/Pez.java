package UD11_02_Ejer123;

public class Pez {
	private String Nombre;
	private int Escamas;
	protected double peso;

	public Pez(String nombre, int Escamas, double peso) {
		this.Nombre = nombre;
		this.Escamas = Escamas;
		this.peso = peso;
	}

	public String calibre() {
		String calibre = "";
		if (peso < 100) {
			calibre = "pequeño";
		} else if (peso < 300) {
			calibre = "mediano";
		} else if (peso < 500) {
			calibre = "grande";
		} else {
			calibre = "cachalote";
		}
		return calibre;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public int getEscamanas() {
		return Escamas;
	}

	public void setEscamas(int Escamas) {
		this.Escamas = Escamas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
