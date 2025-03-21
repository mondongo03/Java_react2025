
public class Coche {

	private String marca;
	private String modelo;
	private int any;
	private double velocidad;
	
	public Coche() {
		this.any = 2025;
		this.marca = "";
		this.modelo = "";
		this.velocidad = 0;
	}
	public void acelerar(double speed) {
		if (speed > 0) {
			velocidad+=speed;
		}	
	}
	public void frenar(double speed) {
		if(speed > 0) {
			velocidad-=speed;
		}
	}
	public void mostrarinfo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.any = 2025;
		
		System.out.println("La marca es: " +marca +" el modelo es " +modelo +" y la velocidad es " +velocidad);
	}
	public static void main(String[] args) {
		Coche test = new Coche();
		test.acelerar(100);
		test.mostrarinfo("Ferrari", "ultimo");
	}
}
