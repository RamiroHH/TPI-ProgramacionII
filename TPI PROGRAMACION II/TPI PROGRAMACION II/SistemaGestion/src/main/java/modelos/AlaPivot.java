/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author lichi
 */
public class AlaPivot extends Jugador {
    private int tamañoFuerza;
    private int rebote;
    private int bloqueo;
    private int defensa;

    public AlaPivot(int id, String nombreCompleto, int edad, double altura, double peso, String rolDestacado, String posicion, int tamañoFuerza, int rebote, int bloqueo, int defensa) {
        super(id, nombreCompleto, edad, altura, peso, rolDestacado, posicion);
        this.tamañoFuerza = tamañoFuerza;
        this.rebote = rebote;
        this.bloqueo = bloqueo;
        this.defensa = defensa;
    }

    public AlaPivot() {
    }

    public int getTamañoFuerza() {
        return tamañoFuerza;
    }

    public void setTamañoFuerza(int tamañoFuerza) {
        this.tamañoFuerza = tamañoFuerza;
    }

    public int getRebote() {
        return rebote;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    public int getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(int bloqueo) {
        this.bloqueo = bloqueo;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public String toString() {
        return "AlaPivot{" + super.toString() + ", tamanoFuerza=" + tamañoFuerza + ", rebote=" + rebote + ", bloqueo=" + bloqueo + ", defensa=" + defensa + '}';
    }
}
