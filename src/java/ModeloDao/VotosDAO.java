package ModeloDao;

import Interfaces.CRUD;
import Modelo.Partidos;
import Modelo.Resultados;
import Modelo.Usuario;
import configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.Votos;
import java.util.ArrayList;
import java.util.List;

public class VotosDAO implements CRUD<Votos> {

    private static final String SQL_SELECT = "SELECT * FROM votos";
    private static final String SQL_INSERT = "INSERT INTO votos(num_casilla, tipo_casilla, entidad, distrito, seccional, votos, fk_id_partido, alcance_votos) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE votos SET id_votos = ? , num_casilla = ?, tipo_casilla = ?"
            + ", entidad=?, distrito=?, seccional=?=?, votos=?, fk_id_partido=?, alcance_votos=? WHERE id_votos=?";
    private static final String SQL_DELETE = "DELETE FROM votos WHERE id_votos = ?";

    @Override
    public List listar() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Votos> votos = new ArrayList<>();

        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            Votos voto = null;

            while (rs.next()) {
                voto = new Votos(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getString(9));
                votos.add(voto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(stmt);
            Conexion.cerrar(con);
        }
        return votos;
    }

    public List Resulta() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Resultados> resultado = new ArrayList<>();

        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement("SELECT p.nombre_partido, sum(v.votos) FROM Votos v JOIN partidos p on p.id_partido = v.fk_id_partido  GROUP by v.fk_id_partido;");
            rs = stmt.executeQuery();
            Resultados ress = null;

            while (rs.next()) {
                ress = new Resultados(rs.getString(1), rs.getInt(2));
                resultado.add(ress);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.cerrar(rs);
            Conexion.cerrar(stmt);
            Conexion.cerrar(con);
        }
        return resultado;
    }

    @Override
    public int insertar(Votos voto) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement(SQL_INSERT);
            stmt.setInt(1, voto.getNumeroCasilla());
            stmt.setString(2, voto.getTipoCasilla());
            stmt.setString(3, voto.getEntidad());
            stmt.setString(4, voto.getDistrito());
            stmt.setInt(5, voto.getSeccional());
            stmt.setInt(6, voto.getVotos());
            stmt.setInt(7, voto.getIdPartido());
            stmt.setString(8, voto.getAlcance());
            
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
    public Votos encontrar(int nc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Votos voto) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConexion();
            stmt = con.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, voto.getIdVotos());
            stmt.setInt(2, voto.getNumeroCasilla());
            stmt.setString(3, voto.getTipoCasilla());
            stmt.setString(4, voto.getEntidad());
            stmt.setString(5, voto.getDistrito());
            stmt.setInt(6, voto.getSeccional());
            stmt.setInt(7, voto.getVotos());
            stmt.setInt(8, voto.getIdPartido());
            stmt.setInt(9, voto.getIdVotos());
            stmt.setString(10, voto.getAlcance());
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
