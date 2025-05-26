import java.sql.*;

public class Ejercicio2 {
    static final String URL = "jdbc:mysql://localhost:3306/meteo";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection conexion = null;
        Statement statement = null;

        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");

            statement = conexion.createStatement();

            statement.executeUpdate("INSERT INTO articulos (lat, longitud, alt) VALUES ('41.5','1.15', 69)");
            statement.executeUpdate("INSERT INTO articulos(lat, longitud, alt) VALUES ('41.4','2.17', 12)");  // Barcelona
            statement.executeUpdate("INSERT INTO articulos (lat, longitud, alt) VALUES ('40.4','-3.7', 667)"); // Madrid
            statement.executeUpdate("INSERT INTO estacion (lat, longitud, alt) VALUES ('39.5','-0.37', 15)"); // Valencia
            statement.executeUpdate("INSERT INTO estacion (lat, longitud, alt) VALUES ('43.26','-2.93', 19)"); // Bilbao
            statement.executeUpdate("INSERT INTO estacion (lat, longitud, alt) VALUES ('36.7','-4.45', 8)");  // Málaga
            statement.executeUpdate("INSERT INTO estacion (lat, longitud, alt) VALUES ('42.8','-1.64', 450)"); // Pamplona
            statement.executeUpdate("INSERT INTO estacion (lat, longitud, alt) VALUES ('38.3','-0.48', 85)");  // Alicante
            statement.executeUpdate("INSERT INTO estacion (lat, longitud, alt) VALUES ('37.9','-1.12', 53)");  // Murcia
            statement.executeUpdate("INSERT INTO estacion (lat, longitud, alt) VALUES ('41.6','-0.88', 199)"); // Zaragoza
            statement.executeUpdate("INSERT INTO estacion (lat, longitud, alt) VALUES ('43.4','-8.4', 0)");     // A Coruña


            statement.executeUpdate("UPDATE estacion SET lat = '41.3' WHERE id = 1");

            statement.executeUpdate("DELETE FROM estacion WHERE id = 2");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM estacion");
            System.out.println("Registros en la tabla 'estacion':");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") 
                			+ ", Altitud: " + resultSet.getString("lat")
                			+ ", Longitud: " + resultSet.getString("longitud")
                			+ ", Altura: " + resultSet.getInt("alt"));
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) conexion.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}