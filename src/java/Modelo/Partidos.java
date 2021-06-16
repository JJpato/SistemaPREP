package Modelo;

public class Partidos {
    private int idPartido;
    private String nombrePartido;
    private String alcance;
    
    public Partidos(int idPartido, String nombrePartido, String alcance) {
        this.idPartido = idPartido;
        this.nombrePartido = nombrePartido;
        this.alcance = alcance;
    }
    
    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
    
}
