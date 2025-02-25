import java.util.Scanner;

public class Tarea2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero y te dire su factorial: ");
		int factorial = sc.nextInt();
	
		
		int resultado = 1;
		for (int i = 1; i <= factorial; i++) {
			resultado *= i;
		}
	
		System.out.println("El factorial de " + factorial + " es " + resultado);
		
		
		
		
		}

	}
