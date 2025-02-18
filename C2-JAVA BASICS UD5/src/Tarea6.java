import java.util.Scanner;
public class Tarea6 {

	public static void main(String[] args) {
		final double IVA = 0.21;
		Scanner result = new Scanner(System.in);
		
		System.out.println("Bienvenido al IVA!");
		System.out.println("Introduce su cantidad de dinero: ");
		
		int number = result.nextInt();
		result.close();
		
		System.out.println("El precio total es de: " + (number + (number * IVA)));


	}

}
