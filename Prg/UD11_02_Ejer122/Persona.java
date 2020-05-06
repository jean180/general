package UD11_02_Ejer122;

public class Persona {

	private String Nombre, DNI;
	protected String Residencia;
	private int edad;

	public Persona(String Nombre, String DNI, String Residencia, int edad) {
		this.Nombre = Nombre;
		this.DNI = DNI;
		this.Residencia = Residencia;
		this.edad = edad;
	}

	public int jubilacion() {
		return (65 - this.edad);
	}

	public String get_Nombre() {
		return this.Nombre;
	}

	public void set_Nombre(String nombre) {
		this.Nombre = nombre;
	}

	public String get_DNI() {
		return this.DNI;
	}

	public void set_DNI(String DNI) {
		this.DNI = DNI;
	}

	public String get_Residencia() {
		return this.Residencia;
	}

	public void set_Resisdencia(String Resisdencia) {
		this.Residencia = Residencia;
	}

	public int get_edad() {
		return this.edad;
	}

	public void set_edad(int edad) {
		this.edad = edad;
	}
}
