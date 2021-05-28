
package configuracion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AccesoUsuarios extends Conexion{
    
    private int IDusu;
    private int PSwDusu;
    private ResultSet rs;
    
    public AccesoUsuarios (){
        getConexion();
    }
    
    public ResultSet Busqueda()throws Exception{
        return null;
    }
    
}
