import java.util.Scanner;

public class ejer1 {
	public static void main(String[] args) {
		//Declaraciones
			Scanner teclado=new Scanner(System.in);
			int iNota, iContadorMayor, iContadorMenor, iContadorWhile;
			iContadorMayor=0;
			iContadorMenor=0;
			iContadorWhile=1;

		//Inicio
			while(iContadorWhile<=10){
				System.out.print("Ingrese la nota: ");
				iNota=teclado.nextInt();
				if (iNota<0||iNota>10) {//Nota erronea
					System.out.println("ERROR");
					System.exit(0);
				}	else if (iNota>7) {//Nota>7
						iContadorMayor=iContadorMayor+1;
				}	else if(iNota<=7){//Nota<=7
						iContadorMenor=iContadorMenor+1;
				}
				iContadorWhile=iContadorWhile+1;
			}//while
			System.out.println("Hay un total de "+iContadorMayor+" notas mayores de 7");
			System.out.println("Hay un total de "+iContadorMenor+" notas menores o iguales a 7");
		
	}//Main
}
