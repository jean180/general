/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.util.Random;

public class ejer59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Random r = new Random();
		int dado1, dado2, contador = 0;

		// Inicio
		System.out.println("Vamos a tirar los dados...");
		do {
			contador++;
			dado1 = (int) (r.nextDouble() * 6 + 1);
			dado2 = (int) (r.nextDouble() * 6 + 1);
			System.out.println("En la tirada " + contador + " ha salido " + dado1 + " y el " + dado2);

		} while (dado1 != dado2);
		System.out.println("Al fin han saligo iguales");
	}

}
