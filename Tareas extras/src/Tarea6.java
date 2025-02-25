import java.util.Scanner;
public class Tarea6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero y sumare sus anteriores(ej 5+4+3+2+1): ");
		int numero = sc.nextInt();
		
		int suma = 0;
		for (int i = numero; i > 0; i--) {
			suma += i;
		}
		System.out.println("La suma de los numeros anteriores a " + numero + " es " + suma);
	}

}
