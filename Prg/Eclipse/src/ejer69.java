/**
 * 
 */
package iesserpis.PRG.UD05_02;

import java.util.Random;

/**
 * @author jeaagu
 *
 */
public class ejer69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Random random = new Random();
		char c;
		
		c = (char) (random.nextDouble() * (90 - 65 + 1) + 65);

		System.out.println("Empezaremos a preguntar por los apellidos comenzados con "+c);
	}

}
