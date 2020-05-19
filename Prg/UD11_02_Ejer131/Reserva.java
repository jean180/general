package UD11_02_Ejer131;

public class Reserva {
	private String fecha;
	private int numero_personas, hora;
	private Cliente reservador;
	private Mesa mesa_reservada;

	public Reserva(String fecha, int hora, int numero_personas, Mesa mesa, Cliente cliente) {
		this.fecha = fecha;
		this.hora = hora;
		this.numero_personas = numero_personas;
		mesa.setNumero_personas(numero_personas);
		mesa.ocuparMesa();
		this.mesa_reservada = mesa;
		this.reservador = cliente;
	}
}
