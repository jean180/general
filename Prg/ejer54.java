/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.util.Random;
import java.util.Scanner;

public class ejer54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaraciones
		Random r = new Random();
		Scanner teclado = new Scanner(System.in);
		int tamaño, suma = 0, aleatorio, superior, inferior;
		
		//Inicio
		System.out.println("Introduzca tamaño del array:");
		tamaño = teclado.nextInt();
		int[] v = new int[tamaño];
		System.out.println("Introduzca limite inferior para generar números aleatorios:");
		inferior = teclado.nextInt();
		System.out.println("Introduzca limite superior para generar números aleatorios:");
		superior = teclado.nextInt();
		for (int i = 0; i < v.length; i++) {
			aleatorio = (int) (r.nextDouble() * (superior-inferior+1) + inferior);		 
			v[i] = aleatorio;
			suma += aleatorio;
		}
		System.out.println("Se ha generado el siguiente array de "+tamaño+" posiciones:");
		for (int j = 0; j < v.length; j++) {
			System.out.print("["+v[j]+"]");
		}
		System.out.println("\nLa suma de los elementos es: "+suma);
	}

}
