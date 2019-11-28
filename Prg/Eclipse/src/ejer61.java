/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class ejer61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Random r = new Random();
		Scanner teclado = new Scanner(System.in);
		int tamano, valor, opcion = 0;

		// Inicio
		System.out.println("Indica el tamaño del array:");
		tamano = teclado.nextInt();

		int[] vector = new int[tamano];

		while (opcion != 9) {
			System.out.println("\n--------------Pulse una opción del menú:-------------\n"
					+ "1-Rellenar vector por teclado\n" + "2-Rellenar vector de forma aleatoria (nums de 1 a 100\n"
					+ "3-Modificar una posición del vector\n" + "4-Consultar una posición del vector\n"
					+ "5-Mostrar todo el vector\n" + "6-Ordenar ascendentemente el vector\n" + "9-Salir\n"
					+ "-----------------------------------------------------");

			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				for (int i = 0; i < vector.length; i++) {
					System.out.println("Introduce valor de la matriz [" + i + "]");
					valor = teclado.nextInt();
					vector[i] = valor;
				}
				break;

			case 2:
				for (int i = 0; i < vector.length; i++) {
					valor = (int) (r.nextDouble() * 100 + 1);
					vector[i] = valor;
				}

				break;

			case 3:
				System.out.println("¿Que posición quiere modificar?");
				int posicion = teclado.nextInt();
				if (0 < posicion && posicion < vector.length) {
					System.out.println("Introduzca el nuevo valor: ");
					valor = teclado.nextInt();
					vector[posicion] = valor;
				} else {
					System.out.println("Posición fuera de rango");
				}
				break;

			case 4:
				System.out.println("Indica la posición");
				posicion = teclado.nextInt();
				if (0 < posicion && posicion < vector.length) {
					System.out.println("El valor contenido en " + posicion + " es:" + vector[posicion]);
				} else {
					System.out.println("Posición fuera de rango");
				}
				break;

			case 5:
				for (int i = 0; i < vector.length; i++) {
					if (i == 0) {
						System.out.print("[" + vector[i] + ", ");

					} else if (i == (vector.length - 1)) {
						System.out.print(vector[i] + "]");

					} else {
						System.out.print(vector[i] + ", ");

					}
				}
				System.out.println();
				break;

			case 6:
				Arrays.sort(vector);
				break;

			case 9:
				System.out.println("Gracias por utilizar este menú");
				System.exit(0);
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}

		}

	}

}
