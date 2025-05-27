
public class Mascotas {

	private String nombre;
	private int edad;
	private String tipoAnimal;
	private double pes;

	public Mascotas() {
		this.nombre = "sin nombre";
		this.edad = 0;
		this.tipoAnimal = "perro";
		this.pes = 1.0;
	}
	public Mascotas(String nombre, int edad, String tipoAnimal, double pes) {
		this.nombre = nombre;
		this.edad = edad;
		this.tipoAnimal = tipoAnimal;
		this.pes = pes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}

	public String comprobarAnimal(Mascotas si) {
		if (si.getTipoAnimal().equals("Gato")) {
			System.out.println("Tu animal es: " + si.getTipoAnimal());
		} else if (si.getTipoAnimal().equals("Perro")) {
			System.out.println("Tu animal es: " + si.getTipoAnimal());
		} else if (si.getTipoAnimal().equals("Pajaro")) {
			System.out.println("Tu animal es: " + si.getTipoAnimal());
		}
		return si.getTipoAnimal();
	}

	public int precioCura() {
		int precioFinal = 0;
		if (this.tipoAnimal.equals("Perro")) {
			precioFinal +=50;
		} 
		else if (this.tipoAnimal.equals("Pajaro")) {
			precioFinal += 20;
		}
		else if (this.tipoAnimal.equals("Gato")) {
			precioFinal += 40;
		}
		
		if(this.getPes() > 10) {
			precioFinal += 10;
		}
		return precioFinal;
	}
	public static void main(String[] args) {
		Mascotas test = new Mascotas();
		
		Mascotas array[] = new Mascotas[3];
		
		array[0] = new Mascotas("Jose", 5, "Pajaro", 10.0);
		array[1] = new Gato("Jen", 10, "Gato", 4.5, true);
		array[2] = new Perro("Juann", 7, "Perro", 8.5, false);

		for(int i = 0; i<array.length; i++) {
			System.out.println("Precio total " +i +" : " +array[i].precioCura());
		}
		
	}

}
class Gato extends Mascotas{
	
	private boolean tieneChip;
	
	public Gato() {
		super();
		this.tieneChip = false;
	}

	public Gato(String nombre, int edad, String tipoAnimal, double pes, boolean tieneChip) {
		super(nombre, edad, tipoAnimal, pes);
		this.tieneChip = tieneChip;
	}
	
	
	public int precioCura() {
	int precioFinal = super.precioCura();
	
	if(this.tieneChip == true) {
		precioFinal+=15;
	}
	return precioFinal;
	}
	public boolean isTieneChip() {
		return tieneChip;
	}
	public void setTieneChip(boolean tieneChip) {
		this.tieneChip = tieneChip;
	}
	
}
class Perro extends Mascotas{
	
	private boolean tieneGafas;
	
	public Perro() {
		this.tieneGafas = false;
	}
	public Perro(String nombre, int edad, String tipoAnimal, double pes, boolean tieneGafas) {
		super(nombre, edad, tipoAnimal, pes);
		this.tieneGafas = tieneGafas;
	}
	public int precioCura() {
		int precioFinal = super.precioCura();
		
		if(this.tieneGafas == true) {
			precioFinal += 5;
		}
		return precioFinal;
	}
	public boolean isTieneGafas() {
		return tieneGafas;
	}
	public void setTieneGafas(boolean tieneGafas) {
		this.tieneGafas = tieneGafas;
	}
	
}
