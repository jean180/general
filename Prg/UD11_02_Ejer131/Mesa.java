package UD11_02_Ejer131;

import java.util.ArrayList;
import java.util.Iterator;

enum Estado {
	LIBRE, OCUPADA
}

public class Mesa implements Interface_Mesa {
	private int numero_mesa, numero_personas, factura;
	private Estado estado_mesa;
	private String ubicacion;
	private ArrayList<Plato> platos_pedidos;
	static int numMesa = 0;

	public Mesa(int numero_mesa, String ubicacion) {
		// TODO Auto-generated constructor stub
		numMesa++;
		this.numero_mesa = numero_mesa;
		this.ubicacion = ubicacion;
		this.estado_mesa = estado_mesa.LIBRE;
		this.platos_pedidos = new ArrayList<Plato>();
	}

	@Override
	public String obtenerDatosMesa() {
		// TODO Auto-generated method stub
		if (this.estado_mesa == estado_mesa.LIBRE) {
			return "\nNumero de Mesa: " + this.numero_mesa + "\nUbicación: " + this.ubicacion + "\nEstado: "
					+ this.estado_mesa;
		} else {
			return "\nNumero de Mesa: " + this.numero_mesa + "\nNumero de personas: " + this.numero_personas
					+ "\nUbicación: " + this.ubicacion + "\nEstado: " + this.estado_mesa;
		}
	}

	@Override
	public int getnumMesa() {
		// TODO Auto-generated method stub
		return numero_mesa;
	}

	@Override
	public void liberarMesa() {
		// TODO Auto-generated method stub
		this.estado_mesa = estado_mesa.LIBRE;

	}

	@Override
	public void ocuparMesa() {
		// TODO Auto-generated method stub
		this.estado_mesa = estado_mesa.OCUPADA;

	}

	public void setNumero_personas(int numero_personas) {
		this.numero_personas = numero_personas;
	}

	@Override
	public void pedirPlato(Plato platopedido) {
		// TODO Auto-generated method stub
		platos_pedidos.add(platopedido);
	}

	@Override
	public void detalle_platos() {
		// TODO Auto-generated method stub
		Iterator<Plato> iter = platos_pedidos.iterator();
		while (iter.hasNext()) {
			Plato plato = (Plato) iter.next();
			System.out.println(plato.getNombre());
		}

	}

	@Override
	public double calcular_factura() {
		// TODO Auto-generated method stub
		double precio_final = 0;
		Iterator<Plato> iter = platos_pedidos.iterator();
		while (iter.hasNext()) {
			Plato plato = (Plato) iter.next();
			precio_final += plato.getPrecio();
		}
		return precio_final;
	}

}
