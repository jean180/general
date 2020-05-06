package UD11_02_Ejer125;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		ListaMultimedia lista1 = new ListaMultimedia(10);
		String titulo, autor, formato, actor, actriz;
		int duracion;
		for (int i = 0; i < 3; i++) {
			System.out.println("Titulo de la pelicula " + i + ":");
			titulo = teclado.nextLine();
			System.out.println("Autor de la pelicula " + i + ":");
			autor = teclado.nextLine();
			System.out.println("formato de la pelicula " + i + ":");
			formato = teclado.nextLine();
			System.out.println("Duración de la pelicula " + i + ":");
			duracion = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Actor de la pelicula " + i + "");
			actor = teclado.nextLine();
			System.out.println("Actriz de la pelicual " + i + ":");
			actriz = teclado.nextLine();
			Pelicula peli = new Pelicula(titulo, autor, formato, duracion, actor, actriz);
			lista1.add(peli);
		}
		System.out.println(lista1.toString());
		Pelicula busca = new Pelicula("Titanic", "James Cameron", "0", 0, "0", "0");
		int posicion = lista1.indexOf(busca);
		Pelicula recupera = (Pelicula) lista1.get(posicion);
		System.out.println("Posicion " + posicion + ":" + recupera.toString());
	}

}
