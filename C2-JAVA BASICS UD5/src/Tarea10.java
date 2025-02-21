import java.util.Scanner;
public class Tarea10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de ventas: ");
		int numeroVentas = sc.nextInt();
		
		double suma = 0;
		
		for (int i = 1; i <= numeroVentas; i++) {
			 System.out.print("Introduce el valor de la venta " + i + ": ");
	            double venta = sc.nextDouble();
	            suma += venta;
		}
		
        System.out.println("La suma total de las ventas es: " + suma);

        sc.close();

		}
	}
