import java.util.Scanner;

public class Tarea13 {

	public static void main(String[] args) {

		System.out.println("Signos aritmeticos disponibles: " + "+, -, *, /, %");
		Scanner calc = new Scanner(System.in);

		System.out.print("Dame un numero1: ");
		int num1 = calc.nextInt();
		System.out.print("Dame un numero2: ");
		int num2 = calc.nextInt();
		
		calc.nextLine();
		
		System.out.print("Dame un signo aritmetico: ");
		String coso = calc.nextLine();

		int suma = num1 + num2;
		int resta = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		int residuo = num1 % num2;

		if (coso.equals("+")) {
			System.out.println("La suma es: " + suma);
		}
		if (coso.equals("-")) {
			System.out.println("La resta es: " + resta);
		}
		if (coso.equals("*")) {
			System.out.println("La multi es: " + multi);
		}
		if (coso.equals("/")) {
			System.out.println("La division es: " + div);
		}
		if (coso.equals("%")) {
			System.out.println("El residuo es: " + residuo);
		}

	}

}
