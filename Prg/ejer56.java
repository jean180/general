/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ejer56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		// Inicio
		System.out.println("1.- Obtener fecha actual\n" + "2.- Obtener hora actual\n" + "3.- Sumar días\n"
				+ "4.- Diferencia en días\n" + "5.- Anterior o Posterior\n" + "9.- Salir");
		while (opcion != 9) {
			System.out.println("Escoja una opción: ");
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
			
			case 9:
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}

	}

	public static void opcion1() {
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Fecha actual:\t" + formato.format(ahora));
	}

	public static void opcion2() {
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss");

		System.out.println("Hora actual:\t" + formato.format(ahora));
	}

	public static void opcion3() {
		Date ahora = new Date();
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuantos dias quiere sumar a la fecha actual?");
		int dias = teclado.nextInt();
		Calendar cal = new GregorianCalendar();
		cal.setTimeInMillis(ahora.getTime());
		cal.add(Calendar.DATE, dias);
		Date fechaSuma = new Date(cal.getTimeInMillis());
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Hoy + " + dias + " dias: " + formato.format(fechaSuma));
	}

	public static void opcion4() {
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Scanner teclado = new Scanner(System.in);
		String fecha1, fecha2;
		int dia1, dia2, mes1, mes2, año1, año2;
		long diferencia;
		//Fecha1
		System.out.println("Introduzca la primera fecha en formato dd/MM/yyyy");
		fecha1 = teclado.next();
		String[] partes1=fecha1.split("/");
		dia1= Integer.parseInt(partes1[0]);
		mes1= Integer.parseInt(partes1[1]);
		año1= Integer.parseInt(partes1[2]);
		
		//Fecha2
		System.out.println("Introduzca la segunda fecha en formato dd/MM/yyyy");
		fecha2 = teclado.next();
		String[] partes2=fecha2.split("/");
		dia2= Integer.parseInt(partes2[0]);
		mes2= Integer.parseInt(partes2[1]);
		año2= Integer.parseInt(partes2[2]);
		
		}
		
	public static void opcion5() {
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Fecha actual:\t" + formato.format(ahora));
	}
	}


