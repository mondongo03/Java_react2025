import java.util.ArrayList;
import java.util.Random;

public class generador {
    public static void main(String[] args) {
        Random rand = new Random();
        
        ArrayList<Integer> numerosGenerados = new ArrayList<>();
        
        while (numerosGenerados.size() < 10) {
            int randomNum = rand.nextInt(50) + 1; 

            if (!numerosGenerados.contains(randomNum)) {
                numerosGenerados.add(randomNum);  
            }
        }

        System.out.print("Numeros generados: ");
        for (int i = 0; i < numerosGenerados.size(); i++) {
            System.out.println(numerosGenerados.get(i));
            
        }
    }
}
