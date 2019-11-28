/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejer63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		int dimension, valor;

		System.out.println("Introduzca la dimensión del vector");
		// Introducción de datos
		dimension = teclado.nextInt();

		// Creación de vector
		int[] vector = new int[dimension];

		// Rellenar vector con numeros aleatorios
		for (int i = 0; i < vector.length; i++) {
			valor = (int) (random.nextDouble() * 100 + 1);
			vector[i] = valor;
			System.out.print(vector[i] + " ");
		}
		System.out.println("");

		// Crear nuevo vector y copiar contenido
		int[] vector2 = Arrays.copyOfRange(vector, 0, vector.length);

		// Ordenar nuevo vector
		Arrays.sort(vector2);

		// Comparar vectores
		if (Arrays.equals(vector, vector2)) {
			System.out.println("El vector sí está ordenado");
		} else {
			System.out.println("El vector no está ordenado");
		}
	}

}
