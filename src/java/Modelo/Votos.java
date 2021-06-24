
package Modelo;


public class Votos {
    private int numeroDeVotos;
    private int id_votaciones;

    public int getId_votaciones() {
        return id_votaciones;
    }

    public void setId_votaciones(int id_votaciones) {
        this.id_votaciones = id_votaciones;
    }
    public int getNumeroDeVotos() {
        return numeroDeVotos;
    }

    public void setNumeroDeVotos(int numeroDeVotos) {
        this.numeroDeVotos = numeroDeVotos;
    }


    public Votos(int id_votaciones,int numeroDeVotos ) {
        this.id_votaciones = id_votaciones;
        this.numeroDeVotos = numeroDeVotos;
    }    
}
