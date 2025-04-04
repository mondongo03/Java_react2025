
public class Viatge {

	private String destinacio;
	private int dies;
	private int preuBase;
	private boolean incluyeTransporte;
	
	public Viatge() {
		this.destinacio = "Barcelona";
		this.dies = 3;
		this.preuBase = 200;
		this.incluyeTransporte = true;
	}
	public Viatge(String destinacio, int dies, int preuBase, boolean incluyeTransporte) {
		this.destinacio = destinacio;
		this.dies = dies;
		this.preuBase = preuBase;
		this.incluyeTransporte = incluyeTransporte;
	}
	
	public int precioFinal() {
		int precioFinal = 0;
		
		if(this.dies >= 5) {
			precioFinal+= 50;
		}
		if(this.incluyeTransporte == false) {
			precioFinal-=30;
		}
		return precioFinal;
		
	}
	public static void main(String[] args) {
		Viatge test = new Viatge();
		
		Viatge array[] = new Viatge[3];
		array[0] = new Viatge("Maldivas", 50, 50, true);
		array[1] = new ViajePlaya("Canada", 20, 30, true, true);
		array[2] = new ViajeMontania("Canarias", 522, 590, true, true);
		
		for(int i = 0; i<array.length;i++) {
			System.out.println("Precio total "+(i+1) +" : " +array[i].precioFinal());
		}
	}
}
class ViajePlaya extends Viatge{
	
	private boolean todoIncluido;
	
	public ViajePlaya() {
		super();
		this.todoIncluido = false;
	}
	public ViajePlaya(String destinacio, int dies, int preuBase, boolean incluyeTransporte, boolean incluyeTodo) {
		super(destinacio, dies, preuBase, incluyeTransporte);
		this.todoIncluido = incluyeTodo;
	}
	public int precioFinal() {
		int precioFinal = super.precioFinal();
		
		if(this.todoIncluido == true) {
			precioFinal+= 100;
		}
		return precioFinal;
	}
	
}
class ViajeMontania extends Viatge{
	
	private boolean teGuia;
	
	public ViajeMontania() {
		super();
		this.teGuia = false;
	}
	public ViajeMontania(String destinacio, int dies, int preuBase, boolean incluyeTransporte, boolean teGuia) {
		super(destinacio, dies, preuBase, incluyeTransporte);
		this.teGuia = teGuia;
	}
	public int precioFinal() {
		int precioFinal = super.precioFinal();
		
		if(this.teGuia == true) {
			precioFinal+=40;
		}
		return precioFinal;
	}
}
