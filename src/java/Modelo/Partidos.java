package Modelo;

public class Partidos {
    private int idPartido;
    private String nombrePartido;

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

    public Partidos(int idPartido, String nombrePartido) {
        this.idPartido = idPartido;
        this.nombrePartido = nombrePartido;
    }
}
