
public class Vehiculos {

	protected int peso;
	protected int preuBase;
	protected String combustible;

	public Vehiculos() {
		this.peso = 1000;
		this.preuBase = 10000;
		this.combustible = "Gasolina";
	}

	public Vehiculos(int peso, int preuBase, String combustible) {
		this.peso = peso;
		this.preuBase = preuBase;
		this.combustible = combustible;
	}

	public double precioFinal() {
	    double precioFinal = this.preuBase;

	    switch (this.combustible.toLowerCase()) {
	    case "diésel":
	        precioFinal += 500;
	        break;
	    case "híbrido":
	        precioFinal += 700;
	        break;
	    case "eléctrico":
	        precioFinal += 1000;
	        break;
	    case "gasolina":
	    default:
	        break;
	    }

	    if (this.peso > 2000) {
	        precioFinal += 1000;
	    } else if (this.peso > 1000) {
	        precioFinal += 500;
	    }

	    return precioFinal; 
	}


	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPreuBase() {
		return preuBase;
	}

	public void setPreuBase(int preuBase) {
		this.preuBase = preuBase;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public static void main(String[] args) {
		Vehiculos test = new Vehiculos();
		Coche test2 = new Coche();
		Moto test3 = new Moto();
		
		
		int cochesPrecio = 0;
		int motosPrecio = 0;
		int vehiculosPrecio = 0;
		
		Vehiculos array[] = new Vehiculos[4];
		array[0] = new Vehiculos(2000, 12000, "Lamborghini");
		array[1] = new Moto(2500, 15000, "Deportivo", true);
		array[2] = new Coche(3000, 12000, "BMW", 200);
		array[3] = new Vehiculos(11000, 252000, "Ferrari");

		for(Vehiculos leer : array) {
			System.out.println(leer.precioFinal());
		}
	}

}
class Coche extends Vehiculos{
	
	private int potencia;
	
	public Coche() {
		super();
		this.potencia = 120;
	}
	
	public Coche(int peso, int preuBase, String combustible, int potencia) {
		super(peso, preuBase, combustible);
		this.potencia = potencia;
	}
	
	public double precioFinal() {
	    double precioFinal = super.precioFinal();
	    if (this.potencia > 140) {
	        precioFinal += 500;
	    }
	    return precioFinal; 
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
class Moto extends Vehiculos{
	
	private boolean potSidecar;
	
	public Moto() {
		super();
		this.potSidecar = false;
	}
	
	public Moto(int peso, int preuBase, String combustible, boolean potSidecar) {
		super(peso, preuBase, combustible);
		this.potSidecar = potSidecar;
	}
	
	public double precioFinal() {
	    double precioFinal = super.precioFinal(); 
	    if (this.potSidecar) {
	        precioFinal += 250;
	    }
	    return precioFinal;
	}

	public boolean isPotSidecar() {
		return potSidecar;
	}

	public void setPotSidecar(boolean potSidecar) {
		this.potSidecar = potSidecar;
	}
	
}