import java.util.Random;

class NumeroParImparException extends Exception {
    public NumeroParImparException(String mensaje) {
        super(mensaje);
    }
}

public class Tarea3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numero = rand.nextInt(1000);

        try {
            verificarParImpar(numero);
        } catch (NumeroParImparException e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

    public static void verificarParImpar(int numero) throws NumeroParImparException {
        if (numero % 2 == 0) {
            throw new NumeroParImparException("El número " + numero + " es par.");
        } else {
            throw new NumeroParImparException("El número " + numero + " es impar.");
        }
    }
}