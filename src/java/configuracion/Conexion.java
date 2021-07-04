package configuracion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    //private static final String JDBC_URL = "jdbc:mysql://localhost:3306/votaciones";
    private static final String JDBC_URL = "jdbc:mysql://nodo4093-conexión. dal.togglebox.site/votaciones";
    private static final String JDBC_USER = "root";
    //private static final String JDBC_PASSWORD = "admin123";
    private static final String JDBC_PASSWORD = "LDEabg75421";
    private static Connection con = null;

    public static Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public static void cerrar(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void cerrar(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void cerrar(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}