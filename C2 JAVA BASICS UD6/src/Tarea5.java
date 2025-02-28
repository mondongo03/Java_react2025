import java.util.Scanner;
public class Tarea5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un número en base decimal: ");
	        int num = sc.nextInt();
	        
	        if (num == 0) {
	            System.out.println("El número binario es: 0");
	            return; 
	        }
	        String binario = ""; 

	        while (num > 0) {
	            int residuo = num % 2;  
	            binario = residuo + binario;
	            num = num / 2;  
	        }

	        System.out.println("El número binario es: " + binario);
	    }
	}

