import java.util.InputMismatchException;
import java.util.Scanner;

class TemperaturaInvalidaException extends Exception {
    public TemperaturaInvalidaException(String missatge) {
        super(missatge);
    }
}

public class Conversor {
    public static double convertirACelsiusAFahrenheit(double celsius) throws TemperaturaInvalidaException {
        if (celsius < -273.15) {
            throw new TemperaturaInvalidaException("Error: La temperatura no pot ser inferior al zero absolut (-273.15 ºC).");
        }
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Introdueix la temperatura en graus Celsius: ");
            double celsius = scanner.nextDouble();
            
            double fahrenheit = convertirACelsiusAFahrenheit(celsius);
            System.out.println("Temperatura en Fahrenheit: " + fahrenheit + " ºF");
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Has d'introduir un número vàlid.");
        } catch (TemperaturaInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
