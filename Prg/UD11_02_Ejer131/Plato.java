package UD11_02_Ejer131;

import java.util.ArrayList;
import java.util.Iterator;

public class Plato implements Interface_Plato {
	private String nombre;
	private int precio;
	private ArrayList<Ingredientes> lista_ingredientes;

	public Plato(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.precio = Calcular_Precio(nombre);
		this.lista_ingredientes = new ArrayList<Ingredientes>();
	}

	public int Calcular_Precio(String nombre) {
		String[] partes = nombre.split("");
		if (partes[0].equalsIgnoreCase("a") || partes[0].equalsIgnoreCase("e") || partes[0].equalsIgnoreCase("i")
				|| partes[0].equalsIgnoreCase("o") || partes[0].equalsIgnoreCase("u")) {
			return 10;
		} else {
			return 5;
		}
	}

	@Override
	public void anyadir_ingrediente(Ingredientes ingrediente) {
		// TODO Auto-generated method stub
		lista_ingredientes.add(ingrediente);

	}

	@Override
	public String consultar_ingreditentes() {
		// TODO Auto-generated method stub
		String ingredientesTotales = "";
		Iterator<Ingredientes> iter = lista_ingredientes.iterator();
		while (iter.hasNext()) {
			Ingredientes ingredientes = (Ingredientes) iter.next();
			ingredientesTotales += "\n" + ingredientes.detalleIngrediente();
		}
		return ingredientesTotales;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
}
