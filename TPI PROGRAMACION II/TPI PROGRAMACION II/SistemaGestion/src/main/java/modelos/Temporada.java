/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author lichi
 */
public class Temporada {
    private int año;
    private String equipo;
    private int partidosJugados;
    private double puntosXpartido;
    private double rebotesXpartido;
    private int idJugador;

    public Temporada(int año, String equipo, int partidosJugados, double puntosXpartido, double rebotesXpartido, int idJugador) {
        this.año = año;
        this.equipo = equipo;
        this.partidosJugados = partidosJugados;
        this.puntosXpartido = puntosXpartido;
        this.rebotesXpartido = rebotesXpartido;
        this.idJugador = idJugador;
    }

    public Temporada(int año, String equipo, int partidosJugados, double puntosXpartido, double rebotesXpartido) {
        this.año = año;
        this.equipo = equipo;
        this.partidosJugados = partidosJugados;
        this.puntosXpartido = puntosXpartido;
        this.rebotesXpartido = rebotesXpartido;
   
    }
    
    public Temporada() {
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public double getPuntosXpartido() {
        return puntosXpartido;
    }

    public void setPuntosXpartido(double puntosXpartido) {
        this.puntosXpartido = puntosXpartido;
    }

    public double getRebotesXpartido() {
        return rebotesXpartido;
    }

    public void setRebotesXpartido(double rebotesXpartido) {
        this.rebotesXpartido = rebotesXpartido;
    }
    
    public int getIdJugador() {
        return idJugador;
    }
    
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    @Override
    public String toString() {
        return "Temporada{" + "ano=" + año + ", equipo=" + equipo + ", partidosJugados=" + partidosJugados + ", puntosXpartido=" + puntosXpartido + ", rebotesXpartido=" + rebotesXpartido + ", idJugador=" + idJugador + '}';
    }    
}
