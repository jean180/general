import java.util.Scanner;

/**
 * 
 */

/**
 * @author jeaagu
 *
 */
public class Bingo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nombre;
		int jugadores = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.println("introduce nombre del jugador " + i);
			nombre = teclado.nextLine();
			if (nombre.equalsIgnoreCase("salir") && i > 2) {
				break;
			} else if (nombre.equalsIgnoreCase("salir") && i <= 2) {
				System.out.println("minimo 2 jugadores");
				i--;
			}

		}

	}

}
