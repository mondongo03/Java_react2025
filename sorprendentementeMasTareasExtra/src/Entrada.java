import java.util.ArrayList;

abstract class Entrada implements Imprimible {
    protected String titolEspectacle;
    protected String data;
    protected double preuBase;
    protected String tipusEntrada; 

    public Entrada(String titolEspectacle, String data, double preuBase, String tipusEntrada) {
        this.titolEspectacle = titolEspectacle;
        this.data = data;
        this.preuBase = preuBase;
        this.tipusEntrada = tipusEntrada;
    }

    @Override
    public String imprimirEntrada() {
        System.out.println("Espectacle: " + titolEspectacle + ", Data: " + data + ", Tipus: " + tipusEntrada);
        return data;
    }

    @Override
    public double preuFinal() {
        return tipusEntrada.equals("VIP") ? preuBase + 50 : preuBase;
    }
    
    public static void main(String[] args) {
        ArrayList<Imprimible> entrades = new ArrayList<>();
        entrades.add(new EntradaConcert("Concert ", "10/05/2025", 50, "normal", "pista"));
        entrades.add(new EntradaConcert("Jazz", "15/06/2025", 40, "VIP", "graderia"));
        entrades.add(new EntradaTeatre("Otra Opera", "20/07/2025", 60, "normal", 2));
        entrades.add(new EntradaTeatre("Opera", "25/08/2025", 55, "VIP", 5));

        double totalConcerts = 0;
        double totalTeatre = 0;
        double totalGlobal = 0;

        for (Imprimible entrada : entrades) {
            entrada.imprimirEntrada();
            double cost = entrada.preuFinal();
            System.out.println("Preu Final: " + cost + "€\n");
            totalGlobal += cost;

            if (entrada instanceof EntradaConcert) {
                totalConcerts += cost;
            } else if (entrada instanceof EntradaTeatre) {
                totalTeatre += cost;
            }
        }

        System.out.println("Total Entrades Concert: " + totalConcerts + "€");
        System.out.println("Total Entrades Teatre: " + totalTeatre + "€");
        System.out.println("Total Global: " + totalGlobal + "€");
    }


}

class EntradaConcert extends Entrada {
    private String zona; 

    public EntradaConcert(String titolEspectacle, String data, double preuBase, String tipusEntrada, String zona) {
        super(titolEspectacle, data, preuBase, tipusEntrada);
        this.zona = zona;
    }

    @Override
    public double preuFinal() {
        double preu = super.preuFinal();
        if (zona.equals("pista")) {
            preu += 10;
        }
        return preu;
    }
}

class EntradaTeatre extends Entrada {
    private int fila;

    public EntradaTeatre(String titolEspectacle, String data, double preuBase, String tipusEntrada, int fila) {
        super(titolEspectacle, data, preuBase, tipusEntrada);
        this.fila = fila;
    }

    @Override
    public double preuFinal() {
        double preu = super.preuFinal();
        if (fila <= 3) {
            preu += 20;
        }
        return preu;
    }
}

   