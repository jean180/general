import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Principal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<String> Agenda = new ArrayList<String>();
		int opcion = 0;
		do {

			try {

				opcion = Pintar_Menu();
				switch (opcion) {
				case 1:
					Opcion1(Agenda);
					break;

				case 2:
					Opcion2(Agenda);
					break;
				case 3:
					Opcion3(Agenda);
					break;
				default:
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (opcion != 4);
		System.out.println("Gracias por utilizar esta agenda");
		File Salida = new File("salida.txt");
		try {
			Salida.createNewFile();
		} catch (IOException e) {

		}
		try {
			FileWriter file1 = new FileWriter(Salida);
			Iterator<String> Iter = Agenda.iterator();
			while (Iter.hasNext()) {
				String Aux = (String) Iter.next();
				file1.write(Aux + "\n");
			}
			file1.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static int Pintar_Menu() throws Exception {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----MENU-----");
		System.out.println("1-Dar de alta un contacto de la agenda");
		System.out.println("2-Dar de baja un contacto de la agenda");
		System.out.println("3-Listar agenda");
		System.out.println("4-Salir");
		try {
			int numero = teclado.nextInt();
			teclado.nextLine();
			if (numero < 1 || numero > 4) {
				throw new Exception("ERROR: Opción incorrecta");
			}
			return numero;
		} catch (InputMismatchException e) {
			throw new InputMismatchException("ERROR: Debes ingresar valores entero");
		}
	}

	public static ArrayList<String> Opcion1(ArrayList<String> Agenda) {
		System.out.println("Introduzca nombre del nuevo contacto:");
		try {
			String nombre = leer_nombre1(Agenda);
			if (nombre != null) {
				Agenda.add(nombre);
				System.out.println("Alta realizada con éxito!. Numero de contactos en la agenda: " + Agenda.size());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Agenda;
	}

	public static ArrayList<String> Opcion2(ArrayList<String> Agenda) {
		System.out.println("Introduzca nombre del contacto a dar de baja:");
		try {
			leer_nombre2(Agenda);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Agenda;
	}

	public static void Opcion3(ArrayList<String> Agenda) {

		Iterator<String> Iter = Agenda.iterator();
		while (Iter.hasNext()) {
			String Aux_nombre = (String) Iter.next();
			System.out.println(Aux_nombre);
		}
	}

	public static String leer_nombre1(ArrayList<String> Agenda) throws Exception {
		Scanner teclado = new Scanner(System.in);
		boolean encontrado = false;
		String nombre = teclado.nextLine();
		Iterator<String> Iter = Agenda.iterator();
		while (Iter.hasNext()) {
			String Aux_nombre = (String) Iter.next();
			if (nombre.equalsIgnoreCase(Aux_nombre)) {
				encontrado = true;
				break;
			}
		}
		if (encontrado == true) {
			throw new Exception("ERROR: El contacto ya existe en la agenda");
		}
		return nombre;
	}

	public static void leer_nombre2(ArrayList<String> Agenda) throws Exception {
		Scanner teclado = new Scanner(System.in);
		boolean encontrado = false;
		int cont = 0;
		String nombre = teclado.nextLine();
		Iterator<String> Iter = Agenda.iterator();
		while (Iter.hasNext()) {
			String Aux_nombre = (String) Iter.next();
			if (nombre.equalsIgnoreCase(Aux_nombre)) {
				encontrado = true;
				Agenda.remove(cont);
				System.out.println("Baja realizada con éxito!. Numero de contactos en la agenda: " + Agenda.size());
				break;
			}
			cont++;
		}
		if (encontrado == false) {
			throw new Exception("ERROR: El contacto no existe en la agenda");
		}
	}
}
