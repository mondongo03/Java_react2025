import java.util.Scanner;
public class Tarea4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una palabra y te dire el numero de letras: ");
		String palabra = sc.nextLine();
		
		int longitud = palabra.length();
		
		System.out.println("La palabra " + palabra + " tiene " + longitud + " letras.");
		
		
	}

}
