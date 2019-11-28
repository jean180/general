import java.util.Scanner;

public class ejer2 {
	public static void main(String[] args) {
		//Declaraciones
			Scanner teclado=new Scanner(System.in);
			int iContadorWhile, iContadorAlturas;
			float alturaf, mediaf;

			iContadorWhile=1;
			mediaf=0;
		//Inicio
			System.out.print("Imprime el numero de alturas que vas a introducir: ");
			iContadorAlturas=teclado.nextInt();
			if(iContadorAlturas<=0){//Personas<=0
				System.out.println("ERROR");
				System.exit(0);
			}//if
			while(iContadorWhile<=iContadorAlturas){
				System.out.println("Imprime un altura: ");
				alturaf=teclado.nextFloat();
				mediaf=mediaf+alturaf;
				iContadorWhile=iContadorWhile+1;
			}//while
			mediaf=mediaf/iContadorAlturas;
			System.out.println("La media de alturas es: "+mediaf+" m");
	}//Main
}
