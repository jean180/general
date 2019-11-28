/**
 * 
 */
package iesserpis.PRG.UD05_02;

import java.util.Scanner;

/**
 * @author jeaagu
 *
 */
public class ejer65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		String password, part;
		char caracter;
		int bucle = 0, arroba, minuscula = 0, error, mayuscula = 0, digito;

		// Inicio
		System.out.println(
				"El password ha de tener las siguientes restricciones: \n" + "1- Ha de tener, al menos, 8 caracteres.\n"
						+ "2- Al menos la mitad del password ha de estar en minúsculas.\n"
						+ "3- El password ha de tener, al menos, 2 mayúsculas.\n"
						+ "4- El password ha de tener, al menos, 3 números.\n"
						+ "5- El password NO ha de incluir el carácter ‘@’.");
		// Bucle
		while (bucle == 0) {
			error = 0;
			minuscula = 0;
			mayuscula = 0;
			digito = 0;
			arroba = 0;

			// introducción de password
			password = teclado.next();

			// si no tiene al menos 8 caracteres
			if (password.length() < 8) {
				System.out.println("El tamaño del password ha de ser de, al menos, 8 caracteres, y el suyo es de "
						+ password.length());
				error++;
			}

			// contar minusculas
			String[] partes = password.split("");
			for (int i = 0; i < password.length(); i++) {
				part = partes[i];
				caracter = part.charAt(0);
				if (Character.isLowerCase(caracter)) {
					minuscula++;
				}
			}
			// si menos de la mitad de caracteres son minusculas
			int mitad = password.length() / 2;
			if (minuscula < mitad) {
				System.out.println("La mitad del password no está en minusculas. Debería contener " + mitad
						+ " y solo contiene " + minuscula);
				error++;

			}

			// contar mayusculas
			for (int i = 0; i < password.length(); i++) {
				part = partes[i];
				caracter = part.charAt(0);
				if (Character.isUpperCase(caracter)) {
					mayuscula++;
				}
			}

			// si hay menos de 2 mayusculas
			if (mayuscula < 2) {
				System.out.println("Deben existir, al menos 2 mayúsculas y solo tienes " + mayuscula);
				error++;

			}

			// contar números
			for (int i = 0; i < password.length(); i++) {
				part = partes[i];
				caracter = part.charAt(0);
				if (Character.isDigit(caracter)) {
					digito++;
				}
			}

			// Si hay menos de 3 numeros
			if (digito < 3) {
				System.out.println("Deben existir, al menos, 3 números y solo tienes " + digito);
				error++;
			}

			// mirar si hay algún arroba
			arroba = password.indexOf('@');
			// Si hay algún arroba
			if (arroba >= 0) {
				System.out.println("El password no puede contener el carácter '@'");
				error++;
			}

			// Si el contador error=0 finalizar programa
			if (error == 0) {
				System.out.println("El password cumple todas las restricciones. Enhorabuena!");
				System.exit(0);
			}
			System.out.println("----------------------");
		}
	}
}
