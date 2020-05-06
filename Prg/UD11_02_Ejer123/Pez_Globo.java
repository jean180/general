package UD11_02_Ejer123;

public class Pez_Globo extends Pez {
	private int toxinas;

	public Pez_Globo(String nombre, int Escamas, double peso, int toxinas) {
		super(nombre, Escamas, peso);
		this.toxinas = toxinas;
	}

	public String riesgo() {
		String riesgo = "";
		double toxina_gramos = toxinas / 1000;
		double diez_ciento = peso * 0.10;
		double veinte_ciento = peso * 0.20;

		if (toxina_gramos <= diez_ciento) {
			riesgo = "inofensivo";
		} else if (toxina_gramos > diez_ciento && toxina_gramos < veinte_ciento) {
			riesgo = "riesgo moderado";
		} else if (toxina_gramos >= veinte_ciento) {
			riesgo = "yo no lo haria";
		}
		return riesgo;
	}

	public int getToxinas() {
		return toxinas;
	}

	public void setToxinas(int toxinas) {
		this.toxinas = toxinas;
	}
}
