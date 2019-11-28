/**
 * 
 */
package iesserpis.PRG.UD05_02;

import java.util.Scanner;

/**
 * @author jeaagu
 *
 */
public class ejer67 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		int dimension1, dimension2, mitad, valor = 1;

		// Inicio
		// Preguntar dimensión
		do {
			System.out.println("Introduzca la primera dimensión del vetor");
			dimension1 = teclado.nextInt();
			System.out.println("Introduzca la segunda dimensión del vector");
			dimension2 = teclado.nextInt();
			if (dimension1 != dimension2) {
				System.out.println("Las dimensiones tienen que ser iguales");
			}
			if (dimension1 % 2 == 1 || dimension2 % 2 == 1) {
				System.out.println("Las dimenciones tiene que ser par");
			}
		} while (dimension1 != dimension2 || dimension1 % 2 == 1 || dimension2 % 2 == 1);
		int[][] vector = new int[dimension1][dimension2];
		mitad = dimension1 / 2;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if (i < dimension1 / 2) {
					if (j < dimension2 / 2) {
						vector[i][j] = 1;
					} else {
						vector[i][j] = 2;
					}
				} else {
					if (j < dimension2 / 2) {
						vector[i][j] = 3;
					} else {
						vector[i][j] = 4;
					}
				}
			}
		}

		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				System.out.print(vector[i][j]);
			}
			System.out.println();
		}

	}

}
