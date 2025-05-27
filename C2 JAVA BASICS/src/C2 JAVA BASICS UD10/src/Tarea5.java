import java.util.Random;
import java.util.Scanner;

public class Tarea5 {

	private int longitud;
	private String contrasenia;

	public Tarea5() {
		this.longitud = 8;
		this.contrasenia = "";
	}

	public Tarea5(int longitud, String contrasenia) {
		this.longitud = longitud;
		this.contrasenia = contrasenia;
	}

	public boolean esFuerte(String contrasenia) {
		int digito = 0, minus = 0, mayus = 0;

		for (int i = 0; i < contrasenia.length(); i++) {
			char c = contrasenia.charAt(i);

			if (Character.isUpperCase(c)) {
				mayus++;
			} else if (Character.isLowerCase(c)) {
				minus++;
			} else if (Character.isDigit(c)) {
				digito++;
			}

		}
		if (mayus == 2 && minus == 1 && digito == 5) {
			System.out.println("Es fuerte.");
		} else {
			System.out.println("No es fuerte.");
		}
		return true;

	}

	public String generarPassword(int longitud) {
		Random rand = new Random();
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String contrasenia = "";

		for (int i = 0; i < longitud; i++) {

			int contra = rand.nextInt(caracteres.length());
			contrasenia += caracteres.charAt(contra);
		}
		return contrasenia;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public static void main(String[] args) {
		Tarea5 test = new Tarea5();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el número de contraseñas a generar: ");
		int cantidadContraseñas = scanner.nextInt();

		System.out.print("Ingrese la longitud de las contraseñas: ");
		int longitudContraseña = scanner.nextInt();

		Tarea5[] passwords = new Tarea5[cantidadContraseñas];
		boolean[] esFuerte = new boolean[cantidadContraseñas];

		for (int i = 0; i < cantidadContraseñas; i++) {
			passwords[i] = new Tarea5(longitudContraseña, ""); 
			passwords[i].setContrasenia(passwords[i].generarPassword(longitudContraseña)); 
			System.out.println("Contraseña generada: " + passwords[i].getContrasenia());
			esFuerte[i] = passwords[i].esFuerte(passwords[i].getContrasenia()); 
		}

		for (int i = 0; i < cantidadContraseñas; i++) {
			System.out.println("Contraseña: " + passwords[i].getContrasenia() + " | Es fuerte: " + esFuerte[i]);
		}

		scanner.close();
	}
}
