package eva2;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author jean_
 *
 */
public class Ejer78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		String palabra, palabra_min;
		String palabra_comp = "";
		String[] partes;
		String comparador = "";
		String split;
		String letra, letra_min;
		int acierto = 0;
		int intentos = 0;
		int contador = 0;
		String[] vector;
		String[] comparador2;

		// Inicio
		// Introduccion de palabra a adivinar
		System.out.println("JUGADOR 1: Introduzca la palabra a adivinar:");
		// Palabra a adivinar
		palabra = teclado.nextLine();
		partes = palabra.split(" ");
		palabra = "";
		for (int i = 0; i < partes.length; i++) {
			palabra = palabra + partes[i];
		}
		
		// Paso a mayusculas
		palabra_min = palabra.toLowerCase();
		// Split
		partes = palabra_min.split("");
		// establecer longitud vector
		vector = new String[palabra_min.length()];
		comparador2 = new String[palabra_min.length()];

		// Relleno vector
		for (int i = 0; i < palabra_min.length(); i++) {
			vector[i] = partes[i];
		}
		for (int i = 0; i < comparador2.length; i++) {
			comparador2[i] = "*";
		}

		// Comienzo juego
		System.out.println("JUGADOR 2: La palabra adivinar es la siguiente:");
		for (int i = 0; i < comparador2.length; i++) {
			System.out.print(comparador2[i]);
		}
		System.out.println();
		// Mientras no adivine
		while (acierto == 0) {
			// Segun el numero de fallos imprime el ahorcado con mas o menos vidas

			// Introducci�n de letra
			// Hacer mientras lo introducido no sea una sola letra
			do {
				System.out.println("Introduzca una letra: ");
				letra = teclado.next();
			} while (letra.length() != 1);
			// Pasar a mayuscula
			letra_min = letra.toLowerCase();
			// Igualar contador a 0
			contador = 0;
			// Recorremos el vector
			for (int i = 0; i < vector.length; i++) {
				// Si la celda esta vacia
				if (comparador2[i].contentEquals("*")) {
					// Si la celda contiene la letra que hemos introducido
					if (vector[i].contentEquals(letra_min)) {
						// Imprimimos la letra
						System.out.print(letra_min);
						// A�adir la letra al comparador
						comparador = (letra_min);
						// Sumar 1 al contador
						contador++;

						// Si la celda vacia no contiene la letra que hemos introducido
					} else {
						// Imprimimos una barra baja
						System.out.print("*");
						// A�adimos una barra baja al string comparador
						comparador = ("*");
					}
					// A�adimos la letra o la barra baja a un vector
					comparador2[i] = comparador;

					// Si la celda no esta vacia
				} else {
					if (vector[i].contentEquals(letra_min)) {
						contador++;
					}
					// Imprimimos la letra en el vector
					System.out.print(comparador2[i]);
				}

				// Volvemos a comprobar hasta recorrer toda la palabra
			}
			// Si el contador es 0 quiere decir que la letra que hemos introducido no esta
			// en la palabra a adivinar
			if (contador == 0) {
				System.out.println("\nla letra " + letra_min + " no se encuentra en la palabra");
				// Sumamos 1 a los intentos (fallos)
				intentos++;
				switch (intentos) {
				case 1:
					System.out.println("Error 1 de 8: Te pinto la horca");
					break;
				case 2:
					System.out.println("Error 2 de 8: Te pinto la cabeza");
					break;
				case 3:
					System.out.println("Error 3 de 8: Te pinto el cuerpo");
					break;
				case 4:
					System.out.println("Error 4 de 8: Te pinto el brazo izquierdo");
					break;
				case 5:
					System.out.println("Error 5 de 8: Te pinto el brazo derecho");
					break;
				case 6:
					System.out.println("Error 6 de 8: Te pinto la pierna izquierda");
					break;
				case 7:
					System.out.println("Error 7 de 8: Te pinto la pierna derecha");
					break;
				case 8:
					System.out.println("Error 8 de 8: AHORCADO!");
					System.exit(0);
				}
			} else {
				System.out.println("\nla letra " + letra_min + " estaba en la palabra " + contador + " veces");
			}
			System.out.println();
			// Igualamos el string a ""
			palabra_comp = "";
			// for de la longitud del comparador2
			for (int i = 0; i < comparador2.length; i++) {
				palabra_comp = (palabra_comp + comparador2[i]);
			}
			// comprobamos si hemos adivinado toda la palabra
			if (palabra_min.contentEquals(palabra_comp)) {
				// Igualamos acierto a 1 por lo cual el bucle no lo realizaria de nuevo
				acierto = 1;
			}
		}
		System.out.println("FELICIDADES!!! HAS LOGRADO ADIVNIAR LA PALABRA");
	}
}
