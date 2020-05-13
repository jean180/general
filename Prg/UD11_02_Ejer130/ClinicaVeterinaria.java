package UD11_02_Ejer130;

import java.util.ArrayList;
import java.util.Iterator;

public class ClinicaVeterinaria {
	protected ArrayList<Animal> listaAnimales;

	public ClinicaVeterinaria() {
		this.listaAnimales = new ArrayList<Animal>();
	}

	public void InsertaAnimal(Animal animal) {
		listaAnimales.add(animal);
	}

	public Animal BuscaAnimal(String nombreBuscar) {
		Iterator<Animal> iter = listaAnimales.iterator();
		while (iter.hasNext()) {
			Animal animal = (Animal) iter.next();
			if (animal.getNombre().equalsIgnoreCase(nombreBuscar)) {
				return animal;
			}
		}
		return null;
	}

	public void InsertaComentarioAnimal(String nombreBuscar, String comentarioInsertar) {
		Animal aux = BuscaAnimal(nombreBuscar);
		aux.setComentarios(comentarioInsertar);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Iterator<Animal> iter = listaAnimales.iterator();
		String Resultado = "";
		while (iter.hasNext()) {
			Animal animal = (Animal) iter.next();
			Resultado += animal.toString();
		}
		return Resultado;
	}
}
