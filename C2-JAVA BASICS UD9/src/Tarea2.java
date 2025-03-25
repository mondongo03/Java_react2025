
class Tarea2 implements Entregable {

	protected String titulo;
	protected int numTemp;
	protected boolean entregado;
	protected String genero;
	protected String creador;

	public Tarea2() {
		this.titulo = "";
		this.numTemp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Tarea2(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Tarea2(String titulo, String creador, String genero, int numTemp) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.numTemp = numTemp;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemp() {
		return numTemp;
	}

	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void toString(Tarea2 check) {
		System.out.println("El creador es: " + check.getCreador() + " el titulo es: " + check.getTitulo()
				+ " el genero es: " + check.getGenero() + " el numero de temporadas es: " + check.getNumTemp());
	}

	@Override
	public void entregar() {
System.out.println("Entregado");		
	}

	@Override
	public void devolver() {
		System.out.println("No entregado");
		
	}

	@Override
	public boolean isEntregado() {
		return false;
	}

	@Override
	public void compareTo(Tarea2 a, Videojuego b) {
		if(b.getHoras() == a.getNumTemp()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}	}

	@Override
	public void compareTo(Videojuego a, Tarea2 b) {
System.out.println("No");		
	}

}
