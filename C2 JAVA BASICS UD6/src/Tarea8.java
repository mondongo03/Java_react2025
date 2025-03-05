import java.util.Scanner;
public class Tarea8 {

	public static void main(String[] args) {
		int num[] = rellenarArrays(5);
		imprimirArrays(num);
		
		
	}
	public static void imprimirArrays(int lista[]) {
		for (int i = 0; i<lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	public static int[] rellenarArrays(int fill) {
		int num[] = new int[15];
		for (int i = 0; i < num.length; i++) {
			num[i] = fill;
			fill++;
		}
		return num;
	}
}
