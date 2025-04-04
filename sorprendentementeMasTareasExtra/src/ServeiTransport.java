import java.util.ArrayList;

abstract class ServeiTransport implements Calculable {

	private int preuBase;
	private double distancia;
	private String tipoVehiculo;

	public ServeiTransport() {
		this.preuBase = 0;
		this.distancia = 0;
		this.tipoVehiculo = "";
	}

	public ServeiTransport(int preuBase, double distancia, String tipoVehiculo) {
		this.preuBase = preuBase;
		this.distancia = distancia;
		this.tipoVehiculo = tipoVehiculo;
	}
	

	@Override
	public double calcularCostFinal() {
		double precioFinal = 0;
		 if(this.tipoVehiculo.equals("Camion")) {
			 precioFinal += 100;
		 }
		 if(this.tipoVehiculo.equals("Coche")) {
			 precioFinal += 50;
		 }
		 if(this.tipoVehiculo.equals("Furgoneta")) {
			 precioFinal += 200;
		 }
		 return precioFinal;
	}
	
	
	public int getPreuBase() {
		return preuBase;
	}

	public void setPreuBase(int preuBase) {
		this.preuBase = preuBase;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public static void main(String[] args) {
		ArrayList<ServeiTransport> serveis = new ArrayList<>();
        serveis.add(new TransportPaquets(60, 100, "Coche", 10));
        serveis.add(new TransportMudances(20, 250, "Camion", true));

        double totalPaquets = 0;
        double totalMudances = 0;
        double totalGlobal = 0;

        for (ServeiTransport servei : serveis) {
            double cost = servei.calcularCostFinal();
            System.out.println("Servicio: " + servei.getClass().getSimpleName() + ", Vehículo: " + servei.getTipoVehiculo() + ", Coste: " + cost);
            totalGlobal += cost;

            if (servei instanceof TransportPaquets) {
                totalPaquets += cost;
            } else if (servei instanceof TransportMudances) {
                totalMudances += cost;
            }
        }

        System.out.println("Total Transport Paquets: " + totalPaquets);
        System.out.println("Total Transport Mudances: " + totalMudances);
        System.out.println("Total Global: " + totalGlobal);
    }

}
class TransportPaquets extends ServeiTransport{
	
	private int numPaquets;
	
	public TransportPaquets(int preuBase, double distancia, String tipoVehiculo, int numPaquets) {
		super(preuBase, distancia, tipoVehiculo);
		this.numPaquets = numPaquets;
	}
	
	
	public double calcularCostFinal() {
		double precioFinal = super.calcularCostFinal();
		
		for(int i = 0; i<this.numPaquets; i+=2) {
			precioFinal += i;
		}
		return precioFinal;
	}
	
}
class TransportMudances extends ServeiTransport{
	
	private boolean teElevador;
	
	public TransportMudances(int preuBase, double distancia, String tipoVehiculo, boolean teElevador) {
		super(preuBase, distancia, tipoVehiculo);
		this.teElevador = teElevador;
	}
	
	
	public double calcularCostFinal() {
		double precioFinal = super.calcularCostFinal();
		
		if(this.teElevador == true) {
			precioFinal+=75;
		}
		return precioFinal;
	}
}
