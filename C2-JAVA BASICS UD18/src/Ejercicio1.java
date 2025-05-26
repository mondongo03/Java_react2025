import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Ejercicio1 {

	public static void main(String[] args) {
		try {
			System.out.println("Aqui si?");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Aqui si?2");
			Connection conexion=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306","root","");
			System.out.print("Conectado a servidor correctamente");
			
		} catch (SQLException | ClassNotFoundException  e) {
            System.out.println("No se ha podido conectar con mi base de datos");
            System.out.println(e.getMessage());
		}
		
		
		
	}

}
