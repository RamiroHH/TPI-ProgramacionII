/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author lichi
 */
public class Base extends Jugador {
    private int vision;
    private int pases;
    private int manejoPelota;
    private int velocidad;

    public Base(int id, String nombreCompleto, int edad, double altura, double peso, String rolDestacado, String posicion, int vision, int pases, int manejoPelota, int velocidad) {
        super(id, nombreCompleto, edad, altura, peso, rolDestacado, posicion);
        this.vision = vision;
        this.pases = pases;
        this.manejoPelota = manejoPelota;
        this.velocidad = velocidad;
    }

    public Base() {
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getManejoPelota() {
        return manejoPelota;
    }

    public void setManejoPelota(int manejoPelota) {
        this.manejoPelota = manejoPelota;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
    public String toString() {
        return "Base{" + super.toString() + ", vision=" + vision + ", pases=" + pases + ", manejoPelota=" + manejoPelota + ", velocidad=" + velocidad + '}';
    }
}
 