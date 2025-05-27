import java.util.HashMap;

public class Tarea1 {

	public static void main(String[] args) {
		HashMap<String, Double> notas = new HashMap<>();
		notas.put("Jorge", 9.0);
		notas.put("Alejandro", 5.0);
		notas.put("Carla", 6.0);
		notas.put("Jesus", 3.0);
		
		double medio = media(notas);
		
		System.out.println(medio);
	}
	public static double media(HashMap<String, Double> numeros) {
		double sum = 0;
		for (Double media : numeros.values()) {
			sum += media;
			
		}
		return sum / numeros.size();
	}

}
