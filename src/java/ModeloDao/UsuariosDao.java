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
    public boolean access;
    
    public String log(String U, String P){
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
                usu=rs.getString(4);
                pswd=rs.getString(6);
                if(usu.equalsIgnoreCase(U)&& pswd.equalsIgnoreCase(P)){
                access=true;
                }
                no=rs.getString(2);
                
            }
        }
        catch(Exception e){
        }
        
        return no;
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
        return "";
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
