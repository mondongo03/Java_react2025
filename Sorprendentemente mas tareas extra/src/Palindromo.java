import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix una paraula: ");
        String paraula = scanner.nextLine();

        String invertida = new StringBuilder(paraula).reverse().toString();

        System.out.println("Paraula original: " + paraula);
        System.out.println("Paraula invertida: " + invertida);

        if (paraula.equals(invertida)) {
            System.out.println("És palíndrom!");
        } else {
            System.out.println("No és palíndrom.");
        }
    }
}
