package UD11_02_Ejer129;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}

	private static void Menu() {
		ArrayList<Pelicula> lista = new ArrayList<Pelicula>();
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("1-Dar de alta una pelicula");
			System.out.println("2-Listar peliculas ordenadas por titulo");
			System.out.println("3-Listar peliculas ordenadas por valoración");
			System.out.println("4-Salir de la aplicación");
			int opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion) {
			case 1:
				Opcion1(lista);
				break;
			case 2:
				Opcion2(lista);
				break;
			case 3:
				Opcion3(lista);
				break;
			case 4:
				System.out.println("Gracias por utilizar esta base de datos de películas");
				System.exit(0);
				break;
			default:
				System.out.println("ERROR - Opción incorrecta");
				break;
			}
		} while (true);
	}

	private static void Opcion1(ArrayList<Pelicula> lista) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca titulo de la pelicula:");
		String titulo = teclado.nextLine();
		System.out.println("Introduzca duración de la pelicula:");
		int duracion = teclado.nextInt();
		int nota;
		do {
			System.out.println("Introduzca nota de la pelicula:");
			nota = teclado.nextInt();
			teclado.nextLine();
			if (0 > nota || nota > 10) {
				System.out.println("ERROR - La nota tiene que ser 0-10");
			} else {
				break;
			}
		} while (true);
		String genero;
		do {
			System.out.println("Introduzca genero de la pelicula (Comedia, Drama, Terror, o Ciencia-Ficcion");
			genero = teclado.nextLine();
			if (!genero.equalsIgnoreCase("Comedia") && !genero.equalsIgnoreCase("Drama")
					&& !genero.equalsIgnoreCase("Terror") && !genero.equalsIgnoreCase("Ciencia-Ficcion")) {
				System.out.println("ERROR - Genero invalido");
			} else {
				break;
			}
		} while (true);
		Pelicula peli = new Pelicula(titulo, genero, duracion, nota);
		lista.add(peli);

	}

	private static void Opcion2(ArrayList<Pelicula> lista) {
		Collections.sort(lista, new Comparator<Pelicula>() {
			public int compare(Pelicula obj1, Pelicula obj2) {
				return obj1.getTitulo().compareTo(obj2.getTitulo());
			}
		});
		System.out.println("LISTADO DE PELICULAS");
		System.out.println("--------------------");
		Iterator<Pelicula> peli = lista.iterator();
		while (peli.hasNext()) {
			Pelicula pelicula = (Pelicula) peli.next();
			System.out.println(pelicula.toString());

		}
		System.out.println("--------------------");
	}

	private static void Opcion3(ArrayList<Pelicula> lista) {
		Collections.sort(lista, new Comparator<Pelicula>() {
			public int compare(Pelicula p1, Pelicula p2) {
				return new Integer(p1.getValoracion()).compareTo(p2.getValoracion());
			}
		});
		System.out.println("LISTADO DE PELICULAS");
		System.out.println("--------------------");
		Iterator<Pelicula> peli = lista.iterator();
		while (peli.hasNext()) {
			Pelicula pelicula = (Pelicula) peli.next();
			System.out.println(pelicula.toString());

		}
		System.out.println("--------------------");
	}

}
