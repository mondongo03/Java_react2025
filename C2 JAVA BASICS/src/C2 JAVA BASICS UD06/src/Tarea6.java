import java.util.Scanner;
public class Tarea6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Di un numero y te dire"
				+ "el numero de digitos:");
		int num = sc.nextInt();
		
		int cantidad = String.valueOf(num).length();
		System.out.println("El valor es: " +cantidad);
	}

}
