package UD11_02_Ejer130;

enum EspeciePajaro {
	Canario, Periquito, Agaporni
}

public class Pajaro extends Animal {
	protected EspeciePajaro Especie;
	protected boolean Cantor;

	public Pajaro(String nombre, String fechaNacimiento, double peso, boolean Cantor, EspeciePajaro Especie) {
		super(nombre, fechaNacimiento, peso);
		this.Cantor = Cantor;
		this.Especie = Especie;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nFicha de Pajaro\n" + "Nombre: " + this.nombre + "\nEspecie: " + this.Especie
				+ "\nFecha de Nacimiento: " + this.fechaNacimiento + "\nPeso: " + this.peso + "KG\nComentarios: "
				+ this.comentarios + "\n";
	}
}
