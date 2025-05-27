
public class Arrays {

	public static void main(String[] args) {
		int lista[] = {2, 5, 4, 12, 9, 6};
		int max = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] >= max){
				max = lista[i];
				
			}
	
			
		}
		System.out.println(max);
	}
	
}
