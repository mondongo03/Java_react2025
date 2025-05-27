
public class Videojuego {

	private String titulo;
	private String plataforma;
	private int any;
	private boolean multijugador;

	public Videojuego() {
		this.titulo = "";
		this.plataforma = "";
		this.any = 0;
		this.multijugador = false;
	}

	public Videojuego(String titulo, String plataforma, int any, boolean multijugador) {
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.any = any;
		this.multijugador = multijugador;
	}

	public boolean esRetro() {
		if (any < 2000) {
			System.out.println("Es retro");
		}
		return true;
	}

	public void mostrar() {
		System.out.println(
				"El titulo es: " + titulo + " la plataforma es " + plataforma + " es multijugador " + multijugador);
	}

	public static void main(String[] args) {
		Videojuego test = new Videojuego("Zelda", "N64", 1900, true);
		test.mostrar();
	}
}
