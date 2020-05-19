package UD11_02_Ejer131;

public class Ingredientes implements Interface_Ingrediente {
	private String nombre;
	private int cantidad;

	public Ingredientes(String nombre, int cantidad) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	@Override
	public String detalleIngrediente() {
		// TODO Auto-generated method stub
		return "\nNombre: " + this.nombre + "\tCantidad: " + this.cantidad;
	}
}
