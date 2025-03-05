import java.util.Scanner;
import java.util.Random;

public class Tarea9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Tamaño del array: ");
		int tamany = sc.nextInt();
		int max = 9, min = 0;

		int array[] = rellenaRandoms(max, min, tamany);

		sumaArrays(array);

	}

	public static int[] rellenaRandoms(int maximo, int minimo, int size) {
		int lista[] = new int[size];
		Random rand = new Random();
		for (int i = 0; i < lista.length; i++) {
			lista[i] = rand.nextInt(minimo, maximo + 1);
			System.out.println("Para la posicion: " + i + " El valor es: " + lista[i]);
		}
		return lista;
	}

	public static void sumaArrays(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		System.out.println("La suma de los valores es: " +suma);
	}

}
