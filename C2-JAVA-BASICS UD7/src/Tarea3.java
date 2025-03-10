import java.util.HashMap;
import java.util.Scanner;

public class Tarea3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Para ver los articulos en tu lista [Ver]");

		HashMap<String, Integer> productos = new HashMap<>();
		productos.put("Leche", 2);
		productos.put("Azucar", 4);
		productos.put("Bocadillo", 3);
		productos.put("Atun", 5);
		productos.put("Macarrones", 3);
		productos.put("Carne", 8);
		productos.put("Cereales", 10);
		productos.put("Cuchara", 3);
		productos.put("Agua", 1);

		System.out.print("Deseas ver los articulos?" + "[Ver/No]");
		String ver = sc.nextLine();

		if (ver.equalsIgnoreCase("Ver")) {

			for (String observar : productos.keySet()) {

				int productoss = productos.get(observar);
				System.out.println(observar + " " + productoss);
			}
		} else if (ver.equalsIgnoreCase("No")) {
			noVer(productos);
		}
	}

	public static HashMap<String, Integer> noVer(HashMap<String, Integer> productos) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Que articulo deseas poner: ");
		String articulo = sc.nextLine();

		System.out.println("Que cantidad de articulos deseas agregar: ");
		int cantidad = sc.nextInt();

		productos.put(articulo, cantidad);
		System.out.println("Has añadido una cantidad de: " + cantidad + "" + " de " + articulo + " en tu lista.");

		sc.nextLine();

		System.out.println("Deseas ver tu lista? " + " [Si/No]");
		String answ = sc.nextLine();

		if (answ.equalsIgnoreCase("Si")) {
			for (String observar : productos.keySet()) {

				System.out.println("Tu lista contiene: " + observar + " y su cantidad: " + productos.get(observar));
			}
		} else if (answ.equalsIgnoreCase("No")) {
			System.out.println("Gracias por comprar");
		}
		return productos;
	}

}
