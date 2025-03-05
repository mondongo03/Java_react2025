import java.util.Scanner;

public class Tarea8 {

    public static void main(String[] args) {
        int[] numbers = new int[10]; 
        rellenarArray(numbers); 
        mostrarArray(numbers); 
    }

   
    public static void rellenarArray(int[] array) {
        Scanner sc = new Scanner(System.in); 
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce un número para la posición " + i + ": ");
            array[i] = sc.nextInt(); 
        }
    }
    public static void mostrarArray(int[] array) {
        System.out.println("\nContenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + " → Valor: " + array[i]);
        }
    }
}
