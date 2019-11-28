//Librerias
import java.util.Random;

public class ejer6 {
	public static void main(String[] args) {
		//Declaraciones
			int 	iValor1, iValor2, iContador, iLista1, iLista2;

		//Inicio
			iContador=0;
			iLista1=0;
			iLista2=0;
			System.out.println("La primera lista:\n");
			while (iContador!=15) {
			
				iValor1=(int)(Math.random()*50);									//Numero random 0-50
				System.out.print(iValor1+"-");
				iContador++;
				iLista1=iLista1+iValor1;
			}//While
			System.out.println("\nLa suma total: "+iLista1);

			System.out.println("\nLa segunga lista:\n");
			iContador=0;
			while (iContador!=15) {
				
				iValor2=(int)(Math.random()*50);
				System.out.print(iValor2+"-");
				iContador++;
				iLista2=iLista2+iValor2;
			}//While
			System.out.println("\nLa suma total: "+iLista2);
			System.out.println((iLista1>iLista2)?"\n\nLa lista 1 es mayor":(iLista1<iLista2)?"\n\nla lista 2 es mayor":"\n\nSon iguales");


	}//Main
}//Class
