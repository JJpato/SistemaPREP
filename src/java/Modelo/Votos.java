package Modelo;

public class Votos {

    private int idVotos;
    private int numeroCasilla;
    private String tipoCasilla;
    private String entidad;
    private String distrito;
    private int seccional;
    private int votos;
    private int idPartido;

    public Votos(int numeroCasilla, String tipoCasilla, String entidad, String distrito, int seccional, int votos, int idPartido) {
        this.numeroCasilla = numeroCasilla;
        this.tipoCasilla = tipoCasilla;
        this.entidad = entidad;
        this.distrito = distrito;
        this.seccional = seccional;
        this.votos = votos;
        this.idPartido = idPartido;
    }

    public Votos(int idVotos, int numeroCasilla, String tipoCasilla, String entidad, String distrito, int seccional, int votos, int idPartido) {
        this.idVotos = idVotos;
        this.numeroCasilla = numeroCasilla;
        this.tipoCasilla = tipoCasilla;
        this.entidad = entidad;
        this.distrito = distrito;
        this.seccional = seccional;
        this.votos = votos;
        this.idPartido = idPartido;
    }

    public int getIdVotos() {
        return idVotos;
    }

    public void setIdVotos(int idVotos) {
        this.idVotos = idVotos;
    }

    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    public String getTipoCasilla() {
        return tipoCasilla;
    }

    public void setTipoCasilla(String tipoCasilla) {
        this.tipoCasilla = tipoCasilla;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getSeccional() {
        return seccional;
    }

    public void setSeccional(int seccional) {
        this.seccional = seccional;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

}
