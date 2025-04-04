class Habitacio {
    protected int numero;
    protected int capacitat;
    protected double preuBase;
    protected String categoria; 

    public Habitacio(int numero, int capacitat, double preuBase, String categoria) {
        this.numero = numero;
        this.capacitat = capacitat;
        this.preuBase = preuBase;
        this.categoria = categoria;
    }

    public double preuFinal() {
        double preuFinal = preuBase;
        if (categoria.equalsIgnoreCase("deluxe")) {
            preuFinal += 50;
        }
        if (capacitat > 2) {
            preuFinal += (capacitat - 2) * 20; 
        }
        return preuFinal;
    }
    
    
    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacitat() {
		return capacitat;
	}

	public void setCapacitat(int capacitat) {
		this.capacitat = capacitat;
	}

	public double getPreuBase() {
		return preuBase;
	}

	public void setPreuBase(double preuBase) {
		this.preuBase = preuBase;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static void main(String[] args) {
        Habitacio[] hotel = new Habitacio[4];

        hotel[0] = new Habitacio(101, 2, 80, "estandard");
        hotel[1] = new Habitacio(102, 3, 80, "deluxe");
        hotel[2] = new HabitacioFamiliar(201, 4, 80, "estandard", true);
        hotel[3] = new HabitacioFamiliar(202, 5, 80, "deluxe", false);

        double totalHotel = 0;
        for (Habitacio h : hotel) {
            double preu = h.preuFinal();
            System.out.println("Habitació " + h.numero + " - Preu Final: " + preu + "€");
            totalHotel += preu;
        }

        System.out.println("Total de l'hotel: " + totalHotel + "€");
    }
}

class HabitacioFamiliar extends Habitacio {
    private boolean teLlitera;

    public HabitacioFamiliar(int numero, int capacitat, double preuBase, String categoria, boolean teLlitera) {
        super(numero, capacitat, preuBase, categoria);
        this.teLlitera = teLlitera;
    }

    
    public double preuFinal() {
        double preuFinal = super.preuFinal();
        if (teLlitera) {
            preuFinal += 30;
        }
        return preuFinal;
    }


	public boolean isTeLlitera() {
		return teLlitera;
	}


	public void setTeLlitera(boolean teLlitera) {
		this.teLlitera = teLlitera;
	}
    
}

class HabitacioExecutiva extends Habitacio {
    private boolean inclouEsmorzar;

    public HabitacioExecutiva(int numero, int capacitat, double preuBase, String categoria, boolean inclouEsmorzar) {
        super(numero, capacitat, preuBase, categoria);
        this.inclouEsmorzar = inclouEsmorzar;
    }

    public double preuFinal() {
        double preuFinal = super.preuFinal();
        if (inclouEsmorzar) {
            preuFinal += 15;
        }
        return preuFinal;
    }

	public boolean isInclouEsmorzar() {
		return inclouEsmorzar;
	}

	public void setInclouEsmorzar(boolean inclouEsmorzar) {
		this.inclouEsmorzar = inclouEsmorzar;
	}
    
}

