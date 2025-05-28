import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.EventQueue;

public class Ejercicio1 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                JFrame ventana = new JFrame("Mi Ventana Swing");

                
                JLabel etiqueta = new JLabel("Hola, soy una etiqueta", JLabel.CENTER);

              
                ventana.add(etiqueta);

                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setSize(400, 200); 
                ventana.setLocationRelativeTo(null); 
                ventana.setResizable(true); 
                ventana.setVisible(true); 
            }
        });
    }
}
