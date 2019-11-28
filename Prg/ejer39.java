/*
 * ejer39
 * @author Jean Ramos
 * @data 18/19/2019
 * 
 */

package iesserpis;

import java.util.Scanner;

public class ejer39 {

	public static void main(String[] args) {
		//Declaraciones
		Scanner 	teclado=new Scanner(System.in);
		int 		iMaquina;
		String 		sCadena;
		
		//Inicio
		//La maquina saca piedra, papel o tijeras
		iMaquina=(int)(Math.random()*3)+1; 	//1- Piedra 2-Papel 3-Tijeras
		System.out.println("VAMOS A JUGAR A PIEDRA, PAPEL O TIJERAS");
		System.out.print("Indica si quieres sacar piedra, papel o tijera:");;
		//Introducimos piedra, papel o tijeras
		sCadena=teclado.nextLine();
		sCadena=sCadena.toLowerCase();
		//si nuestra elección es invalida
		if (sCadena.contentEquals("piedra")==false && sCadena.contentEquals("papel")==false && sCadena.contentEquals("tijeras")==false ){
			System.out.println("*ERROR*\t Palabra no reconocida");
			System.exit(0);
		}
		//Si maquina=piedra
		if (iMaquina==1) { 
			System.out.println("La máquina ha sacado piedra");
			System.out.print("Tu has sacado "+sCadena+" así que ");
			if (sCadena.contentEquals("piedra")) {
				System.out.println("empatas");
			} else if (sCadena.contentEquals("papel")) {
				System.out.println("Ganas");
			} else if (sCadena.contentEquals("tijeras")) {
				System.out.println("pierdes");

			}
		}
		//Si maquina=papel
		if (iMaquina==2) { 
			System.out.println("La máquina ha sacado papel");
			System.out.print("Tu has sacado "+sCadena+" así que ");
			if (sCadena.contentEquals("piedra")) {
				System.out.println("pierdes");
			} else if (sCadena.contentEquals("papel")) {
				System.out.println("empatas");
			} else if (sCadena.contentEquals("tijeras")) {
				System.out.println("ganas");

			}
		}
		//Si maquina=tijeras
		if (iMaquina==3) { 
			System.out.println("La máquina ha sacado tijeras");
			System.out.print("Tu has sacado "+sCadena+" así que ");
			if (sCadena.contentEquals("piedra")) {
				System.out.println("ganas");
			} else if (sCadena.contentEquals("papel")) {
				System.out.println("pierdes");
			} else if (sCadena.contentEquals("tijeras")) {
				System.out.println("empatas");

			}
		}
	}//Main

}//Class
