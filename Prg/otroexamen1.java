/**
 * 
 */
package iesserpis.PRG.UD05_02;

import java.util.Scanner;

/**
 * @author jeaagu
 *
 */
public class otroexamen1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraciones
		String[][] tablero = new String[6][6];
		String[] vector = new String[2];
		Scanner teclado = new Scanner(System.in);
		String nombre;
		String trans = " ";
		String stop = "stop";
		String entrada;
		int contador = 1;
		int x, y;

		// Inicio
		System.out.println("Bienvenido al juego de hundir la flora 6x6, introduzca su nombre:");
		nombre = teclado.nextLine();
		System.out.println("Hola, Capitan " + nombre + ". Déjeme que le ayude a configurar su flota.");

		// Transatlánticos
		do {
			System.out.println("Introduzca la posición de su transátlantico numero " + contador
					+ " de 3 o 'stop' para dejar de introducir datos");
			entrada = teclado.nextLine();
			if (entrada.equalsIgnoreCase("stop")) {
				break;
			} else {
				vector = entrada.split(" ");
				x = Integer.parseInt(vector[0]);
				y = Integer.parseInt(vector[1]);
				for (int i = 0; i < tablero.length; i++) {
					for (int j = 0; j < tablero[0].length; j++) {
						if (i==x && j == y) {
							if ((j+4)>6) {
								System.out.println("Error, te sales del tablero");
							} else {
								for (int j2 = 0; j2 < 4; j2++) {
									
									tablero[i][j+j2]="[T]";
								}
								contador++;
								j = j +3;
							}
						} else {
							tablero[i][j] = "[ ]";
						}
					}
				}
				
				for (int i = 0; i < tablero.length; i++) {
					for (int j = 0; j < tablero.length; j++) {
						System.out.print(tablero[i][j]);
					}
					System.out.println();
				}
			}
		} while (contador <= 3);
	}

}
