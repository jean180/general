/*
 * ejer52
 * @author Jean Ramos
 * 
 */
package iesserpis.PRG.UD05_02;

import java.util.Scanner;

public class ejer52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		int[] v = new int[100];
		int suma = 0;
		int media;

		//Inicio
		//Vector
		for (int i = 0; i < v.length; i++) {
			v[i] = i;
			System.out.println("Posición:\t"+i+"\tValor:\t"+(v[i] + 1));
			suma = suma +(v[i]+1);
		}
		//Salida por pantalla de la media y la suma
		media = suma / v.length;
		System.out.println("La suma total es ="+suma+" y la media es ="+media);
	}

}
