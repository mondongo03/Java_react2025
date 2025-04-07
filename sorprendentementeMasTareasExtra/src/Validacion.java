import java.util.Scanner;

class LoginIncorrecteException extends Exception {
    public LoginIncorrecteException(String missatge) {
        super(missatge);
    }
}

public class Validacion {
    private static final String USUARI_CORRECTE = "admin";
    private static final String PASSWORD_CORRECTE = "1234";
    private static final int INTENTS_MAXIMS = 3;

    public static void validarCredencials(String usuari, String password) throws LoginIncorrecteException {
        if (!usuari.equals(USUARI_CORRECTE) || !password.equals(PASSWORD_CORRECTE)) {
            throw new LoginIncorrecteException("Error: Usuari o contrasenya incorrectes.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intents = 0;
        boolean loginCorrecte = false;

        while (intents < INTENTS_MAXIMS && !loginCorrecte) {
            try {
                System.out.print("Introdueix el nom d'usuari: ");
                String usuari = scanner.nextLine().trim();
                System.out.print("Introdueix la contrasenya: ");
                String password = scanner.nextLine().trim();

                if (usuari.isEmpty() || password.isEmpty()) {
                    throw new IllegalArgumentException("Error: Els camps no poden estar buits.");
                }
                if (!usuari.matches("[a-zA-Z0-9]+") || !password.matches("[a-zA-Z0-9]+")) {
                    throw new IllegalArgumentException("Error: Nom d'usuari o contrasenya contenen caràcters no permesos.");
                }

                validarCredencials(usuari, password);
                System.out.println("Accés concedit! Benvingut, " + usuari + "!");
                loginCorrecte = true;
            } catch (LoginIncorrecteException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
                intents++;
                if (intents == INTENTS_MAXIMS) {
                    System.out.println("Has superat el nombre màxim d'intents. Accés denegat.");
                }
            }
        }
        
        scanner.close();
        System.out.println("Fi del programa.");
    }
}
