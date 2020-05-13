package UD11_02_Ejer130;

enum EspecieReptil {
	Tortuga, Iguana, DragonDeComodo, LagartoGigante
}

public class Reptil extends Animal {
	protected boolean venenoso;
	protected EspecieReptil Especie;

	public Reptil(String nombre, String FechaNacimiento, double peso, boolean venenoso, EspecieReptil Especie) {
		super(nombre, FechaNacimiento, peso);
		this.venenoso = venenoso;
		this.Especie = Especie;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nFicha de Reptil\n" + "Nombre: " + this.nombre + "\nEspecie: " + this.Especie
				+ "\nFecha de Nacimiento: " + this.fechaNacimiento + "\nPeso: " + this.peso + "KG\nComentarios: "
				+ this.comentarios + "\n";
	}
}
