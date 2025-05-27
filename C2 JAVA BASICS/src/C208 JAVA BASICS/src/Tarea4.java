
public class Tarea4 {

	private String titulo;
	private int tempNum;
	private boolean entregado;
	private String genero;
	private String creador;

	Tarea4() {
		this.titulo = "";
		this.tempNum = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	Tarea4(String titulo, String creador){
		this.titulo = titulo;
		this.creador = creador;
	}
	Tarea4(String titulo, int tempNum, String genero, String creador){
		this.titulo = titulo;
		this.tempNum = tempNum;
		this.genero = genero;
		this.creador = creador;
	}
}
