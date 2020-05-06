package UD11_02_Ejer124;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(0, 0);
		Punto p2 = new Punto(2, 0);
		Punto p3 = new Punto(2, 2);
		Punto p4 = new Punto(0, 2);

		Punto[] listado_puntos = new Punto[4];
		listado_puntos[0] = p1;
		listado_puntos[1] = p2;
		listado_puntos[2] = p3;
		listado_puntos[3] = p4;

		Poligono poli = new Poligono(listado_puntos);
		System.out.println(poli);
		poli.trasladar(4, -3);
		System.out.println(poli);
		poli.escalar(2, 2);
		System.out.println(poli);
		System.out.println(poli.numVertices());
	}

}
