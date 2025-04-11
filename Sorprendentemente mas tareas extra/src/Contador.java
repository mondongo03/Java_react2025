import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        int pares = 0;
        int impares = 0;

        while (numero > 0) {
            int digito = numero % 10; 

            if (digito % 2 == 0) {
                pares++;  
            } else {
                impares++;  
            }

            numero /= 10;  
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
