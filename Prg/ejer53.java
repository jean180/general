/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.util.Random;
import java.util.Scanner;

public class ejer53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Random r = new Random();
		Scanner teclado = new Scanner(System.in);
		int aleatorio, usuario, contador = 0;
		// Inicio
		//Generación del número aleatorio (1-100)
		aleatorio = (int) (r.nextDouble() * 100 + 1);		 
		System.out.println("El juego del número mágico");
		//ciclo mientras no acierte el número
		do { 												
			System.out.println("Introduzca número: ");
			usuario = teclado.nextInt();
			if (aleatorio < usuario) {
				System.out.println("El número mágico es menor!");
			} else if (aleatorio > usuario) {
				System.out.println("El número mágico es mayor!");
			}
			contador++;
		} while ((usuario == aleatorio) == false);
		//Salida por pantalla de resultados
		System.out.println("Enhorabuena! Has acertado el numero que era el " + aleatorio + "!");
		System.out.println("Lo has solucionado en " + contador + " intentos!");
	}

}
