/**
 * 
 */
package iesserpis.PRG.UD05_02;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jeaagu
 *
 */
public class ejer66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		int numero, contador, filas, columnas, inferior, superior, valor;
		String buscar = "default";
		// Inicio
		// Filas
		System.out.println("Introduza num de filas de la matriz:");
		filas = teclado.nextInt();

		// Columnas
		System.out.println("Introduza num de columnas de la matriz:");
		columnas = teclado.nextInt();

		// Vector
		int[][] vector = new int[filas][columnas];

		// Inferior
		System.out.println("Introduzca número inferior del rango:");
		inferior = teclado.nextInt();

		// Superior
		System.out.println("Introduzca número superior del rango:");
		superior = teclado.nextInt();

		// Rellenar vector
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				valor = (int) (random.nextDouble() * (superior - inferior + 1) + inferior);
				vector[i][j] = valor;
			}
		}

		// Imprimir
		System.out.println("La matriz introducida es la siguiente:");
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				System.out.print("[" + vector[i][j] + "]");
			}
			System.out.println();
		}

		// bucle
		while (buscar.contentEquals("salir")==false) {
			contador = 0;
			System.out.println("¿Qué numero quieres buscar en la matriz?");
			buscar = teclado.next();
			// Si entrada es "salir" terminar programa
			if (buscar.contentEquals("salir")) {
				System.out.println("Gracias por utilizar el programa de la matriz");
				break;
			}
			// Pasar String a Int
			numero = Integer.parseInt(buscar);

			// Si numero esta fuera de rango
			if (numero < inferior || numero > superior) {
				System.out.println("El valor introducido, " + numero + " está fuera del rango [" + inferior + ","
						+ superior + "]");
			} else {
				contador = 0;
				// Si no, contar veces que aparece numero en vector
				for (int i = 0; i < vector.length; i++) {
					for (int j = 0; j < vector[0].length; j++) {
						if (numero == vector[i][j]) {
							contador++;
						}
					}
				}
				// Si contador=0 el número esta en la rango mas no en el vector
				if (contador == 0) {
					System.out.println("El valor " + numero + " está en el rango, pero no aparece ninguna vez");
				} else {
					System.out.println("El valor " + numero + " está en la matriz y aparece " + contador + " veces");
					// Imprimir en que posición se ha encontrado numero
					for (int i = 0; i < vector.length; i++) {
						for (int j = 0; j < vector[0].length; j++) {
							if (numero == vector[i][j]) {
								System.out.println("Lo encuentro en la posición [" + i + "][" + j + "]");
							}
						}
					}
				}
			}
		}
	}
}
