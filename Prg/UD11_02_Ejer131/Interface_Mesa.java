package UD11_02_Ejer131;

public interface Interface_Mesa {
	public String obtenerDatosMesa();

	public int getnumMesa();

	public void liberarMesa();

	public void ocuparMesa();

	public void pedirPlato(Plato platopedido);

	public void detalle_platos();

	public double calcular_factura();
}
