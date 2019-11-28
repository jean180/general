/**
 * 
 */
package iesserpis.PRG.UD05_02;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jeaagu
 *
 */
public class ejer70 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		Random random = new Random();
		Scanner teclado = new Scanner(System.in);
		int jugador = 0;
		int Pc = 0;
		int fila = -1, columna = -1;
		int aleatorio1 = -1, aleatorio2 = -1;
		int ganador = 0;
		int error = 0;
		int contador_X = 0;
		int contador_O = 0;
		int contador_relleno = 0;
		// Alternar juego, si jugada = 0 juega jugador, si jugada = 1 juega pc
		int jugada = 0;

		// Crear tablero
		String[][] tablero = new String[3][3];
		System.out.println("BIENVENIDO AL 3 EN RAYA");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = "_";
			}
		}

		while (ganador == 0) {

			do {
				do {
					contador_relleno = 0;
					for (int i = 0; i < tablero.length; i++) {
						for (int j = 0; j < tablero[0].length; j++) {
							if (tablero[i][j] == "X" || tablero[i][j] == "O") {
								contador_relleno++;
							}
						}
					}
					if (contador_relleno == 9) {
						System.out.println("Vaya... nadie ha ganado...");
						System.exit(0);
					}
					if (jugada == 0) {
						// Jugada jugador
						error = 0;
						System.out.println("Introduce fila y columna de tu tirada");
						fila = teclado.nextInt();
						columna = teclado.nextInt();
						// Comprobar si están fuera de rango
						if (fila < 0 || fila > 2) {
							System.out.println("La fila está fuera del tablero! Valores posibles: 0, 1, 2");
						}
						if (columna < 0 || columna > 2) {
							System.out.println("La columna está fuera del tablero! Valores posibles: 0, 1, 2");
						}
						// Comprobar si la casilla esta ocupada
						for (int i = 0; i < tablero.length; i++) {
							for (int j = 0; j < tablero[0].length; j++) {
								if (i == fila && j == columna) {
									if (i == aleatorio1 && j == aleatorio2) {
										if (tablero[i][j] == "O" || tablero[i][j] == "X") {
											error = 1;
											System.out.println("Casilla ocupada");
										}
									}
								}
							}
						}

					} else if (jugada == 1) {
						// Jugada PC

						error = 0;
						// Generar números aleatorios
						aleatorio1 = (int) (random.nextDouble() * 3);
						aleatorio2 = (int) (random.nextDouble() * 3);
						// Comprobar si la casilla está ocupada
						for (int i = 0; i < tablero.length; i++) {
							for (int j = 0; j < tablero[0].length; j++) {
								if (i == aleatorio1 && j == aleatorio2) {
									if (tablero[i][j] == "O" || tablero[i][j] == "X") {
										error = 1;
									} else {
										System.out.println("Ahora tira la maquina...");

									}
								}
							}
						}
					}

				} while (error == 1);
			} while (fila < 0 || fila > 2 || columna < 0 || columna > 2);

			// rellenar tablero con jugada
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[0].length; j++) {
					if (tablero[i][j] == "_") {
						if (jugada == 0) {
							if (i == fila && j == columna) {
								tablero[i][j] = "X";
							}
						} else if (jugada == 1) {
							if (i == aleatorio1 && j == aleatorio2) {
								tablero[i][j] = "O";
							}
						}

					}

				}
			}

			// Imprimir tablero

			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[0].length; j++) {

					System.out.print(tablero[i][j] + "\t");
				}
				System.out.println();
			}

			// Comprobar filas
			for (int i = 0; i < tablero.length; i++) {
				if (tablero[i][0] == "X") {
					if (tablero[i][1] == "X") {
						if (tablero[i][2] == "X") {
							ganador = 1;
							jugador++;
						}
					}
				} else if (tablero[i][0] == "O") {
					if (tablero[i][1] == "O") {
						if (tablero[i][2] == "O") {
							ganador = 1;
							Pc++;
						}
					}
				}
			}

			// Comprobar columnas
			for (int j = 0; j < tablero.length; j++) {
				if (tablero[0][j] == "X") {
					if (tablero[1][j] == "X") {
						if (tablero[2][j] == "X") {
							ganador = 1;
							jugador++;
						}
					}
				} else if (tablero[0][j] == "O") {
					if (tablero[1][j] == "O") {
						if (tablero[2][j] == "O") {
							ganador = 1;
							Pc++;
						}
					}
				}
			}

			// Comprobar diagonal1
			contador_X = 0;
			contador_O = 0;
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[0].length; j++) {
					if (i == j) {
						if (tablero[i][j] == "X") {
							contador_X++;
						} else if (tablero[i][j] == "O") {
							contador_O++;
						}
					}
				}
			}
			if (contador_X == 3) {
				ganador = 1;
				jugador++;
			}
			if (contador_O == 3) {
				ganador = 1;
				Pc++;
			}

			// Comprobar diagonal2
			contador_X = 0;
			contador_O = 0;
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[0].length; j++) {
					if ((i + j) + 1 == tablero.length) {
						if (tablero[i][j] == "X") {
							contador_X++;
						} else if (tablero[i][j] == "O") {
							contador_O++;
						}
					}
				}
			}
			if (contador_X == 3) {
				ganador = 1;
				jugador++;
			}
			if (contador_O == 3) {
				ganador = 1;
				Pc++;
			}

			if (jugador != 0) {
				System.out.println("FELICIDADES, HAS GANADO!!!");
			}
			if (Pc != 0) {
				System.out.println("Vaya... te ha ganado el ordenador...");
			}
			// Alternar juego
			if (jugada == 0) {
				jugada = 1;
			} else if (jugada == 1) {
				jugada = 0;
			}

		}

	}

}
