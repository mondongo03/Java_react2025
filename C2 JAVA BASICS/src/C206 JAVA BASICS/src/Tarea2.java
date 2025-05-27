import java.util.Random;
import java.util.Scanner;
public class Tarea2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Dime un numero y te generare algo por arriba: ");
		int min = sc.nextInt();
		
		System.out.print("Dime un numero y te generare algo por debajo: ");
		int max = sc.nextInt();
		
		int randomNum = random.nextInt(min, max);
		
		System.out.println("Numero generado: " +randomNum);
		
	}

}
