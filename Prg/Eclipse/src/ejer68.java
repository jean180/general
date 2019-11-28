/**
 * 
 */
package iesserpis.PRG.UD05_02;

import java.util.Scanner;

/**
 * @author jeaagu
 *
 */
public class ejer68 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		String cadena;
		String caracter = "@";

		System.out.println("Introduzca una cadena: ");
		cadena = teclado.nextLine();

		String[] vector = new String[cadena.length()];
		String[] partes = cadena.split("");
		for (int i = 0; i < vector.length; i++) {
			if (partes[i].equals(" ")) {
				vector[i] = "@";
			} else {
				vector[i] = partes[i];
			}
		}
		System.out.println("Introducimos la cadena en el vector: ");
		System.out.print("[");
		for (int i = 0; i < partes.length; i++) {
			System.out.print(vector[i]+", ");
		}
		System.out.println("]");
	}

}
