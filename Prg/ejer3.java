import java.util.Scanner;

public class ejer3 {
	public static void main(String[] args) {
		//Declaraciones
			Scanner teclado=new Scanner(System.in);
			int 	iEmpleados, iSueldo, iWhile, iMayor, iMenor, iTotal;
			iWhile=1;
			iTotal=0;
			iMayor=0;
			iMenor=0;
		//Inicio
			System.out.print("Introduce la cantidad de empleados: ");
			iEmpleados=teclado.nextInt();
			if (iEmpleados<=0) {//Empleados negaticos
				System.out.println("ERROR");
				System.exit(0);
			}//If
			while(iWhile<=iEmpleados){
				System.out.print("Introduce salario: ");
				iSueldo=teclado.nextInt();
				if (iSueldo<100||iSueldo>500) {//Sueldo erroneo
					System.out.println("-ERROR-");
					System.out.println("El suelo tiene que estar entre 100 euros y 500 euros");
					System.exit(0);
				}
				iTotal=iTotal+iSueldo;
				if (iSueldo>300) {//+300
					iMayor++;
				} else if (iSueldo>=100&&iSueldo<=300) {//100>=sueldo<=300
					iMenor++;
				}
				iWhile++;
			}//While
			System.out.println("El total de los sueldos es: "+iTotal);
			System.out.println("Hay "+iMayor+" sueldos de mas de 300 euros");
			System.out.println("Hay "+iMenor+" sueldos entre 100 euros y 300 euros");
	}//Main
}
