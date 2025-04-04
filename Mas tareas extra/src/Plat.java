import java.util.ArrayList;

class Plat {
    protected String nom;
    protected double preuBase;
    protected String categoria; 

    public Plat() {
        this.nom = "Plat genèric";
        this.preuBase = 8.0;
        this.categoria = "principal";
    }

    public Plat(String nom, double preuBase, String categoria) {
        this.nom = nom;
        this.preuBase = preuBase;
        this.categoria = categoria;
    }

    public double preuFinal() {
        double preu = preuBase;
        if (categoria.equals("entrant")) {
            preu -= 1.0;
        } else if (categoria.equals("postres")) {
            preu -= 0.5;
        }
        return preu;
    }

    public String getNom() {
        return nom;
    }
    public static void main(String[] args) {
        ArrayList<Plat> plats = new ArrayList<>();

        plats.add(new PlatVegan("Amanida", 7.5, "entrant", false));
        plats.add(new PlatVegan("Tofu", 9.0, "principal", true));
        plats.add(new PlatCarn("Carne con ketchup", 15.0, "principal", "vedella"));
        plats.add(new PlatCarn("Costillas", 12.0, "principal", "porc"));
        plats.add(new Plat("Pastel de queso", 6.0, "postres"));

        double totalVegan = 0, totalCarn = 0, totalGeneral = 0;

        for (Plat plat : plats) {
            double preu = plat.preuFinal();
            System.out.println(plat.getNom() + " - Preu final: " + preu + "€");
            if (plat instanceof PlatVegan) {
                totalVegan += preu;
            } else if (plat instanceof PlatCarn) {
                totalCarn += preu;
            }
            totalGeneral += preu;
        }

        System.out.println("Total plats vegans: " + totalVegan + "€");
        System.out.println("Total plats de carn: " + totalCarn + "€");
        System.out.println("Total general: " + totalGeneral + "€");
    }
}

class PlatVegan extends Plat {
    private boolean portaTofu;

    public PlatVegan(String nom, double preuBase, String categoria, boolean portaTofu) {
        super(nom, preuBase, categoria);
        this.portaTofu = portaTofu;
    }

    public double preuFinal() {
        double preu = super.preuFinal();
        if (portaTofu) {
            preu += 1.0;
        }
        return preu;
    }
}

class PlatCarn extends Plat {
    private String tipusCarn; 

    public PlatCarn(String nom, double preuBase, String categoria, String tipusCarn) {
        super(nom, preuBase, categoria);
        this.tipusCarn = tipusCarn;
    }

    public double preuFinal() {
        double preu = super.preuFinal();
        if (tipusCarn.equals("vedella")) {
            preu += 2.0;
        } else if (tipusCarn.equals("porc")) {
            preu += 1.0;
        }
        return preu;
    }
}

   

