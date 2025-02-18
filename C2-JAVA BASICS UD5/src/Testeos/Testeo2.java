package Testeos;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class Testeo2 {

	public static void main(String[] args) {
	int precioProducto = 300;
	final double IVA = 0.18;
	
	JOptionPane.showMessageDialog(null, "El precio del producto incluyendo el IVA es " + (precioProducto + (precioProducto * IVA)));

	}

}
