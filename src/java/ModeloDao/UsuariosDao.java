/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Interfaces.CRUD;
import java.util.List;

/**
 *
 * @author luism
 */
public class UsuariosDao implements CRUD{
    
    private static final String usu=null;
    private static final String pswd=null;
    private static final String Consulta_by_usuario="Select usuario from usuarios where usu=usuario & pswd=paswordd ;";
    private static final String Consulta_by_pswd="Select paswordd from usuarios where usuario=usu;";
    
    public Usuario log(String U, String P){
    Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
        con = Conexion.getConexion();
            stmt = con.prepareStatement(Consulta_by_usuario);
            rs = stmt.executeQuery();
            while(rs.next()){
            
            }
            
        }
        catch(Exception e){
        }
        return null;
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
