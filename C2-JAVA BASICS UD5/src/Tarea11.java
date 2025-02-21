import java.util.Scanner;
public class Tarea11 {

	public static void main(String[] args) {
		System.out.println("Dias laborales: Lunes, Martes, Miercoles, Jueves, Viernes. "
				+ "Dias festivos: Sabado, Domingo.");
		Scanner dias = new Scanner(System.in);
		
		System.out.print("Introduce un dia: ");
		String dia = dias.nextLine();
		
		switch (dia){
		case "Lunes":
			System.out.println("Es un dia laboral.");
			break;
		case "Martes":
			System.out.println("Es un dia laboral.");
			break;
		case "Miercoles":
			System.out.println("Es un dia laboral.");
			break;
		case "Jueves":
			System.out.println("Es un dia laboral.");
			break;
		case "Viernes":
			System.out.println("Es un dia laboral.");
			break;
		case "Sabado":
			System.out.println("Es un dia festivo.");
			break;
		case "Domingo":
			System.out.println("Es un dia festivo.");
			break;
		default:
			System.out.println("No introduciste un dia correcto.");
		}
	}

}
