/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.util.Scanner;

public class ejer58 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		int filas, columnas, valor, suma = 0;

		// Inicio
		// introducir filas
		System.out.println("Indica el número de filas: ");
		filas = teclado.nextInt();
		// Introducir columnas
		System.out.println("Indica el número de columnas: ");
		columnas = teclado.nextInt();
		// Crear matriz
		int[][] matriz = new int[filas][columnas];
		System.out.println("La matriz tendra " + (filas * columnas) + " elementos");
		// Introducir datos de matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("introduce el valor de la matriz[" + i + "][" + j + "]");
				valor = teclado.nextInt();
				matriz[i][j] = valor;
				suma = suma + valor;
			}
		}
		// Recorres y leer matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.printf("Valor [" + i + "][" + j + "]=" + "%4d", matriz[i][j]);
				System.out.printf("\n");
			}

		}
		System.out.println("La suma total es de " + suma);
	}

}
