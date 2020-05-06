package UD11_02_Ejer122;

public class Profesor extends Persona {
	private double sueldo;
	private String centro, lugar_trabajo;

	public Profesor(String Nombre, String DNI, String Residencia, int edad, double sueldo, String centro,
			String lugar_trabajo) {
		super(Nombre, DNI, Residencia, edad);
		this.sueldo = sueldo;
		this.centro = centro;
		this.lugar_trabajo = lugar_trabajo;
	}

	public boolean coincide_lugar() {
		if (this.Residencia.equals(lugar_trabajo)) {
			return true;
		} else {
			return false;
		}
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getLugar_trabajo() {
		return lugar_trabajo;
	}

	public void setLugar_trabajo(String lugar_trabajo) {
		this.lugar_trabajo = lugar_trabajo;
	}

}
