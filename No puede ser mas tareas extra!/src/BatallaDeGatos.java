import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class BatallaDeGatos {

	public static void main(String[] args) {
		HashMap<String, Integer> GatosPrecio = new HashMap<>();
		HashMap<String, Integer> GatosVida = new HashMap<>();
		HashMap<String, Integer> GatosDanio = new HashMap<>();
		HashMap<String, Integer> GatosExp = new HashMap<>();
		HashMap<String, Integer> EnemigosDanio = new HashMap<>();
		HashMap<String, Integer> EnemigosVida = new HashMap<>();

		VerPrecio(GatosPrecio);
		VerVida(GatosVida);
		VerDanio(GatosDanio);
		VerExp(GatosExp);
		enemigosVida(EnemigosVida);
		enemigosDanio(EnemigosDanio);
				
		int count = 0;
		while(count != 1) {
			
			int elegir = welcome();
			
		switch(elegir) {
		
		case 1:
			menu1(EnemigosVida, EnemigosDanio, GatosVida, GatosDanio);
			break;
		case 2:
			menu2(GatosExp, GatosVida, GatosDanio);
			break;
		case 3:
			count++;
			break;
		default:
			System.out.println("------------------------->");
			System.out.println("Opcion incorrecta.");
			count++;
			}
		}
		
	}
	public static void enemigosDanio(HashMap<String, Integer> mapa) {
		mapa.put("Perro", 5);
		mapa.put("Serpiente", 12);
		mapa.put("Persona", 10);
		mapa.put("Gorila", 27);
		mapa.put("Cocodrilo", 25);
		mapa.put("Foca", 38);
		mapa.put("Canguro", 55);
		mapa.put("Dinosaurio", 120);
		mapa.put("Perro gigante", 280);
		mapa.put("Gato dios", 1000);
		mapa.put("Gato dios final", 2500);

		
	}
	
	public static void enemigosVida(HashMap<String, Integer> mapa) {
		mapa.put("Perro", 20);
		mapa.put("Serpiente", 30);
		mapa.put("Persona", 60);
		mapa.put("Gorila", 150);
		mapa.put("Cocodrilo", 15);
		mapa.put("Foca", 200);
		mapa.put("Canguro", 280);
		mapa.put("Dinosaurio", 750);
		mapa.put("Perro gigante", 1000);
		mapa.put("Gato dios", 12000);
		mapa.put("Gato dios final", 35000);

		
	}
	
	public static void menu1(HashMap<String, Integer> mapa2,  HashMap<String, Integer> mapa3, HashMap<String, Integer> mapa4, HashMap<String, Integer> mapa5) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Etapas disponibles: ");
		System.out.println("------------------------->");
		System.out.println("1. España");
		System.out.println("2. Universo");
		System.out.println("3. Salir al menu principal");
		System.out.println("------------------------->");
		System.out.print("Opcion: ");
		int answer = sc.nextInt();
		System.out.println("------------------------->");

		
		switch(answer) {
		case 1:
			Espania(mapa2, mapa3, mapa4, mapa5);
			System.out.println("------------------------->");
			break;
		case 2:
			Universo(mapa2, mapa3, mapa4, mapa5);
			System.out.println("------------------------->");
			break;
		
		default:
			System.out.println("Opcion incorrecta.");
		}

	}
	
	public static boolean Espania(HashMap<String, Integer> mapa2,  HashMap<String, Integer> mapa3, HashMap<String, Integer> mapa4, HashMap<String, Integer> mapa5) {
		boolean etapaGanada = false;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Inicia el nivel!");
		System.out.println();
		
		if(mapa2.containsKey("Perro")) {
			System.out.println("El enemigo 'Perro' tiene: " +mapa2.get("Perro") +" de vida y: " +mapa3.get("Perro") +" de daño.");
		}
		if(mapa2.containsKey("Serpiente")) {
			System.out.println("El enemigo 'Serpiente' tiene: " +mapa2.get("Serpiente") +" de vida y: " +mapa3.get("Serpiente") +" de daño.");
		}
		if(mapa2.containsKey("Persona")) {
			System.out.println("El enemigo 'Persona' tiene: " +mapa2.get("Persona") +" de vida y: " +mapa3.get("Persona") +" de daño.");
		}
		System.out.println("------------------------->");

		System.out.println("Aparece un enemigo 'Perro' ");
		System.out.println("------------------------->");

		System.out.println("Que gato deseas desplegar? ");
		System.out.println("------------------------->");

		System.out.println("Tus gatos son: ");
		System.out.println("------------------------->");

		for(Map.Entry<String, Integer> entry : mapa4.entrySet()) {
			System.out.println(entry.getKey());
		}
		System.out.println("------------------------->");

		System.out.println("Opcion: ");
		String pregunta = sc.nextLine();
		System.out.println("------------------------->");
		
		while(true) {

		if(mapa4.containsKey(pregunta)) {
			System.out.println("Has sacado un: " +pregunta +" con " +mapa4.get(pregunta) +" de vida y " +mapa5.get(pregunta) +" de daño.");
		}
		System.out.println("------------------------->");
		
		System.out.println("El perro ataca a tu: " +pregunta);
		System.out.println("------------------------->");
		
		int vidaAntes = mapa4.get(pregunta);
		int danio = mapa3.get("Perro");
		int vidaDespues = vidaAntes - danio;
		
		System.out.println("La vida de tu: " +pregunta +" ha sido reducida de " +mapa4.get(pregunta) +" a " +vidaDespues);
		System.out.println("------------------------->");
		mapa4.put(pregunta, vidaDespues);
		
		if(vidaDespues <= 0) {
			System.out.println("Tu gato ha caido en combate!");
			break;
		}
		
		System.out.println("ATACAR? [SI/SI]");
		String question = sc.nextLine();
		
		int vidaPerro = mapa2.get("Perro");
		int danioNuestro = mapa5.get(pregunta);
		int vidaMastarde = vidaPerro - danioNuestro;
		
		mapa2.put("Perro", vidaMastarde);

		
		if(question.equalsIgnoreCase("Si")) {
			System.out.println("La vida del 'Perro' ha bajado de: " +mapa2.get("Perro") +" a " +vidaMastarde);
		}
		
		System.out.println("------------------------->");

		if(vidaMastarde <= 0) {
			System.out.println("Has ganado el primer stage!!");
			etapaGanada = true;
			break;
				}
		
		}
		return etapaGanada;
	}
	
	public static boolean Universo(HashMap<String, Integer> mapa2,  HashMap<String, Integer> mapa3, HashMap<String, Integer> mapa4, HashMap<String, Integer> mapa5) {
		boolean etapaGanada = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Has provocado la ira de los gatos...");
		System.out.println();

		if(mapa2.containsKey("Perro")) {
			System.out.println("El enemigo 'Gato dios' tiene: " +mapa2.get("Gato dios") +" de vida y: " +mapa3.get("Gato dios") +" de daño.");
		}

		System.out.println("------------------------->");
		System.out.println("Aparece un enemigo 'Gato dios' ");
		System.out.println("------------------------->");

		String pregunta = "";

		while(true) {
			if (pregunta.equals("") || mapa4.get(pregunta) <= 0) {
				System.out.println("Que gato deseas desplegar? ");
				System.out.println("------------------------->");

				System.out.println("Tus gatos son: ");
				System.out.println("------------------------->");

				for(Map.Entry<String, Integer> entry : mapa4.entrySet()) {
					if(entry.getValue() > 0) {
						System.out.println(entry.getKey());
					}
				}
				System.out.println("------------------------->");

				System.out.println("Opcion: ");
				pregunta = sc.nextLine();
				System.out.println("------------------------->");

				if(!mapa4.containsKey(pregunta)) {
					System.out.println("Ese gato no existe, intenta de nuevo.");
					pregunta = "";
					continue;
				}
				
				if(mapa4.get(pregunta) <= 0) {
					System.out.println("Ese gato ya está muerto, elige otro.");
					pregunta = "";
					continue;
				}

				System.out.println("Has sacado un: " +pregunta +" con " +mapa4.get(pregunta) +" de vida y " +mapa5.get(pregunta) +" de daño.");
				System.out.println("------------------------->");
			}

			System.out.println("El Gato dios ataca a tu: " +pregunta);
			System.out.println("------------------------->");

			int vidaAntes = mapa4.get(pregunta);
			int danio = mapa3.get("Gato dios");
			int vidaDespues = vidaAntes - danio;

			System.out.println("La vida de tu: " +pregunta +" ha sido reducida de " +vidaAntes +" a " +vidaDespues);
			System.out.println("------------------------->");
			mapa4.put(pregunta, vidaDespues);

			if(vidaDespues <= 0) {
				System.out.println("Tu gato ha caido en combate!");
				pregunta = "";
				continue;
			}

			System.out.println("ATACAR? [SI/SI]");
			String question = sc.nextLine();

			int vidaPerro = mapa2.get("Gato dios");
			int danioNuestro = mapa5.get(pregunta);
			int vidaMastarde = vidaPerro - danioNuestro;

			mapa2.put("Gato dios", vidaMastarde);

			if(question.equalsIgnoreCase("Si")) {
				System.out.println("La vida del 'Gato dios' ha bajado de: " +vidaPerro +" a " +vidaMastarde);
			}

			if(question.equalsIgnoreCase("Catnip")) {
				vidaMastarde = 0;
				System.out.println("Gato dios: NOOOOOOO MI IMPERIO");
			}
			System.out.println("------------------------->");

			if(vidaMastarde <= 0) {
				System.out.println("Gato dios: NOOOOOOO MI IMPERIO");
				System.out.println("Has ganado a dios en carne...");
				System.out.println("Se escucha un ruido de fondo...");
				System.out.println("El enemigo 'Gato dios final' tiene: " +mapa2.get("Gato dios final") +" de vida y: " +mapa3.get("Gato dios final") +" de daño.");
				break;
			}
		}

		return etapaGanada;
	}
	
	public static boolean GanarPerderEspania(HashMap<String, Integer> mapa2,  HashMap<String, Integer> mapa3, HashMap<String, Integer> mapa4, HashMap<String, Integer> mapa5) {
		
		boolean etapaGanada = Espania(mapa2, mapa3, mapa4, mapa5);
		
		return etapaGanada;
	}
	
	public static boolean GanarPerderUniverso(HashMap<String, Integer> mapa2,  HashMap<String, Integer> mapa3, HashMap<String, Integer> mapa4, HashMap<String, Integer> mapa5) {
		boolean etapaGanada5 = Universo(mapa2, mapa3, mapa4, mapa5);
		
		return etapaGanada5;
	}
	
	public static int ExpEtapas(HashMap<String, Integer> mapa2,  HashMap<String, Integer> mapa3, HashMap<String, Integer> mapa4, HashMap<String, Integer> mapa5) {
		int exp = 0;
		boolean etapaGanada = GanarPerderEspania(mapa2, mapa3, mapa4, mapa5);
		boolean etapaGanada5 = GanarPerderUniverso(mapa2, mapa3, mapa4, mapa5);
		
		
		if(etapaGanada == true) {
			exp+=3000;
		}
		if(etapaGanada5 == true) {
			exp+=99999;
		}
		
		
		return exp;
		
	}
	
	public static void menu2(HashMap<String, Integer> mapa, HashMap<String, Integer> mapa2,  HashMap<String, Integer> mapa3) {
		Scanner sc = new Scanner(System.in);
	
		int exp = 999999;
		int count = 0;
		
		while(count != 1) {
			
			System.out.println("Bienvenido al menu de mejoras.");
			System.out.println("Opciones disponibles: ");
			System.out.println("------------------------->");
			System.out.println("1. Ver la experiencia requerida de cada gato.");
			System.out.println("2. Ver estadisticas de gatos.");
			System.out.println("3. Ver gatos disponibles.");
			System.out.println("4. Salir al menu principal.");
			System.out.println("------------------------->");
			System.out.print("Opcion: ");
			int pregunta = sc.nextInt();	
			sc.nextLine();
			
		if(pregunta == 1) {
		System.out.println("Gatos disponibles para mejorar: ");
		System.out.println("------------------------->");

		for(Map.Entry<String, Integer> entry : mapa.entrySet()) {
			String clave = entry.getKey();
			int experiencia = entry.getValue();
			System.out.println(clave +" -> " +experiencia +" de experiencia requerida.");
			System.out.println("------------------------->");
			}
		
		System.out.println("Que gato deseas mejorar?");
		String preg = sc.nextLine();
		System.out.println("------------------------->");

		if (exp < 0) {
		    System.out.println("No tienes suficiente experiencia.");
		    System.out.println("------------------------->");
		} else if (mapa2.containsKey(preg) && mapa3.containsKey(preg)) {
		    int vida = mapa2.get(preg);
		    int danio = mapa3.get(preg);

		    if (preg.equalsIgnoreCase("Gato basico")) {
		        System.out.println("Eso serán 1000 de experiencia!");
		        System.out.println("La vida ha pasado de: " + vida + " -> " + (vida + 15));
		        System.out.println("El daño ha pasado de: " + danio + " -> " + (danio + 15));
		        exp -= 1000;
		        mapa2.put(preg, vida + 15);
		        mapa3.put(preg, danio + 15);

		    } else if (preg.equalsIgnoreCase("Gato tanque")) {
		        System.out.println("Eso serán 1200 de experiencia!");
		        System.out.println("La vida ha pasado de: " + vida + " -> " + (vida + 35));
		        System.out.println("El daño ha pasado de: " + danio + " -> " + (danio + 5));
		        exp -= 1200;
		        mapa2.put(preg, vida + 35);
		        mapa3.put(preg, danio + 5);

		    } else if (preg.equalsIgnoreCase("Gato titan")) {
		        System.out.println("Eso serán 2600 de experiencia!");
		        System.out.println("La vida ha pasado de: " + vida + " -> " + (vida + 75));
		        System.out.println("El daño ha pasado de: " + danio + " -> " + (danio + 75));
		        exp -= 2600;
		        mapa2.put(preg, vida + 75);
		        mapa3.put(preg, danio + 75);

		    } else if (preg.equalsIgnoreCase("Gato pez")) {
		        System.out.println("Eso serán 2000 de experiencia!");
		        System.out.println("La vida ha pasado de: " + vida + " -> " + (vida + 25));
		        System.out.println("El daño ha pasado de: " + danio + " -> " + (danio + 35));
		        exp -= 2000;
		        mapa2.put(preg, vida + 25);
		        mapa3.put(preg, danio + 35);
		    }
		    System.out.println("------------------------->");
		    
		    System.out.println("Te quedan: " +exp +" puntos de experiencia.");

		    System.out.println("------------------------->");

		} else {
		    System.out.println("No se encontró ese gato en el mapa.");
		}

		}
		else if(pregunta == 2) {
		
		int count2 = 0;	
		while(count2 != 1) {	
		System.out.println("------------------------->");
		
		System.out.println("De que gato quieres ver las estadisticas? ");
		String answer = sc.nextLine();
		System.out.println("------------------------->");

		
		for(Map.Entry<String, Integer> entry : mapa2.entrySet()) {
			if(entry.getKey().equals(answer)) {
				int vida = entry.getValue();
				System.out.println("La vida del gato: "+answer +" es de: " +vida);
			}
			
		}
		System.out.println("------------------------->");

		for(Map.Entry<String, Integer> entry : mapa3.entrySet()) {
			if(entry.getKey().equals(answer)) {
				int daño = entry.getValue();
				System.out.println("El daño del gato: "+answer +" es de: " +daño);
			}
		}
		System.out.println("------------------------->");		
			
		System.out.println("Deseas salir de este apartado? [Si/No]: ");
		String respuesta = sc.nextLine();
		System.out.println("------------------------->");		

		
		if(respuesta.equalsIgnoreCase("Si")){
			count2++;
				}
			}
		}
		else if(pregunta == 3) {
			System.out.println("------------------------->");
			for(Map.Entry<String, Integer> entry : mapa.entrySet()) {
				String clave = entry.getKey();
				System.out.println(clave);
				}
			System.out.println("------------------------->");

		}
		else if(pregunta == 4) {
			System.out.println("------------------------->");
			count=1;
			}
		}
		
	}
	
	public static void VerExp(HashMap<String, Integer> mapa) {
		mapa.put("Gato basico", 1000);
		mapa.put("Gato tanque", 1200);
		mapa.put("Gato pez", 2000);
		mapa.put("Gato titan", 2600);
	}
	
	public static int restarEnergia(HashMap<String, Integer> mapa)  {
		Scanner sc = new Scanner(System.in);
		int energia = 0;
		System.out.println("Gatos disponibles: ");


		
		
		for(Map.Entry<String, Integer> entry : mapa.entrySet()) {
			String clave = entry.getKey();
			int precio = entry.getValue();
			System.out.println(clave +" -> " +precio +" de energia.");
		}
		
		
		
		System.out.println("Que gato quieres desplegar? ");
		String answer = sc.nextLine();
		
		for(Map.Entry<String, Integer> entry : mapa.entrySet()) {
			if(entry.getKey().equals(answer)) {
				energia -= entry.getValue();
				System.out.println(energia);
			}
		}
		
		return energia;
	}
	
	public static void VerVida(HashMap<String, Integer> mapa) {
		mapa.put("Gato basico", 20);
		mapa.put("Gato tanque", 130);
		mapa.put("Gato pez", 200);
		mapa.put("Gato titan", 1250);
	}
	
	public static void VerDanio(HashMap<String, Integer> mapa) {
		mapa.put("Gato basico", 15);
		mapa.put("Gato tanque", 5);
		mapa.put("Gato pez", 40);
		mapa.put("Gato titan", 150);
	}
	
	public static void VerPrecio(HashMap<String, Integer> mapa) {
		
		mapa.put("Gato basico", 50);
		mapa.put("Gato tanque", 100);
		mapa.put("Gato pez", 170);
		mapa.put("Gato titan", 250);

	}
	
	public static int welcome() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido/a a the battle cats!");
		System.out.println("------------------------->");
		
		System.out.println("Menu:");
		System.out.println("1. Jugar ");
		System.out.println("2. Ver/Mejorar gatos ");
		System.out.println("3. Salir ");	
		
		System.out.print("Opcion: ");
		int opcion = sc.nextInt();
		
		return opcion;
	}

}