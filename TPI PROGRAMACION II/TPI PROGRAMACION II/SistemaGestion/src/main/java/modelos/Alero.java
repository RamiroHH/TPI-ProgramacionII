/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author lichi
 */
public class Alero extends Jugador{
    private int versatilidad;
    private int ofensivas;
    private int defensas;
    private int rebote;

    public Alero(int id, String nombreCompleto, int edad, double altura, double peso, String rolDestacado, String posicion, int versatilidad, int ofensivas, int defensas, int rebote) {
        super(id, nombreCompleto, edad, altura, peso, rolDestacado, posicion);
        this.versatilidad = versatilidad;
        this.ofensivas = ofensivas;
        this.defensas = defensas;
        this.rebote = rebote;
    }

    public Alero() {
    }

    public int getVersatilidad() {
        return versatilidad;
    }

    public void setVersatilidad(int versatilidad) {
        this.versatilidad = versatilidad;
    }

    public int getOfensivas() {
        return ofensivas;
    }

    public void setOfensivas(int ofensivas) {
        this.ofensivas = ofensivas;
    }

    public int getDefensas() {
        return defensas;
    }

    public void setDefensas(int defensas) {
        this.defensas = defensas;
    }

    public int getRebote() {
        return rebote;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    @Override
    public String toString() {
        return "Alero{" + super.toString() + ", versatilidad=" + versatilidad + ", ofensivas=" + ofensivas + ", defensas=" + defensas + ", rebote=" + rebote + '}';
    }
}
