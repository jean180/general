import java.util.Scanner;

public class pruebafinal {

	public static void main(String[] args) {
		// Declaraciones
		int altura = 0, mitad, j, contador = 0, i = 1, contador2 = 0;
		Scanner teclado = new Scanner(System.in);
		String espacio = " ";
		// Inicio
		// Introducción altura
		System.out.print("Introduce la altura: ");
		altura = teclado.nextInt();

		// validar dato
		while (altura < 3 || altura % 2 == 0) {
			System.out.println("ERROR");
			System.out.println("Introduce la altura");
			altura = teclado.nextInt();
		}
		contador++;
		while (contador <= altura) {

			for (i = contador; i <= altura; i++) {
				if (i == altura) {
					System.out.println("*");
					System.out.print(espacio);
					contador = contador + 2;
					espacio = ((espacio) + " ");
				} else if (i == contador) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

		}
		mitad = (altura / 2);
		contador = mitad;

	}

}
