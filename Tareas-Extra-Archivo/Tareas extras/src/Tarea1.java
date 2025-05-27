import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Introduce un número y te diré si es primo: ");
        int primo = sc.nextInt();
        
        if (primo < 2) {
            System.out.println("El número no es primo");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i < primo; i++) {
                if (primo % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }
        }
        sc.close();
       
    }
}
