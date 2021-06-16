
package Modelo;

public class Usuario {
    int tipous;
    String nombre;
    String Apellido;
    String edad;
    String Usu;
    String pwsd;

    public Usuario(String Usu, String pwsd) {
        this.Usu = Usu;
        this.pwsd = pwsd;
    }

    public int getTipous() {
        return tipous;
    }

    public void setTipous(int tipous) {
        this.tipous = tipous;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getUsu() {
        return Usu;
    }

    public void setUsu(String Usu) {
        this.Usu = Usu;
    }

    public String getPwsd() {
        return pwsd;
    }

    public void setPwsd(String pwsd) {
        this.pwsd = pwsd;
    }
    

    
    
}
