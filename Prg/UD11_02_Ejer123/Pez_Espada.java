package UD11_02_Ejer123;

public class Pez_Espada extends Pez {
	private String lugar_pesca;

	public Pez_Espada(String nombre, int Escamas, double peso, String lugar_pesca) {
		super(nombre, Escamas, peso);
		this.lugar_pesca = lugar_pesca;
	}

	public boolean autentico() {
		if (lugar_pesca.equals("Mediterraneo")) {
			return false;
		} else if (lugar_pesca.equals("Atlántico") || lugar_pesca.equals("Pacífico")) {
			return true;
		} else {
			return false;
		}
	}
}
