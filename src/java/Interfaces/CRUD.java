
package Interfaces;

import java.util.List;
import Modelo.Usuario;

public interface CRUD <T>{
    public List listar(); 
    public T encontrar(int nc);
    public int insertar(T a);
    public int actualizar(T a);
    public int eliminar(int nc);
    
    public int usuario(Usuario us);
}
