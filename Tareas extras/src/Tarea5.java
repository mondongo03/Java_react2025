import java.util.Scanner;
import java.util.Random;
public class Tarea5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Adivina el numero secreto con pistas: ");
		int numeroSecreto = sc.nextInt();
		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(100);
		int intentos = 0;
		while (numeroSecreto != numeroAleatorio) {
			if (numeroSecreto < numeroAleatorio) {
				System.out.println("El numero secreto es mayor");
			} else {
				System.out.println("El numero secreto es menor");
			}
			System.out.print("Introduce otro numero: ");
			numeroSecreto = sc.nextInt();
			intentos++;
		}
		System.out.println("Has acertado el numero secreto en " + intentos + " intentos");
		
	}

}
