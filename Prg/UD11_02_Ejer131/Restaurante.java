package UD11_02_Ejer131;

import java.util.ArrayList;
import java.util.Iterator;

public class Restaurante implements Interface_Restaurante {
	private String nombre, telefono;
	private ArrayList<Mesa> lista_mesas;

	public Restaurante(String nombre, String telefono) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.telefono = telefono;
		this.lista_mesas = new ArrayList<Mesa>();
	}

	@Override
	public void montarMesa(Mesa mesa) {
		// TODO Auto-generated method stub
		lista_mesas.add(mesa);

	}

	@Override
	public void recogerMesa(Mesa mesa) {
		// TODO Auto-generated method stub
		lista_mesas.remove(mesa);

	}

	@Override
	public void listarMesas() {
		// TODO Auto-generated method stub
		if (this.lista_mesas.isEmpty()) {
			System.out.println("Todas las mesas estan recogidas");
		} else {
			Iterator<Mesa> iter = lista_mesas.iterator();
			while (iter.hasNext()) {
				Mesa mesa = (Mesa) iter.next();
				System.out.println(mesa.obtenerDatosMesa());
			}
		}
	}

	@Override
	public double calcular_caja() {
		// TODO Auto-generated method stub
		double cajaTotal = 0;
		Iterator<Mesa> iter = lista_mesas.iterator();
		while (iter.hasNext()) {
			Mesa mesa = (Mesa) iter.next();
			cajaTotal += mesa.calcular_factura();
		}
		return cajaTotal;
	}
}
