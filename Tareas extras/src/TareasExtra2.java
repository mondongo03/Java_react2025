
public class TareasExtra2 {

	public static void main(String[] args) {
		
		int numeros[] = {4, 6, 2, 10, 24, 3, 5, 1, 45};
		int max = numeros[0];
		
		for(int run : numeros) {
			if(run > max) {
				max = run;
				System.out.println(max);

			}
		}	
	}
}
