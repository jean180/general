package UD11_02_Ejer131;

public class Cliente implements Interface_Cliente {
	private String nombre, telefono;

	public Cliente(String nombre, String telefono) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.telefono = telefono;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
