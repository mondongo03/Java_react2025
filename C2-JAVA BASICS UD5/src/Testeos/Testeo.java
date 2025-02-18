package Testeos;

import java.util.Scanner;

public class Testeo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Bienvenido a java");
			System.out.println("Introduce tu nombre: ");
			
			String name = sc.nextLine();
			sc.close();
			
			System.out.println("Hola " +name.toUpperCase());
			}

}
