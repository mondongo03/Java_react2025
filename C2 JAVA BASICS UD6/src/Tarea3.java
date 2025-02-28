import java.util.Scanner;

public class Tarea3 {

	public static void main(String[] args) {
		//Variables
		int primo =0;
		
		//Acciones
		Scanner sc = new Scanner(System.in);

		System.out.print("Di un numero y te dire si es primo: ");
		primo = sc.nextInt();
		
		if (esPrimo(primo)) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
//		if (primo < 2) {
//			
//			esPrimo = false;
//		} else {
//		
//			for (int i = 2; primo > i; i++) {
//				if (primo % i == 0) {
//					esPrimo = false;
//				}
//			}
//		}
//		if (esPrimo) {
//			System.out.println("Es primo");
//		} else {
//			System.out.println("No es primo");
//		}
		
		//Cierre de recursos
		sc.close();

	}
	public static boolean esPrimo(int numero) {
		Boolean esPrimo = true;
		if (numero < 2) {
			
			esPrimo = false;
		} else {
		
			for (int i = 2; numero > i; i++) {
				if (numero % i == 0) {
					esPrimo = false;
				}
			}
		}
		
		
		return esPrimo;
	}

}
