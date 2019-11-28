/*
 * ejer40
 * 
 * @author Jean Ramos
 * 
 */
package iesserpis;

import java.util.Scanner;

public class ejer40 {

	public static void main(String[] args) {
		//Declaraciones
		Scanner 	teclado=new Scanner(System.in);
		int 		n, iResultado;
		int			i=1;
		int			j=1;
		
		//Inicio
		//Introducimos numero
		System.out.print("Introduce un numero positivo: ");
		n=teclado.nextInt();
		//Si numero<=0
		if (n<=0) {
			System.out.println("*ERROR*\t Dato invalido");
			System.exit(0);
		}
		//Operaciones
		while (i<=n) {
			while (j<=n) {
				iResultado=i+j+2*i*j;
				System.out.println("Par "+i+","+j+": "+i+"+"+j+"+2*"+i+"*"+j+" vale "+iResultado);
				j=j+1;
			}
			i=i+1;
			j=i;
		}//While
	}//Main
}//Class
