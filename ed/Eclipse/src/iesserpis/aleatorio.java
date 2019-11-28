package iesserpis;

import java.util.*;

public class aleatorio {
	public static void main(String[] args) {
		// Declaraciones
		Scanner teclado = new Scanner(System.in);
		int Aleatorio, Introducido, Intentos = 0, Extremoizquierdo = 1, Extremoderecho = 1000;
		Random Random = new Random();
		Aleatorio = Random.nextInt(1000) + 1;

		// Inicio
		do {
			System.out.printf("Adivina el número entre %s y %s: ",Extremoizquierdo, Extremoderecho);
			Introducido = teclado.nextInt();
			if (Introducido < Aleatorio ) {
				Extremoizquierdo = Introducido + 1;
			} else if (Introducido > Aleatorio) {
				Extremoderecho = Introducido - 1;
			}
			Intentos++;

		} while (Introducido != Aleatorio);
		System.out.println("Felicidades, has acertado, solo te ha costado " + Intentos + " intentos");

	}// Main
}// Class
