package UD11_02_Ejer128;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Vehiculo[] lista = new Vehiculo[4];
		Camion camion1 = new Camion("C1");
		lista[0] = camion1;
		Camion camion2 = new Camion("C2");
		lista[1] = camion2;
		Coche coche1 = new Coche("A1", 5);
		lista[2] = coche1;
		Coche coche2 = new Coche("A2", 7);
		lista[3] = coche2;
		Remolque remolque1 = new Remolque(5000);
		camion1.ponRemolque(remolque1);
		camion2.ponRemolque(remolque1);
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].toString());
		}
		try {
			coche1.acelerar(120);
			coche2.acelerar(120);
			camion1.acelerar(90);
			camion2.acelerar(90);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		camion2.quitaRemolque();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].toString());
		}
		try {
			camion1.acelerar(20);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
