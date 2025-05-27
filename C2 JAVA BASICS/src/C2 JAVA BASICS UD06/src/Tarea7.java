import java.util.Scanner;
public class Tarea7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad de euros: ");
		int euros = sc.nextInt();
		
		double result = convertirEurosADolares(euros);
		System.out.println("La conversion son: " +result +" USD");
		
	}
    public static double convertirEurosADolares(double euros) {
        double tasaCambio = 1.08;
        double dolares = euros * tasaCambio;
        
        return dolares;
	}
}
