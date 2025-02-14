
public class Tarea8 {

	public static void main(String[] args) {
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		
		B = C;
		C = A;
		A = D;
		D = B;
		
		System.out.println("A es igual a: " +A);
		System.out.println("B es igual a: " +B);
		System.out.println("C es igual a: " +C);
		System.out.println("D es igual a: " +D);

	}

}
