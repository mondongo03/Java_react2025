import java.util.Scanner;

public class factorialtest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Numero: ");
		int numero = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= numero; i++) {
		result *= i;
			
		 System.out.println(result);
			
		}
	}

}
