public class Isograma {
    public static void main(String[] args) {
        String paraula = "murciélago"; 

        if (esIsograma(paraula)) {
            System.out.println("És isograma");
        } else {
            System.out.println("No és isograma");
        }
    }

    public static boolean esIsograma(String paraula) {
        paraula = paraula.toLowerCase().replaceAll("[^a-z]", "");

        for (int i = 0; i < paraula.length(); i++) {
            for (int j = i + 1; j < paraula.length(); j++) {
                if (paraula.charAt(i) == paraula.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}