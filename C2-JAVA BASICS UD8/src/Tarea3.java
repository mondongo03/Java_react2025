public class Tarea3 {

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    
    private static final String COLOR_DEFECTO = "Blanco";
    private static final char CONSUMO_DEFECTO = 'F';
    private static final double PRECIO_DEFECTO = 100.0;
    private static final double PESO_DEFECTO = 5.0;

   
    public Tarea3() {
        this.precioBase = PRECIO_DEFECTO;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_DEFECTO;
        this.peso = PESO_DEFECTO;
    }


    public Tarea3(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_DEFECTO;
    }

 
    public Tarea3(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
}
