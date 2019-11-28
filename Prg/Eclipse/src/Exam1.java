/**
 * 
 */
package iesserpis.PRG.UD05_02;

import java.util.Scanner;

/**
 * @author jeaagu
 *
 */
public class Exam1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		boolean victoria = false;
		int[][] tablero = new int[4][4];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = 0;
			}
		}
		// Paredes
		tablero[0][2] = 1;
		tablero[1][0] = 1;
		tablero[2][2] = 1;
		tablero[2][3] = 1;
		tablero[3][0] = 1;
		// Jugador
		tablero[0][0] = 5;
		System.out.println("Bienvenido al laberinto de Paco!");
		System.out.println("Pulse W para arriba, S para abajo, A para la izquierda y D para la derecha");
		System.out.println("Estas en la posicion 0, 0. ¿ Cuál es tu proximo movimiento?");
		char movimiento;
		do {

			movimiento = teclado.next().charAt(0);
			switch (movimiento) {
			case 'w':
			case 'W':
				W(tablero);
				break;

			case 'a':
			case 'A':
				A(tablero);
				break;

			case 's':
			case 'S':
				S(tablero);
				break;

			case 'd':
			case 'D':
				D(tablero);
				break;

			default:
				break;
			}
			// Mostrar posicion
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[0].length; j++) {
					if (tablero[i][j] == 5) {
						if (i == 3 && j == 3) {
							victoria = true;
						} else {
							System.out
									.println("Estas en la casilla " + i + "," + j + ". ¿Cuál es tu próximo movimiento");

						}
					}
				}
			}
		} while (victoria == false);
		System.out.println("Enhorabuena!, has llegado a la casilla 3,3 y por tanto has lelgado al final del laberinto");

	}

	public static int[][] W(int[][] tablero) {
		System.out.println("Has pulsado hacia arriba");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if (tablero[i][j] == 5) {
					if ((i - 1) < 0) {
						System.out.println("Cuidado, que te sales del tablero");
					} else if (tablero[i - 1][j] == 1) {
						System.out.println("Cuidado, que hay una pared");
					} else {
						tablero[i][j] = 0;
						tablero[i - 1][j] = 5;

					}
				}
			}
		}
		return tablero;
	}

	public static int[][] A(int[][] tablero) {
		System.out.println("Has pulsado hacia la izquierda");

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if (tablero[i][j] == 5) {
					if ((j - 1) < 0) {
						System.out.println("Cuidado, que te sales del tablero");
					} else if (tablero[i][j - 1] == 1) {
						System.out.println("Cuidado, hay una pared");
					} else {
						tablero[i][j] = 0;
						tablero[i][j - 1] = 5;
					}
				}
			}
		}
		return tablero;

	}

	public static int[][] S(int[][] tablero) {
		System.out.println("Has pulsado hacia abajo");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if (tablero[i][j] == 5) {
					if ((i + 1) > 3) {
						System.out.println("Cuidado, que te sales del tablero");
					} else if (tablero[i + 1][j] == 1) {
						System.out.println("Cuidado, que hay una pared");
					} else {
						tablero[i][j] = 0;
						tablero[i + 1][j] = 5;
						i = 4;
						j = 4;
					}
				}
			}
		}
		return tablero;

	}

	public static int[][] D(int[][] tablero) {
		System.out.println("Has pulsado hacia la derecha");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if (tablero[i][j] == 5) {
					if ((j + 1) > 3) {
						System.out.println("Cuidado, que te sales del tablero");
					} else if (tablero[i][j + 1] == 1) {
						System.out.println("Cuidado, que hay una pared");
					} else {
						tablero[i][j] = 0;
						tablero[i][j + 1] = 5;
						i = 4;
						j = 4;
					}
				}
			}
		}
		return tablero;

	}

}
