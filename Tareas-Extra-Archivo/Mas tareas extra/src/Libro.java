
public class Libro {

	private String titulo;
	private String autor;
	private int any;
	private long isbn;
	private boolean prestado;
	
	public Libro() {
		this.prestado = false;
		this.titulo = "";
		this.autor = "";
		this.any = 0;
		this.isbn = 0;
		
	}
	
	public Libro(String titulo, String autor, int any, long isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.any = any;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public void prestar() {
		prestado = true;
	
	}
	public void devolver() {
		prestado = false;
	
	}
	public void mostrarInfo() {
		if (prestado == true) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		Libro test = new Libro();
		test.mostrarInfo();
		test.prestar();
		test.mostrarInfo();
	}
}
