import java.util.InputMismatchException;
import java.util.Scanner;

public class Gestor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Introdueix el dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Introdueix el divisor: ");
            int divisor = scanner.nextInt();
            
            if (divisor == 0) {
                throw new ArithmeticException("Error: No es pot dividir per zero.");
            }
            
            int resultat = dividend / divisor;
            System.out.println("Resultat: " + resultat);
        } catch (InputMismatchException e) {
            System.out.println("Error: Has d'introduir un número enter.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operació finalitzada.");
        }
    }
}
