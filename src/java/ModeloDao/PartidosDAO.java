package ModeloDao;

import Interfaces.CRUD;
import Modelo.Partidos;
import Modelo.Usuario;
import configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartidosDAO implements CRUD<Partidos> {

    private static final String SQL_SELECT = "SELECT * FROM partido_politico";
    private static final String SQL_SELECT_BY_NC = "SELECT * FROM partido_politico WHERE id_partido_politico = ?";
    private static final String SQL_INSERT = "INSERT INTO partido_politico VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE partido_politico SET id_partido_politico = ? , nombrePartido = ?"
            + "WHERE id_partido_politico = ?";
    private static final String SQL_DELETE = "DELETE FROM partido_politico WHERE id_partido_politico = ?";

    @Override
    public List listar() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Partidos> partidos = new ArrayList<>();

        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            Partidos partido = null;

            while (rs.next()) {
                partido = new Partidos(rs.getInt(1), rs.getString(2));
                partidos.add(partido);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(stmt);
            Conexion.cerrar(con);
        }
        return partidos;
    }

    @Override
    public Partidos encontrar(int nc) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Partidos partido = null;
        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement(SQL_SELECT_BY_NC);
            stmt.setInt(1, nc);
            rs = stmt.executeQuery();

            rs.absolute(1);

            partido = new Partidos(rs.getInt(1), rs.getString(2));
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(stmt);
            Conexion.cerrar(con);
        }
        return partido;
    }

    @Override
    public int insertar(Partidos partido) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement(SQL_INSERT);
            stmt.setInt(1, partido.getIdPartido());
            stmt.setString(2, partido.getNombrePartido());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.cerrar(stmt);
            Conexion.cerrar(con);
        }
        return rows;
    }

    @Override
    public int actualizar(Partidos partido) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, partido.getIdPartido());
            stmt.setString(2, partido.getNombrePartido());
            stmt.setInt(3, partido.getIdPartido());
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.cerrar(stmt);
            Conexion.cerrar(con);
        }
        return rows;
    }

    @Override
    public int eliminar(int nc) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement(SQL_DELETE);
            stmt.setInt(1, nc);
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.cerrar(stmt);
            Conexion.cerrar(con);
        }
        return rows;
    }

    @Override
    public int usuario(Usuario us) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}