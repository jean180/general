/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ejer57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		// Inicio
		System.out.println("1.- Longitud de una cadena\n" + "2.- Comparación de dos cadenas\n"
				+ "3.- Concatenación de dos cadenas\n" + "4.- Obtener subcadenas\n" + "5.- Invertir cadenas\n"
				+ "6.- Es palíndromo\n" + "9.- Salir");

		while (opcion != 9) {
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				opcion1();
				break;

			case 2:
				opcion2();
				break;

			case 3:
				opcion3();
				break;

			case 4:
				opcion4();
				break;

			case 5:
				opcion5();
				break;
				
			case 6:
				opcion6();
				break;
			default:
				break;
			}
		}

	}

	public static void opcion1() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una cadena: ");
		String cadena = teclado.nextLine();
		System.out.println("La longitud es de " + cadena.length());
	}

	public static void opcion2() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una cadena: ");
		String cadena1 = teclado.nextLine();
		System.out.println("introduce otra cadena: ");
		String cadena2 = teclado.nextLine();
		int i = cadena1.compareTo(cadena2);

		if (i == 0) {
			System.out.println("Las cadenas son iguales");
		} else if (i > 0) {
			System.out.println("La cadena 2 es mayor");
		} else {
			System.out.println("La cadena 1 es mayor");
		}
	}
	
	public static void opcion3() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una cadena: ");
		String cadena1 = teclado.nextLine();
		System.out.println("introduce otra cadena: ");
		String cadena2 = teclado.nextLine();
		System.out.print(cadena1.concat(cadena2));
	}
	public static void opcion4() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una cadena: ");
		String cadena1 = teclado.nextLine();
		System.out.println("introduce un numero:");
		int num1=teclado.nextInt();
		System.out.println("introduce otro numero:");
		int num2=teclado.nextInt();
		String sub = cadena1.substring(num1,num2);
		System.out.println(sub);
		
	}
	
	public static void opcion5() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una cadena");
		String cadena = teclado.nextLine();
		StringBuilder builder=new StringBuilder(cadena);
	    String sCadenaInvertida=builder.reverse().toString();
	    System.out.println(sCadenaInvertida);
	}
	
	public static void opcion6() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una cadena");
		String cadena = teclado.nextLine();
		cadena=cadena.toLowerCase();
		StringBuilder builder=new StringBuilder(cadena);
	    String sCadenaInvertida=builder.reverse().toString();
	    int i = cadena.compareTo(sCadenaInvertida);
	    if (i==0) {
			System.out.println("es un palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}
}
