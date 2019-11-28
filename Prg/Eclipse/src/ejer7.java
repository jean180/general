import java.util.Scanner;

public class ejer7 {
	public static void main(String[] args) {
		//Declaraciones
			Scanner teclado=new Scanner(System.in);
			int 	iContador, iNum;
			int 	iPar, iInpar;

		//Inicio
			iContador=1;
			iNum=0;
			iPar=0;
			iInpar=0;

			System.out.print("Dime la cantidad de numeros: ");
			iNum=teclado.nextInt();

			while(iContador<=iNum){
				System.out.print(iContador+"-");
				if (iContador%2==0) {															//Si el if da verdadero luego es par
					iPar++;
				} else{																			//Si no, es inpar
					iInpar++;
				}
				iContador++;
			}//While
			System.out.println("");
			System.out.println("Hay "+iPar+" numeros pares y "+iInpar+" numeros inpares");

	}//Main
}
