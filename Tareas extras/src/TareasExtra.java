import java.util.Scanner;
public class TareasExtra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Invertir: ");
		String inverse = sc.nextLine();
		
		
		
		for(int vacio = inverse.length() -1; vacio >= 0; vacio-- ) {
			
		System.out.println(inverse.charAt(vacio));
			
		}
		
		
	}

}
