
public class Tarea2Main {

	public static void main(String[] args) {
		 Videojuego[] videojuegos = new Videojuego[5];
	        Tarea2[] series = new Tarea2[5];

	        videojuegos[0] = new Videojuego("Zelda", "Aventura", 40, "Nintendo");
	        videojuegos[1] = new Videojuego("Mario", "Plataforma", 30, "Nintendo");
	        videojuegos[2] = new Videojuego("Minecraft", "Supervivencia", 200, "Mojang");
	        videojuegos[3] = new Videojuego("The Witcher", "RPG", 100, "CD Projekt Red");
	        videojuegos[4] = new Videojuego("FIFA", "Deportes", 50, "EA Sports");

	        series[0] = new Tarea2("Breaking Bad", "Vince Gilligan", "Drama", 5);
	        series[1] = new Tarea2("Game of Thrones", "David Benioff", "Fantasía", 8);
	        series[2] = new Tarea2("Stranger Things", "The Duffer Brothers", "Suspenso", 4);
	        series[3] = new Tarea2("Friends", "David Crane", "Comedia", 10);
	        series[4] = new Tarea2("The Office", "Greg Daniels", "Comedia", 9);

	        videojuegos[0].entregar();
	        videojuegos[2].entregar();
	        series[1].entregar();
	        series[3].entregar();

	        int videojuegosEntregados = 0;
	        int seriesEntregadas = 0;

	        for (Videojuego v : videojuegos) {
	            if (v.isEntregado()) {
	                videojuegosEntregados++;
	            }
	        }

	        for (Tarea2 s : series) {
	            if (s.isEntregado()) {
	                seriesEntregadas++;
	            }
	        }

	        System.out.println("Videojuegos entregados: " + videojuegosEntregados);
	        System.out.println("Series entregadas: " + seriesEntregadas);

	        for (Videojuego v : videojuegos) {
	            v.devolver();
	        }

	        for (Tarea2 s : series) {
	            s.devolver();
	        }

	        Videojuego videojuegoMaxHoras = videojuegos[0];
	        for (Videojuego v : videojuegos) {
	            if (v.compareTo(videojuegoMaxHoras) > 0) {
	                videojuegoMaxHoras = v;
	            }
	        }

	        Tarea2 serieMaxTemp = series[0];
	        for (Tarea2 s : series) {
	            if (s.compareTo(serieMaxTemp) > 0) {
	                serieMaxTemp = s;
	            }
	        }

	        System.out.println("\nVideojuego con más horas estimadas: " + videojuegoMaxHoras);
	        System.out.println("Serie con más temporadas: " + serieMaxTemp);
	    }
	}

}

}
