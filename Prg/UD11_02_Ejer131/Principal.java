package UD11_02_Ejer131;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos 2 clientes
		Cliente c1 = new Cliente("Paco Perez", "666301220");
		Cliente c2 = new Cliente("Gareth Bale", "654122322");

		// Creamos 2 mesas
		Mesa m1 = new Mesa(2, "Terraza");
		Mesa m2 = new Mesa(4, "Comedor interno");

		// Creamos un restaurante y monto las 2 mesas
		Restaurante res1 = new Restaurante("Bazofia para todos", "654312450");
		res1.montarMesa(m1);
		res1.montarMesa(m2);

		// Listamos las 2 mesas y deberian estar libres
		System.out.println("-Listado de mesas:");
		res1.listarMesas();

		// Hado las reservas de las 2 mesas
		Reserva r1 = new Reserva("01/06/2020", 20, 2, m1, c1);
		Reserva r2 = new Reserva("01/06/2020", 22, 4, m2, c2);

		// Obtenemos los datos de la mesa de la terraza, ahora est� ocuapda
		System.out.println("-Estado de la mesa de la terraza");
		System.out.println(m1.obtenerDatosMesa());

		// Obtenemos los dados de la mesa del comedor interno, ahora est� ocupada
		System.out.println("-Estado de la mesa del comedor interno:");
		System.out.println(m2.obtenerDatosMesa());

		// Damos de alta 3 ingredientes
		Ingredientes in1 = new Ingredientes("tomate", 100);
		Ingredientes in2 = new Ingredientes("Spaghetti", 200);
		Ingredientes in3 = new Ingredientes("queso", 30);

		// Creamos un plato con esos 3 ingredientes
		Plato p1 = new Plato("Spaghetti al plato");
		p1.anyadir_ingrediente(in1);
		p1.anyadir_ingrediente(in2);
		p1.anyadir_ingrediente(in3);
		System.out.println("-Ingresientes de los spaghetti:");
		System.out.println(p1.consultar_ingreditentes());

		// Creamos otro plato con 2 ingredientes de antes y uno nuevo
		Plato p2 = new Plato("Pizza barbacoa");
		Ingredientes in4 = new Ingredientes("carne picada", 300);
		p2.anyadir_ingrediente(in1);
		p2.anyadir_ingrediente(in3);
		p2.anyadir_ingrediente(in4);
		System.out.println("-Ingredientes de la pizza:");
		System.out.println(p2.consultar_ingreditentes());

		// Creamos un ultimo plato con un nuevo ingrediente
		Plato p3 = new Plato("Entrecot con salsa de queso");
		Ingredientes in5 = new Ingredientes("entrecot", 500);
		p3.anyadir_ingrediente(in5);
		p3.anyadir_ingrediente(in3);
		System.out.println("-Ingredientes del entrecot:");
		System.out.println(p3.consultar_ingreditentes());

		// Desde la mesa m1 se piden los 3 platos creados anteriormente
		m1.pedirPlato(p1);
		m1.pedirPlato(p2);
		m1.pedirPlato(p3);

		// Resumimos los 3 platos que se han pedido en esa mesa
		System.out.println("-Platos pedidos en la primeras mesa:");
		m1.detalle_platos();

		// Piden las factura de la mesa y se van
		System.out.println("-La mesa ha gastado: " + m1.calcular_factura() + "� y se van.");
		m1.liberarMesa();

		// La segunda mesa pide 4 entrecots;
		m2.pedirPlato(p3);
		m2.pedirPlato(p3);
		m2.pedirPlato(p3);
		m2.pedirPlato(p3);
		System.out.println("-Platos pedidos de la segunda mesa");
		m2.detalle_platos();

		// Piden las factura de la mesa y se van
		System.out.println("-La mesa ha gastado: " + m2.calcular_factura() + "� y se van.");
		m2.liberarMesa();

		// Comprobamos el total de la caja
		System.out.println("El restaurante ha facturado: " + res1.calcular_caja() + "�.");

		// Al final del deia desmontamos las mesas
		// Empezamos recogiendo la mesa m1
		res1.recogerMesa(m1);

		// Si listamos las mesas solo nos aparece la mesa m2, ya que la m1 la hemos
		// recogido
		res1.listarMesas();

		// Recogemos la mesa m2
		res1.recogerMesa(m2);

		// Comprobamos que todas las mesas estan recogidas.
		// Esta llamada devuelve el mensaje "Todas las mesas estan recogidas"
		res1.listarMesas();
	}

}
