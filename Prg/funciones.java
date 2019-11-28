/**
 * 
 */
package AceptaElReto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author jean_
 *
 */
public class funciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vector 1 dimension
		int[] v = new int[10];
		for (int i = 0; i < v.length; i++) {
			v[i] = i;
		}
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();

		// Vector 2 dimensiones
		int[][] array = new int[3][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = (i + j);
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		// Vector Strings
		String[] vector = new String[4];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = "A";
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+"-");
		}
		
		System.out.println();
		// Scanner
		Scanner teclado = new Scanner(System.in);

		// Random
		Random random = new Random();
		int aleatorio = (int) (random.nextDouble() * 100 + 1);
		System.out.println("aleatorio " + aleatorio);

		// Random entre 2 números
		int superior = 100, inferior = 50;
		aleatorio = (int) (random.nextDouble() * (superior - inferior + 1) + inferior);
		System.out.println("Aleatorio entre dos numeros " + aleatorio);

		// convertir un tipo de variable a otro
		// https://es.stackoverflow.com/questions/1487/guia-definitiva-de-conversi%C3%B3n-de-tipos-en-java

		// Ejercicio 56 "Fechas"
		// Ejercicio 57 "Uso cadenas"
		// Ejercicio 61 "Arrays"
		// Ejercicio 62 "Mail"

		// Ordenar vector
		Arrays.sort(v);

		// Ejercicio 64 "Cuadrado mágico"
		// Ejercicio 65 "Password"

	}

}
