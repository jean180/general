package UD11_02_Ejer122;

public class ProfesorInterino extends Profesor {
	private String tipo_baja;
	private int duracion_baja;

	public ProfesorInterino(String Nombre, String DNI, String residencia, int edad, double sueldo, String centro,
			String lugar_trabajo, String tipo_baja, int duracion_baja) {
		super(Nombre, DNI, residencia, edad, sueldo, centro, lugar_trabajo);
		this.tipo_baja = tipo_baja;
		this.duracion_baja = duracion_baja;
	}

	public int num_meses() {
		return (duracion_baja / 30);
	}

	public String getTipo_baja() {
		return tipo_baja;
	}

	public void setTipo_baja(String tipo_baja) {
		this.tipo_baja = tipo_baja;
	}

	public int getDuracion_baja() {
		return duracion_baja;
	}

	public void setDuracio_baja(int duracion_baja) {
		this.duracion_baja = duracion_baja;
	}
}
