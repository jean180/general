package UD11_02_Ejer130;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RazaPerro razaPerro = RazaPerro.Beagle;
		Perro perro1 = new Perro("Snoopy", "24/05/2005", 25, "Microchip001", razaPerro);
		RazaGato razaGato = RazaGato.Comun;
		Gato gato1 = new Gato("Gardfield", "27/07/2012", 120, "Microchip002", razaGato);
		EspeciePajaro especiePajaro = EspeciePajaro.Canario;
		Pajaro pajaro1 = new Pajaro("Piolín", "12/07/2016", 1, true, especiePajaro);
		EspecieReptil especieReptil = EspecieReptil.LagartoGigante;
		Reptil reptil1 = new Reptil("Godzilla", "12/01/1420", 19800, false, especieReptil);
		ClinicaVeterinaria clinica1 = new ClinicaVeterinaria();
		clinica1.InsertaAnimal(perro1);
		clinica1.InsertaAnimal(gato1);
		clinica1.InsertaAnimal(pajaro1);
		clinica1.InsertaAnimal(reptil1);
		System.out.println(clinica1.toString());
		clinica1.InsertaComentarioAnimal("Snoopy", "Viene acompañado de su hermano Spike");
		clinica1.InsertaComentarioAnimal("Gardfield", "Llega a la consulta con un empacho de Lasaña");
		clinica1.InsertaComentarioAnimal("Piolín", "Me parece que he visto a un lindo gatito");
		clinica1.InsertaComentarioAnimal("Godzilla", "Sufre heridas de su pelea contra Gamera");
		System.out.println(clinica1.toString());

	}
}
