/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.util.Scanner;

public class ejer62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		int opcion = 1;
		Scanner teclado = new Scanner(System.in);
		String mail;

		System.out.println("Introduzca un e-mail:");
		mail = teclado.next();
		switch (opcion) {
		case 1:
			int arroba = mail.indexOf('@');
			if (arroba < 0) {
				System.out.println("*DIRECCIÓN INVALIDA*\nLa dirección no contiene un @");
				break;
			}

		case 2:
			arroba = mail.indexOf('@');
			if (arroba == 0) {
				System.out.println("*DIRECCIÓN INVALIDA*\nLa dirección no contiene un identificador1");
				break;
			}

		case 3:
			String[] partes = mail.split("@");
			if (partes[0].length() < 4) {
				System.out.println("*DIRECCIÓN INVALIDA*\nEl identificador es demasiado corto");
				break;
			}

		case 4:
			String[] partes1 = mail.split("@");
			String identificador2 = partes1[1];
			int punto = identificador2.indexOf('.');
			if (punto < 0) {
				System.out.println("*DIRECCIÓN INVALIDA*\nLa dirección no contiene un punto despues del @");
				break;
			}

		case 5:
			
			String[] partes2 = mail.split("@");
			if (partes2[1].length() < 3) {
				System.out.println("ERROR 5: El identificador 2 es demasiado corto");
				break;
			}
	
		case 6:

			String[] partes3 = mail.split(".");
			String dom = partes3[1];
			if (dom.contentEquals("com") == false && dom.contentEquals("es") == false
					&& dom.contentEquals("org") == false && dom.contentEquals("gov") == false) {
				System.out.println("ERROR 6: Dominio distinto a .com, .es, .org, y .gov");
				break;
			}
		case 7:
			System.out.println("Enhorabuena! Mail correcto!");
			break;
		default:
			break;
		}
	}

}
