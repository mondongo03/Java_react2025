import java.util.Scanner;
public class Tarea5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero y te lo paso a decimal: ");
		int num = sc.nextInt();
		int result = 0;
		StringBuilder binario = new StringBuilder();
		while (num > 0) {
			num = num /2;
		}
		
		binario.reverse();
		System.out.println(binario);
	}

}
