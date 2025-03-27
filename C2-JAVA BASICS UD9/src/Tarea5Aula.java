import java.util.Random;

public class Tarea5Aula {

	private int numAlum;
	private String destino;
	private Profesor profesor;
	private Alumno alumno;

	public Tarea5Aula(int numAlum, String destino, Profesor profesor, Alumno alumno) {
		this.numAlum = numAlum;
		this.destino = destino;
		this.profesor = profesor;
		this.alumno = alumno;
	}

	public int getNumAlum() {
		return numAlum;
	}

	public void setNumAlum(int numAlum) {
		this.numAlum = numAlum;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void disponibilidad() {
		profesor.disponibilidad();
		alumno.disponibilidad();
	}

	public void comprobarMateria() {
		if (profesor.getMateria().equals(destino)) {
			System.out.println("El profesor es correcto");
		} else {
			System.out.println("Profesor incorrecto");
		}

	}

	public static void main(String[] args) {
		Profesor profe = new Profesor("Jose", 25, "Mates", true);
		Alumno alumno = new Alumno("Juan", 14, "hombre", 9.5, false);
		Tarea5Aula test = new Tarea5Aula(5, "Mates", profe, alumno);

		
		profe.disponibilidad();
		alumno.disponibilidad();
		test.comprobarMateria();
	}
}

class Alumno {

	private String name;
	private int age;
	private String genero;
	private double notas;
	private boolean disponible;

	public Alumno(String name, int age, String genero, double notas, boolean disponible) {
		this.name = name;
		this.age = age;
		this.genero = genero;
		this.notas = notas;
		this.disponible = disponible;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public void disponibilidad() {
		Random rand = new Random();
		int check = rand.nextInt(0, 2);

		if (check == 0) {
			System.out.println("El Alumno esta disponible");
		} else if (check == 1) {
			System.out.println("El Alumno no esta disponible");
		}

	}

}

class Profesor {

	private String name;
	private int age;
	private String materia;
	private boolean disponible;

	public Profesor(String name, int age, String materia, boolean disponible) {
		this.name = name;
		this.age = age;
		this.materia = materia;
		this.disponible = disponible;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void disponibilidad() {
		Random rand = new Random();
		int check = rand.nextInt(0, 5);

		if (check == 0) {
			System.out.println("El profesor esta disponible");
		} else if (check == 1) {
			System.out.println("El profesor esta disponible");
		} else if (check == 2) {
			System.out.println("El profesor esta disponible");
		} else if (check == 3) {
			System.out.println("El profesor esta disponible");
		} else if (check == 4) {
			System.out.println("El profesor no esta disponible");
		}
	}
}
