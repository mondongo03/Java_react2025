
public class Tarea3 {

	private double isbn;
	private String name;
	private String autor;
	private int numPag;
	
	
	public double getIsbn() {
		return isbn;
	}
	public void setIsbn(double isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	public static void toString(Tarea3 check) {
		System.out.println("El libro " +check.getName() +" con ISBN " +check.getIsbn() +" por el autor " +check.getAutor() +" tiene " +check.getNumPag() +" paginas.");
	}
	
	public static void main(String[] args) {
		Tarea3 libro1 = new Tarea3();
		Tarea3 libro2 = new Tarea3();
		
		libro1.setNumPag(333);
		libro2.setNumPag(100);
		
		if(libro1.getNumPag()> libro2.getNumPag()) {
			System.out.println("El libro 1 tiene mas pag");
		}
		else {
			System.out.println("El libro 2 tiene mas pag");
		}
		
		toString(libro1);
		toString(libro2);
	}
	
}
