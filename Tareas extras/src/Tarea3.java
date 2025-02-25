import java.util.Scanner;
public class Tarea3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tablas de multiplicar:");
		int tabla = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabla + " x " + i + " = " + tabla * i);
		}
	}

}
