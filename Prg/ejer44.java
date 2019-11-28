

import java.util.Scanner;

public class ejer44 {

	public static void main(String[] args) {
		//Declaraciones
			int 	altura;
			Scanner teclado=new Scanner(System.in);
			
		//Inicio
			
			System.out.print("Introduce la altura: ");
			altura=teclado.nextInt();
		while (altura < 3 || altura%2 == 0) {
				System.out.println("ERROR");
				System.out.print("Introduce la altura: ");
				altura=teclado.nextInt();
			}
			int y=(altura-1);
			for (int i = 0; i < altura; i++) {
				for (int j = 0; j < altura; j++) {
					if ((i==j) || ((i+j)==y)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			
			
		
		
	}

}
