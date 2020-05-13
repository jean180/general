package UD11_02_Ejer130;

enum RazaPerro {
	PastorAleman, Husky, FoxTerrier, Dalmata, Beagle, SanBernardo
}

public class Perro extends Animal {
	protected RazaPerro Raza;
	protected String microchip;

	public Perro(String nombre, String fechaNacimiento, double peso, String microchip, RazaPerro Raza) {
		super(nombre, fechaNacimiento, peso);
		this.microchip = microchip;
		this.Raza = Raza;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nFicha de Perro\n" + "Nombre: " + this.nombre + "\nRaza: " + this.Raza + "\nFecha de Nacimiento: "
				+ this.fechaNacimiento + "\nPeso: " + this.peso + "KG\nMicrochip: " + this.microchip + "\nComentarios: "
				+ this.comentarios + "\n";
	}
}
