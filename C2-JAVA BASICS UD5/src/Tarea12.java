import javax.swing.JOptionPane;
public class Tarea12 {

	public static void main(String[] args) {
		String pass = "Java";
		boolean pase = false;
		String contra = JOptionPane.showInputDialog("Introduce la contraseña: ");
		int count = 0;
		System.out.println(contra);
		
		while (count < 2) {
			
			if (contra != null && contra.equals(pass)) {
				pase = true;
				break;
			} else {
				System.out.println("Intentalo de nuevo!");
				contra = JOptionPane.showInputDialog("Introduce la contraseña: ");
				count++;
			}
		}
		if (!pase) {
			JOptionPane.showMessageDialog(null, "Has agotado los intentos");
		} else {
			JOptionPane.showMessageDialog(null, "Enhorabuena!");
		}
		
	}

}
