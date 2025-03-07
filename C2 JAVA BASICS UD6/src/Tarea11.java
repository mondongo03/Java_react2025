import java.util.Scanner;
import java.util.Random;

public class Tarea11 {

	public static void main(String[] args) {

		int array1[] = array1Random();
		int array2[] = array1;
		int array21[] = array2Random();
		multiplicarArrays(array1, array21);
	}

	public static int[] array1Random() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Tamaño del array: ");
		int array1 = sc.nextInt();
		int arrays1[] = new int[array1];

		for (int i = 0; i < arrays1.length; i++) {
			arrays1[i] = rand.nextInt(1, 15);
			System.out.println("En el indice: " + i + ", esta el valor: " + arrays1[i]);

		}
		return arrays1;

	}

	public static int[] array2Random() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Tamaño del array2: ");
		int array2 = sc.nextInt();
		int arrays2[] = new int[array2];

		for (int i = 0; i < arrays2.length; i++) {
			arrays2[i] = rand.nextInt(1, 15);
			System.out.println("En el indice: " + i + ", esta el valor: " + arrays2[i]);
		}
		return arrays2;
	}

	public static void multiplicarArrays(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
				int result = a[i] * b[i];
				System.out.println("La multiplicacion de: " + a[i] + " por " + b[i] + " = " + result);
			}
		}
	}
