
package ModeloDao;

import configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.Votos;

public class VotosDAO {
    private static final String SQL_INSERT = "INSERT INTO votaciones VALUES (?, ?)";

 public int insertarV(Votos voto) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement(SQL_INSERT);
            stmt.setInt(1, voto.getId_votaciones());
            stmt.setInt(2, voto.getNumeroDeVotos());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.cerrar(stmt);
            Conexion.cerrar(con);
        }
        return rows;
    }


}