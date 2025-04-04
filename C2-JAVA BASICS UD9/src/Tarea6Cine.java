import java.util.Random;
import java.util.Scanner;

public class Tarea6Cine {

	private String pelicula;
	private int precio;

	public Tarea6Cine(String pelicula) {
		this.pelicula = pelicula;
		this.precio = 12;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public static void main(String[] args) {
		Tarea6Cine test2 = new Tarea6Cine("Si");
		Pelicula test3 = new Pelicula("Inter", 75, 18, "luis");

		Random rand = new Random();
		String[][] tablero = { { "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8" },
				{ "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8" }, { "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8" },
				{ "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8" }, { "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8" },
				{ "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8" }, { "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8" },
				{ "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8" } };

		int count = 0;
		Scanner sc = new Scanner(System.in);

		while (count != 1) {
			System.out.println("Le gustaria comprar una entrada? [Si/No]");
			String answers = sc.nextLine();

			if (answers.equalsIgnoreCase("Si")) {
				System.out.println("----------------------");
				System.out.println("Como te llamas?");
				String nombre = sc.nextLine();
				System.out.println("-----------------------");

				System.out.println("Cuantos años tienes? ");
				int edad = sc.nextInt();
				System.out.println("-----------------------");

				System.out.println("Cuanto dinero tienes? ");
				int dinero = sc.nextInt();
				System.out.println("-----------------------");

				Espectador test = new Espectador(nombre, edad, dinero);

				for (int i = 0; i < tablero.length; i++) {
					for (int j = 0; j < tablero.length; j++) {
						System.out.print(tablero[i][j] + " ");

					}
					System.out.println();
				}
				System.out.println("-----------------------");
				System.out.println("-----------------------");
				System.out.println("Estos son todos los sitios disponibles.");
				System.out.println("Para poder reservar un asiento, debes ser"
						+ " mayor de 18 años. Ademas, debes tener 12 euros como minimo.");
				System.out.println("Opciones disponibles: ");
				System.out.println("1. Reservar un asiento random.");
				System.out.println("2. Reservar un asiento manualmente.");
				System.out.println("3. Salir.");
				System.out.println("----------------------");
				System.out.println("Que deseas hacer?");
				int answer = sc.nextInt();
				System.out.println("-----------------------");

				if (answer == 1) {
					System.out.println("----------------------");
					System.out.println("Enhorabuena! Su asiento fue marcado con XX");
					System.out.println("-----------------------");
					if ((test.getEdad() >= test3.getEdadMin() && test.getMoney() >= test2.getPrecio())) {

						int randomRow = rand.nextInt(tablero.length);
						int randomColumn = rand.nextInt(tablero.length);
						String guardar[] = new String[1];
						guardar[0] = tablero[randomRow][randomColumn];
						tablero[randomRow][randomColumn] = "XX";

						for (int i = 0; i < tablero.length; i++) {
							for (int j = 0; j < tablero.length; j++) {
								System.out.print(tablero[i][j] + " ");

							}
							System.out.println();
						}
						System.out.println("---------------------");
						System.out.println("Su asiento es: " + guardar[0]);
						System.out.println("----------------------");

					} else {
						System.out.println("No cumples los requisitos!");
						System.out.println("----------------------");

					}
			} else if (answer == 2) {
				sc.nextLine();
				System.out.println("----------------------");
				System.out.println("Que asiento deseas reservar?");
				String asiento = sc.nextLine();
				System.out.println("----------------------");
			if (test.getEdad() >= test3.getEdadMin() && test.getMoney() >= test2.getPrecio()) {
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {
					if (tablero[i][j].equals(asiento)) {
						if (tablero[i][j].equals("XX")) {
							System.out.println("----------------------");

							System.out.println("Ese asiento ya esta ocupado.");
							
							} else {
							tablero[i][j] = "XX";
							System.out.println("----------------------");
							System.out.println("Reserva exitosa! Su asiento es: " + asiento);

							for (int x = 0; x < tablero.length; x++) {
								for (int y = 0; y < tablero[x].length; y++) {
									System.out.print(tablero[x][y] + " ");
									}
									System.out.println();									}
							}
						}
					}
				}
				System.out.println("ola.");
				} else {
					System.out.println("No cumples los requisitos!");
				}
			} else if (answer == 3) {
				System.out.println("Nos vemos," + nombre);
				count++;
			}
			} else if(answers.equalsIgnoreCase("No")) {
			System.out.println("Tenga un buen dia.");
			count++;
			}
		}

	}
}

class Pelicula {

	private String titulo;
	private int duracion;
	private int edadMin;
	private String director;

	public Pelicula(String titulo, int duracion, int edadMin, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMin = 18;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMin() {
		return edadMin;
	}

	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}

class Espectador {

	private String nombre;
	private int edad;
	private int money;

	public Espectador(String nombre, int edad, int money) {
		this.nombre = nombre;
		this.edad = edad;
		this.money = money;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
