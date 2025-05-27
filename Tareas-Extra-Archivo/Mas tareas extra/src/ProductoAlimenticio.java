
public class ProductoAlimenticio {

	private double preuBase;
	private double pes;
	private String valor;
	
	public ProductoAlimenticio() {
		this.preuBase = 2;
		this.pes = 0.5;
		this.valor = "Nacional";
	}
	public ProductoAlimenticio(double preuBase, double pes, String valor) {
		this.preuBase = preuBase;
		this.pes = pes;
		this.valor = valor;
	}
	
	public double getPreuBase() {
		return preuBase;
	}
	public void setPreuBase(double preuBase) {
		this.preuBase = preuBase;
	}
	public double getPes() {
		return pes;
	}
	public void setPes(double pes) {
		this.pes = pes;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public double precioFinal() {
		double precioFinal = 0 +this.preuBase;
		
		if(this.valor.equals("Importado")) {
			precioFinal += 5;
		}
		else if(this.valor.equals("Nacional")) {
			precioFinal += 3;
		}
		if(this.pes >= 1) {
			precioFinal += 2;
		}
		return precioFinal;
		
	}
	public static void main(String[] args) {
		ProductoAlimenticio test = new ProductoAlimenticio();
		ProductoAlimenticio array[] = new ProductoAlimenticio[3];
		array[0] = new ProductoAlimenticio(50, 5, "Importado");
		array[1] = new ProductoEnvasado(230, 12, "Nacional", true);
		array[2] = new ProductoFresco(10, 25, "Importado", 6);
		
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i].precioFinal());
		}
	}
}
class ProductoFresco extends ProductoAlimenticio{
	
	private int caducidad;
	
	public ProductoFresco() {
		super();
		this.caducidad = 5;
	}
	public ProductoFresco(double preuBase, double pes, String valor, int caducidad) {
		super(preuBase, pes, valor);
		this.caducidad = caducidad;
	}
	public int getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}
	
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if(this.caducidad < 7) {
			precioFinal += 1;
		}
		return precioFinal;
	}
}
class ProductoEnvasado extends ProductoAlimenticio{
	
	private boolean vidre;
	
	public ProductoEnvasado() {
		super();
		this.vidre = false;
	}
	public ProductoEnvasado(double preuBase, double pes, String valor, boolean vidre) {
		super(preuBase, pes, valor);
		this.vidre = vidre;
	}
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if(this.vidre == true) {
			precioFinal += 1.5;
		}
		return precioFinal;
	}
}