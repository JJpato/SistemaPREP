/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Raul
 */
public class Resultados {
    String Partido;
    int Votos;
    String Alcance;

    public String getPartido() {
        return Partido;
    }

    public Resultados(String Partido, int Votos, String Alcance) {
        this.Partido = Partido;
        this.Votos = Votos;
        this.Alcance = Alcance;
    }

    public void setPartido(String Partido) {
        this.Partido = Partido;
    }

    public int getVotos() {
        return Votos;
    }

    public void setVotos(int Votos) {
        this.Votos = Votos;
    }

    public String getAlcance() {
        return Alcance;
    }

    public void setAlcance(String Alcance) {
        this.Alcance = Alcance;
    }
}
