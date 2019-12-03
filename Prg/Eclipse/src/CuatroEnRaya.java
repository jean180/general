import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author jeaagu
 *
 */
public class CuatroEnRaya {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		boolean jugador = true, victoria = false;
		Random Random = new Random();
		int posicion;
		String[][] tablero = new String[6][7];
		// rellenar tablero con espacios
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = " ";
			}
		}
		System.out.println("Bienvenido al 4 en raya");
		// hacer mientras no haya ganador
		do {
			// Si es el turno del jugador
			if (jugador == true) {
				// Hacer mientras la tirada no sea valida
				do {
					System.out.println("Indica la posicion de tu tirada ");
					posicion = teclado.nextInt();
					// Si la tirada esta fuera del rango
					if (posicion < 0 || posicion > 6) {
						System.out.println("Posicion incorrecta");
						// Si esta dentrod el rango, comprobar si hay hueco
					} else {
						if (validar(tablero, posicion) == false) {
							System.out.println("No hay hueco, escoge otra casilla");
						}
					}
				} while (posicion < 0 || posicion > 6 || validar(tablero, posicion) == false);
				// Ejecutar tirada
				tirada(tablero, posicion, jugador);
				// cambiar boolean
				jugador = false;

				// Si no es el turno del jugador
			} else if (jugador == false) {
				// Hacer mientras que la posicion elegida aleatoriamente no haya hueco
				do {
					posicion = Random.nextInt(7);
				} while (validar(tablero, posicion) == false);
				System.out.println("la tirada de la maquina es " + posicion);
				// Ejecutar tirada
				tirada(tablero, posicion, jugador);
				// Cambiar boolean
				jugador = true;
			}
			// mostrar tablero
			mostrar(tablero);
			ganador(tablero, jugador);
		} while (victoria == false);

	}

	// verificar si hay alguna casilla libre
	public static boolean validar(String[][] tablero, int posicion) {
		boolean libre = false;
		for (int i = 5; i >= 0; i--) {
			if (tablero[i][posicion].equals(" ")) {
				libre = true;
				break;
			}
		}
		return libre;
	}

	// Ejecutar tirada
	public static String[][] tirada(String[][] tablero, int posicion, boolean jugador) {
		for (int i = 5; i >= 0; i--) {
			if (tablero[i][posicion].equals(" ")) {
				if (jugador == true) {
					tablero[i][posicion] = "X";
				} else if (jugador == false) {
					tablero[i][posicion] = "O";
				}
				break;
			}
		}
		return tablero;
	}

	// Mostrar el tablero
	public static void mostrar(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print("[" + tablero[i][j] + "]");
			}
			System.out.println();
		}
	}

	// Verificar si hay ganador
	public static void ganador(String[][] tablero, boolean jugador) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < 5; j++) {
				if (jugador == true) {
					if (tablero[i][j].equals("X")) {
						for (int j2 = 0; j2 < 4; j2++) {
							if (tablero[i][j + j2].equals("X") == false) {
								break;
							} else if (j2 == 3) {
								System.out.println("Has ganado");
								System.exit(0);
							}
						}
					}
				}
			}
		}
	}
}
