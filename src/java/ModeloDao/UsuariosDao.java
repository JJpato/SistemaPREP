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
    
    private static  String usu=null;
    private static  String pswd=null;
    //private static final String Consulta="Select *from usuarios where ";
    private Usuario usuario;
    
    public Usuario log(String U, String P){
        Connection con = null;
        PreparedStatement pst=null;
        ResultSet rs = null;
        String usu=null;
        String Consulta="Select * from usuarios where correo = '"+U+"' and password = '"+P+"'";
        String no=null;       
        try{
            con = Conexion.getConexion();
            pst=con.prepareStatement(Consulta);
            rs=pst.executeQuery();
            while(rs.next()){
                usuario = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getInt(10));
            }
        }
        catch(Exception e){
        }
        
        return usuario;
    }
    
    public String DNivel(String Usu){
        String Nivel=null;
    try{
        Connection con = null;
        PreparedStatement pst=null;
        ResultSet rs = null;
            String Consulta1="Select * from usuarios where correo = '"+Usu+"'";
            con = Conexion.getConexion();
            pst=con.prepareStatement(Consulta1);
            rs=pst.executeQuery();
            while(rs.next()){
                Nivel=rs.getString(8);   
            }
        }
        catch(Exception e){
        }
    return Nivel;
    }
    
   public int Dstatus(String Usu){
       int Status=0;
    try{
        Connection con = null;
        PreparedStatement pst=null;
        ResultSet rs = null;
            String Consulta2="Select * from usuarios where correo = '"+Usu+"'";
            con = Conexion.getConexion();
            pst=con.prepareStatement(Consulta2);
            rs=pst.executeQuery();
            while(rs.next()){
                Status=rs.getInt(5);   
            }
        }
        catch(Exception e){
        }
    return Status;
    }
    
       public String Dcorreo(String M){
        Connection con = null;
        PreparedStatement pst=null;
        ResultSet rs = null;
        String PS=null;
        
        String ConsultaPASSWORD="Select PASSWORD from usuarios where correo = '"+M+"'"; 
        
        try{
                con = Conexion.getConexion();
                pst=con.prepareStatement(ConsultaPASSWORD);
                rs=pst.executeQuery();

                while(rs.next()){
                    PS=rs.getString(1);
                }
                
            }
        
        catch(Exception e){
        }
        
        return PS;
    }
   
    
    
    public String crearUsu(String nombre,String Apellido,String correo,String Contra,String edad, String tel,String nivel,String estado,String muni,String calleN, String cp, int ubicacion){
        Connection con = null;
        PreparedStatement pst=null;
        PreparedStatement pst2=null;
        String Insertar="Insert into usuarios (nombre,apellido,correo,estatus,password,edad,nivel,telefono,ubicacion) values('"+nombre+"','"+Apellido+"','"+correo+"',0,'"+Contra+"','"+edad+"','"+nivel+"','"+tel+"',"+ubicacion+")";
        String Insertar2="Insert into direccion values ('"+ubicacion+"','"+estado+"','"+muni+"','"+calleN+"','"+cp+"')";
        try{
        con = Conexion.getConexion();
        pst=con.prepareStatement(Insertar2);
        pst.executeUpdate();
        pst2=con.prepareStatement(Insertar);
        pst2.executeUpdate();
        }
        catch(Exception e){
        }
        finally{
            Conexion.cerrar(pst);
            Conexion.cerrar(con);
        }
        return "Creado";
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
