/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Interfaces.CRUD;
import Modelo.Usuario;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author luism
 */
public class UsuariosDao implements CRUD{
    
    private static final String usu=null;
    private static final String pswd=null;
    private static final String Consulta="Select *from usuarios";
    public boolean access;
    
    public boolean log(String U, String P){
    Connection con = null;
        PreparedStatement pst=null;
        ResultSet rs = null;
        
        try{
        con = Conexion.getConexion();
            pst=con.prepareStatement(Consulta);
            rs=pst.executeQuery();
            while(rs.next()){
                if(U==rs.getString(5) && P==rs.getString(6)){               
                    access=true;
                    break;
                }
            }
            
        }
        catch(Exception e){
        }
        return access;
    }

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object encontrar(int nc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertar(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(int nc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int usuario(Usuario us) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
