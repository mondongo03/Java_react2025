public class Tarea4 {

	private double num1;
	private double num2;

	public double suma(double num1, double num2) {
		System.out.println("El resultado es: " + (num1 + num2));
		return num1 + num2;
	}

	public double resta(double num1, double num2) {
		System.out.println("El resultado es: " + (num1 - num2));
		return num1 - num2;
	}

	public double multi(double num1, double num2) {
		System.out.println("El resultado es: " + (num1 * num2));
		return num1 * num2;
	}

	public double div(double num1, double num2) {
		if (num2 == 0) {
			throw new ArithmeticException("El número no puede dividirse por 0");
		}
		System.out.println("El numero no puede dividir 0");

		System.out.println("El resultado es: " + (num1 / num2));
		return num1 / num2;
	}

	public double potencia(double a, double b) {
		System.out.println("El resultado es: " + (Math.pow(a, b)));
		return Math.pow(a, b);
	}

	public double raizCuadrada(double a) {
		if (a < 0) {
			throw new IllegalArgumentException("No puedes introducir un número negativo");
		}
		System.out.println("No puedes introducir un numero negativo");

		System.out.println("El resultado es: " + (Math.sqrt(a)));
		return Math.sqrt(a);
	}

	public static void main(String[] args) {
		Tarea4 test = new Tarea4();

		test.suma(1, 5);
		test.resta(2, 1);
		test.multi(10, 2);
		test.potencia(5, 3);
		

	    try {
	        test.div(12, 0); 
	    } catch (ArithmeticException e) {
	        System.out.println("Error: " + e.getMessage());
	    }

	    test.potencia(5, 3);

	    try {
	        test.raizCuadrada(-5); 
	    } catch (IllegalArgumentException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}

	}
