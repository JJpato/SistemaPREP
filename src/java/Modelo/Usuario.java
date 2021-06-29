
package Modelo;

public class Usuario {
    int id;
    String nombre;
    String Apellido;
    String Usu;
    int estatus;
    String pwsd;
    String edad;
    String tipous;
    String telefono;
    int ubicacion;

    public Usuario(String Usu, String pwsd) {
        this.Usu = Usu;
        this.pwsd = pwsd;
    }

    public Usuario(int id, String nombre, String Apellido, String Usu, int estatus, String pwsd, String edad, String tipous, String telefono, int ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Usu = Usu;
        this.estatus = estatus;
        this.pwsd = pwsd;
        this.edad = edad;
        this.tipous = tipous;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsu() {
        return Usu;
    }

    public void setUsu(String Usu) {
        this.Usu = Usu;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getPwsd() {
        return pwsd;
    }

    public void setPwsd(String pwsd) {
        this.pwsd = pwsd;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipous() {
        return tipous;
    }

    public void setTipous(String tipous) {
        this.tipous = tipous;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    

    
    
    
}
