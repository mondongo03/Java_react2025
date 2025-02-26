import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Radio circulo: ");
		double radio = sc.nextDouble();
		double calc = Math.PI * Math.pow(radio, 2);
		System.out.println("El area de el circulo es: " + calc);

		System.out.print("Radio triangulo: ");
		double radio2 = sc.nextDouble();
		System.out.print("Altura triangulo: ");
		double altura = sc.nextDouble();
		double total = (radio2 * altura) / 2;
		System.out.println("La base del triangulo es: " +total);
		
		System.out.print("Area cuadrado: ");
		double cuadrado = sc.nextDouble();
		double cuadradoArea = Math.pow(cuadrado, 2);
		
		System.out.println("El area del cuadrado es: " +cuadradoArea);
		
		sc.close();
	}
	
}
