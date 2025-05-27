public class Obra {
    protected String titol;
    protected String autor;
    protected int anyCreacio;
    protected String tipus;
    protected double preuBase;

    public Obra(String titol, String autor, int anyCreacio, String tipus, double preuBase) {
        this.titol = titol;
        this.autor = autor;
        this.anyCreacio = anyCreacio;
        this.tipus = tipus;
        this.preuBase = preuBase;
    }

    public double valorFinal() {
        double preuFinal = preuBase;
        if (tipus.equals("escultura")) {
            preuFinal += 200;
        }
        if (anyCreacio < 1900) {
            preuFinal += 1000;
        }
        if (anyCreacio > 2010) {
            preuFinal -= 100;
        }
        return preuFinal;
    }

    public String toString() {
        return titol + " de " + autor + " (" + anyCreacio + ") - Preu final: " + valorFinal() + "€";
    }
    
    public static void main(String[] args) {
        Obra[] obres = new Obra[3];
        obres[0] = new Pintura("Mona Lisa", "Leonardo", 1500, 200, "oli");
        obres[1] = new Escultura("David", "Miguel", 1544, 1000, "marbre");
        obres[2] = new Pintura("Paisatge", "Artista", 2015, 700, "aquarel·la");
       
        double total = 0;
        for (Obra obra : obres) {
            System.out.println(obra);
            total += obra.valorFinal();
        }
        System.out.println("Total acumulat: " + total + "€");
    }
}

class Pintura extends Obra {
    private String tecnica;

    public Pintura(String titol, String autor, int anyCreacio, double preuBase, String tecnica) {
        super(titol, autor, anyCreacio, "pintura", preuBase);
        this.tecnica = tecnica;
    }

    public double valorFinal() {
        double preuFinal = super.valorFinal();
        if (tecnica.equals("oli")) {
            preuFinal += 150;
        }
        return preuFinal;
    }
}

class Escultura extends Obra {
    private String material;

    public Escultura(String titol, String autor, int anyCreacio, double preuBase, String material) {
        super(titol, autor, anyCreacio, "escultura", preuBase);
        this.material = material;
    }

    public double valorFinal() {
        double preuFinal = super.valorFinal();
        if (material.equals("bronze")) {
            preuFinal += 300;
        }
        return preuFinal;
    }
}

