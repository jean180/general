package UD11_02_Ejer127;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
	}

	public static void Menu() {
		ArrayList<Mascota> lista = new ArrayList<Mascota>();
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("-------------------------------");
			System.out.println("1-Dar de alta una mascota");
			System.out.println("2-Escuchar perros y gatos");
			System.out.println("3-Escuchar periquitos y conejos");
			System.out.println("4-Escuchar gatos y periquitos");
			System.out.println("5-Escuchar perros y conejos");
			System.out.println("6-Salir");
			System.out.println("--------------------------------");
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion) {
			case 1:
				Opcion1(lista);
				break;

			case 2:
				Opcion2(lista);
				break;

			case 3:
				Opcion3(lista);
				break;

			case 4:
				Opcion4(lista);
				break;

			case 5:
				Opcion5(lista);
				break;

			case 6:
				System.out.println("Adios");
				System.exit(0);
			default:
				break;
			}
		} while (true);

	}

	private static void Opcion1(ArrayList<Mascota> lista) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca el tipo de mascota a dar de alta (P-Perro/G-Gato/Q-Periquito/C-Conejo):");
		String tipo;
		do {
			String letra = teclado.nextLine();
			if (letra.equalsIgnoreCase("P")) {
				tipo = "perro";
				break;
			} else if (letra.equalsIgnoreCase("g")) {
				tipo = "gato";
				break;
			} else if (letra.equalsIgnoreCase("q")) {
				tipo = "periquito";
				break;
			} else if (letra.equalsIgnoreCase("c")) {
				tipo = "conejo";
				break;
			} else {
				System.out.println("ERROR - Introduce un tipo valido");
			}
		} while (true);
		System.out.println("Introduce el nombre de la mascote");
		String nombre = teclado.nextLine();
		switch (tipo) {
		case "perro":
			Perro perro = new Perro(nombre, tipo);
			lista.add(perro);
			break;

		case "gato":
			Gato gato = new Gato(nombre, tipo);
			lista.add(gato);
			break;

		case "periquito":
			Periquito periquito = new Periquito(nombre, tipo);
			lista.add(periquito);
			break;

		case "conejo":
			Conejo conejo = new Conejo(nombre, tipo);
			lista.add(conejo);
			break;

		default:
			break;
		}
		System.out.println("Se ha dado de alta un " + tipo + " de nombre " + nombre);

	}

	private static void Opcion2(ArrayList<Mascota> lista) {
		Iterator<Mascota> iter = lista.iterator();
		while (iter.hasNext()) {
			Mascota Auxmascota = (Mascota) iter.next();
			if (Auxmascota.getTipo().equals("perro") || Auxmascota.getTipo().equals("gato")) {
				System.out.println("Hola me llamo " + Auxmascota.getNombre() + ", soy un " + Auxmascota.getTipo()
						+ " y hago " + Auxmascota.sonido());
			}
		}
	}

	private static void Opcion3(ArrayList<Mascota> lista) {
		Iterator<Mascota> iter = lista.iterator();
		while (iter.hasNext()) {
			Mascota Auxmascota = (Mascota) iter.next();
			if (Auxmascota.getTipo().equals("periquito") || Auxmascota.getTipo().equals("conejo")) {
				System.out.println("Hola me llamo " + Auxmascota.getNombre() + ", soy un " + Auxmascota.getTipo()
						+ " y hago " + Auxmascota.sonido());
			}
		}
	}

	private static void Opcion4(ArrayList<Mascota> lista) {
		Iterator<Mascota> iter = lista.iterator();
		while (iter.hasNext()) {
			Mascota Auxmascota = (Mascota) iter.next();
			if (Auxmascota.getTipo().equals("gato") || Auxmascota.getTipo().equals("periquito")) {
				System.out.println("Hola me llamo " + Auxmascota.getNombre() + ", soy un " + Auxmascota.getTipo()
						+ " y hago " + Auxmascota.sonido());
			}
		}
	}

	private static void Opcion5(ArrayList<Mascota> lista) {
		Iterator<Mascota> iter = lista.iterator();
		while (iter.hasNext()) {
			Mascota Auxmascota = (Mascota) iter.next();
			if (Auxmascota.getTipo().equals("perro") || Auxmascota.getTipo().equals("conejo")) {
				System.out.println("Hola me llamo " + Auxmascota.getNombre() + ", soy un " + Auxmascota.getTipo()
						+ " y hago " + Auxmascota.sonido());
			}
		}
	}
}
