import excepciones.MiExcepcion;
import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Introduce un número positivo:");
            int numero = sc.nextInt();

            if (numero < 0) {
                throw new MiExcepcion("Error: No se permiten números negativos.");
            }

            System.out.println("Número ingresado correctamente: " + numero);
        } catch (MiExcepcion e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        } finally {
            sc.close(); 
            System.out.println("Programa finalizado.");
        }
    }
}