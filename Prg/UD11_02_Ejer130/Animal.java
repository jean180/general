package UD11_02_Ejer130;

public abstract class Animal {
	protected String nombre, fechaNacimiento, comentarios;
	protected Double peso;

	public Animal(String nombre, String fechaNacimiento, Double peso) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public abstract String toString();
}
