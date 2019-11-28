package iesserpis;

import java.util.Scanner;

public class Vectorelegir {

	public static void main(String[] args) {
		// Declaraciones
		Scanner teclado=new Scanner(System.in);
		int[] v = new int[] { 17, 12, 15, 9, 14 };
		int x = teclado.nextInt();
		int index = indexOf(v, x);

		// Inicio
		if (index == -1) {
			System.out.println("Número no encontrado");
		} else {
			System.out.println("La posición es " + index);
		}
		System.out.println("fin");
	}

	public static int indexOf(int[] v, int x) {
		int index = 0;
		while (index < v.length && v[index] != x) 
			index++;
			if (index == v.length) 
				return -1;
			return index;
		
		
		
	}

}
