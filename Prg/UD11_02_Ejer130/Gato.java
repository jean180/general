package UD11_02_Ejer130;

enum RazaGato {
	Comun, Siames, Persa, Angora, ScottidhFold;
}

public class Gato extends Animal {
	protected RazaGato Raza;
	protected String Microchip;

	public Gato(String nombre, String fechaNacimiento, double peso, String microchip, RazaGato Raza) {
		super(nombre, fechaNacimiento, peso);
		this.Microchip = microchip;
		this.Raza = Raza;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nFicha de Gato\n" + "Nombre: " + this.nombre + "\nRaza: " + this.Raza + "\nFecha de Nacimiento: "
				+ this.fechaNacimiento + "\nPeso: " + this.peso + "KG\nMicrochip: " + this.Microchip + "\nComentarios: "
				+ this.comentarios + "\n";
	}
}
