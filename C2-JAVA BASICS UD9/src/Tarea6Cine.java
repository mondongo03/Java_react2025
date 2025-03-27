import java.util.Random;

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
		Espectador test = new Espectador("Jose", 18, 50);
		Tarea6Cine test2 = new Tarea6Cine("Si");
		Pelicula test3 = new Pelicula("Inter", 75, 18, "luis");

		Random rand = new Random();
        String[][] tablero = { { "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8" },
                { "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8" }, { "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8" },
                { "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8" }, { "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8" },
                { "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8" }, { "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8" },
                { "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8" } };

if ((test.getEdad() >= test3.getEdadMin() && test.getMoney() >= test2.getPrecio())){
         int randomRow = rand.nextInt(tablero.length);
          int randomColumn = rand.nextInt(tablero.length);
          tablero[randomRow][randomColumn] = "XX";
}
        
        for(int i = 0; i<tablero.length; i++) {
            for(int j = 0; j<tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");

            }
            System.out.println();
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
