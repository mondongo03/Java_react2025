

public class Tarea1Main {

	public static void main(String[] args) {
		Tarea1 array[] = new Tarea1[4];
		
		array[0] = new Lavadora(30, 200, "Blanco", 'A', 40);
		array[1] = new Lavadora(25, 500, "Rojo", 'B', 60);
		array[2] = new Television(30.0, 200, "Blanco", 'A', 40, false);
		array[3] = new Television(50.0, 900, "Azul", 'C', 30, true);
		
		for(Tarea1 run : array) {
			System.out.println("El precio final es: " +run.precioFinal(run));
		}
	}

}
