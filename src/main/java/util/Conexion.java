package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    
        private static final String URL =
            "jdbc:postgresql://localhost:5432/CronaFix";

    private static final String USER = "postgres";
    private static final String PASSWORD = "casiano123";

    public static Connection conectar() {

        Connection con = null;

        try {

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("Conectado");

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(e.getMessage());
        }

        return con;
    }
    
}