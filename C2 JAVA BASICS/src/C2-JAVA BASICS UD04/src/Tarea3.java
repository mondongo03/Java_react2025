
public class Tarea3 {

	public static void main(String[] args) {
		double X = 5.0;
		double Y = 7.0;
		double M = 10.5;
		double N = 2.7;
		double suma1 = X + Y;
		double resta1 = X - Y;
		double multi1 = X * Y;
		double div1 = X / Y;
		double residuo1 = X % Y;
		double suma2 = N + M;
		double resta2 = N - M;
		double multi2 = N * M;
		double div2 = N / M;
		double residuo2 = N % M;
		double suma3 = X + N;
		double div3 = Y / M;
		double residuo3 = Y % M;
		double doble1 = X + X;
		double doble2 = Y + Y;
		double doble3 = M + M;
		double doble4 = N + N;
		double granSuma = X + Y + M + N;
		double granMulti = X * Y * M * N;
		
		
		System.out.println("El valor de X es: " +X);
		System.out.println(" | El valor de Y es: " +Y);
		System.out.println(" | El valor de M es: " +M);
		System.out.println(" | El valor de N es: " +N);
		System.out.println(" | X + Y: " +suma1);
		System.out.println(" | X - Y: " +resta1);
		System.out.println(" | X * Y: " +multi1);
		System.out.println(" | X / Y: " +div1);
		System.out.println(" | X % Y: " +residuo1);
		System.out.println(" | N + M: " +suma2);
		System.out.println(" | N - M: " +resta2);
		System.out.println(" | N * M: " +multi2);
		System.out.println(" | N / M: " +div2);
		System.out.println(" | N % M: " +residuo2 +" otro texto");
		System.out.println(" | X + N: " +suma3);
		System.out.println(" | Y / M: " +div3);
		System.out.println(" | Y % M: " +residuo3);
		System.out.println(" | El doble de X es: " +doble1);
		System.out.println(" | El doble de Y es: " +doble2);
		System.out.println(" | El doble de M es: " +doble3);
		System.out.println(" | El doble de N es: " +doble4);
		System.out.println(" | La suma de todo es: " +granSuma);
		System.out.println(" | La multiplicacion de todos los valores es: " +granMulti);
	}

}
