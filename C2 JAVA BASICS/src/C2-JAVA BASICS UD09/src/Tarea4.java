public class Tarea4 {

    private double a;
    private double b;
    private double c;


    public Tarea4(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }


    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }


    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {
        if (tieneRaices()) {
            if (tieneRaiz()) {
       
                obtenerRaiz();
            } else {
   
                obtenerRaices();
            }
        } else {

            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }

 
    public void obtenerRaices() {
        double discriminante = getDiscriminante();
        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        System.out.println("Las dos soluciones son: " + raiz1 + " y " + raiz2);
    }

    public void obtenerRaiz() {
        double raiz = -b / (2 * a);
        System.out.println("La única solución es: " + raiz);
    }

    public static void main(String[] args) {
        Tarea4 ecuacion = new Tarea4(1, -3, 2);

        ecuacion.calcular();
    }
}
