/**
 * @author jeaagu
 *
 */
package iesserpis.PRG.UD05_02;

import java.util.Random;

public class ejer60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Random r = new Random();
		int notas, compas;
		// Inicio
		// Compas divisible entre 4
		do {
			compas = (int) (r.nextDouble() * 28 + 4);
		} while ((compas % 4 == 0) == false);
		int[] v = new int[compas];
		
		
	}

}
