class Videojuego implements Entregable {

	private String titulo;
	private String genero;
	private int horas;
	private String compania;

	public Videojuego() {
		this.titulo = "";
		this.genero = "";
		this.horas = 10;
		this.compania = "";
	}

	public Videojuego(String titulo, int horas) {
		this.titulo = titulo;
		this.horas = horas;
		this.genero = "";
		this.compania = "";
	}

	public Videojuego(String titulo, String genero, int horas, String compania) {
		this.titulo = titulo;
		this.genero = genero;
		this.horas = horas;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public void toString(Videojuego check) {
		System.out.println("El juego es: " + check.getTitulo() + " sus horas de juego son: " + check.getHoras());
	}

	@Override
	public void entregar() {
		System.out.println("Entregado");
	}

	@Override
	public void devolver() {
		System.out.println("Devuelto");

	}

	@Override
	public boolean isEntregado() {
		return false;
	}

	@Override
	public void compareTo(Videojuego a, Tarea2 b) {
		if (a.getHoras() == b.getNumTemp()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	@Override
	public void compareTo(Tarea2 a, Videojuego b) {
		System.out.println("si");
	}

}
