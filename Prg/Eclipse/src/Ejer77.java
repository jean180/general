/**
 * 
 */
package eva2;

import java.util.Scanner;

/**
 * @author jeaagu
 *
 */
public class Ejer77 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// Introducimos el numero por teclado
		int numero = teclado.nextInt();
		// Igualamos el String palabra a lo que nos devuelve convierteEnPalotes
		String palabra = convierteEnPalotes(numero);
		// Imprimos String palabra
		System.out.println(palabra);
	}

	public static String convierteEnPalotes(int numero) {
		String cadena = "";
		int digito;
		// mientras el numero no sea 0
		while (numero != 0) {
			// sacamos el ultimo digitos igualandolo al resto de la division entre 10
			digito = numero % 10;
			// dividimo int numero entre 10
			numero = numero / 10;
			switch (digito) {
			case 0:
				cadena = "" + cadena;
				break;

			case 1:
				cadena = "|" + cadena;
				break;

			case 2:
				cadena = "||" + cadena;
				break;

			case 3:
				cadena = "|||" + cadena;
				break;

			case 4:
				cadena = "||||" + cadena;
				break;

			case 5:
				cadena = "|||||" + cadena;
				break;

			case 6:
				cadena = "||||||" + cadena;
				break;

			case 7:
				cadena = "|||||||" + cadena;
				break;

			case 8:
				cadena = "||||||||" + cadena;
				break;

			case 9:
				cadena = "|||||||||" + cadena;
				break;
			default:
				break;
			}
			// si el numero es diferente a 0 añadimos un guion a cadena
			if (numero != 0) {
				cadena = "-" + cadena;
			}
		}
		// devolvemos cadena
		return cadena;

	}
}
