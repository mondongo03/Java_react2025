import java.util.ArrayList;

class Curs {
    protected String nom;
    protected int hores;
    protected String nivell;
    protected double preuBase;

    public Curs(String nom, int hores, String nivell, double preuBase) {
        this.nom = nom;
        this.hores = hores;
        this.nivell = nivell;
        this.preuBase = preuBase;
    }

    public Curs() {
        this("Sense nom", 20, "bàsic", 100);
    }

    public double preuFinal() {
        double preuFinal = preuBase;
        if (nivell.equalsIgnoreCase("intermig")) {
            preuFinal += 50;
        } else if (nivell.equalsIgnoreCase("avançat")) {
            preuFinal += 100;
        }
        return preuFinal;
    }

    
    public String toString() {
        return nom + " - " + hores + "h - " + nivell + " - " + preuFinal() + "€";
    }
    public static void main(String[] args) {
        ArrayList<Curs> cursos = new ArrayList<>();
        
        cursos.add(new Curs("Curs Base", 20, "bàsic", 100));
        cursos.add(new CursOnline("Java Online", 40, "intermig", 200, true));
        cursos.add(new CursOnline("Python Online", 30, "avançat", 250, false));
        cursos.add(new CursPresencial("Web Development", 50, "intermig", 300, true));
        cursos.add(new CursPresencial("Data Science", 60, "avançat", 400, false));

        double totalGeneral = 0;
        double totalOnline = 0;
        double totalPresencial = 0;

        System.out.println("\nLlista de cursos i preus finals:");
        for (Curs c : cursos) {
            System.out.println(c);
            totalGeneral += c.preuFinal();
            if (c instanceof CursOnline) {
                totalOnline += c.preuFinal();
            } else if (c instanceof CursPresencial) {
                totalPresencial += c.preuFinal();
            }
        }
        
        System.out.println("\nTotal general: " + totalGeneral + "€");
        System.out.println("Total cursos online: " + totalOnline + "€");
        System.out.println("Total cursos presencials: " + totalPresencial + "€");
    }
}

class CursOnline extends Curs {
    private boolean teTutories;

    public CursOnline(String nom, int hores, String nivell, double preuBase, boolean teTutories) {
        super(nom, hores, nivell, preuBase);
        this.teTutories = teTutories;
    }

    
    public double preuFinal() {
        double preu = super.preuFinal();
        if (teTutories) {
            preu += 30;
        }
        return preu;
    }
}

class CursPresencial extends Curs {
    private boolean inclouMaterial;

    public CursPresencial(String nom, int hores, String nivell, double preuBase, boolean inclouMaterial) {
        super(nom, hores, nivell, preuBase);
        this.inclouMaterial = inclouMaterial;
    }

    
    public double preuFinal() {
        double preu = super.preuFinal();
        if (inclouMaterial) {
            preu += 20;
        }
        return preu;
    }
}