
public interface Entregable {

	public void entregar();
	
	public void devolver();
	
	public boolean isEntregado();

	void compareTo(Videojuego a, Tarea2 b);

	void compareTo(Tarea2 a, Videojuego b);
}
