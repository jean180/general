/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.util.Scanner;

public class ejer64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		int dimension, valor, suma_linea = 0, comparador = 0;

		// Inicio
		System.out.println("introduce la dimensión del cuadrado");
		dimension = teclado.nextInt();
		int[][] vector = new int[dimension][dimension];

		// Rellenar valores
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				System.out.println("Introduzca valor del vector [" + i + "][" + j + "]");
				valor = teclado.nextInt();
				vector[i][j] = valor;
			}

		}
		
		// Linea
		for (int i = 0; i < vector.length; i++) {
			comparador = suma_linea;
			suma_linea = 0;
			for (int j = 0; j < vector.length; j++) {
				suma_linea = suma_linea + vector[i][j];
			}
			if (i > 0 && suma_linea != comparador) {
				System.out.println("no es un cuadrado mágico");
			}
		}

		// Columna
		for (int i = 0; i < vector.length; i++) {
			comparador = suma_linea;
			suma_linea = 0;
			for (int j = 0; j < vector.length; j++) {
				suma_linea = suma_linea + vector[j][i];
			}
			if (i > 0 && suma_linea != comparador) {
				System.out.println("no es un cuadrado mágico");
			}
		}

		// Diagonal1
		for (int i = 0; i < vector.length; i++) {
			comparador = suma_linea;

			suma_linea = 0;
			
			for (int j = 0; j < vector.length; j++) {
				if (i == j) {
					suma_linea = suma_linea + vector[j][i];
					if (i > 0 && suma_linea != comparador) {
						System.out.println("no es un cuadrado mágico");
					}
				}
				
			}
		}

	}

}
