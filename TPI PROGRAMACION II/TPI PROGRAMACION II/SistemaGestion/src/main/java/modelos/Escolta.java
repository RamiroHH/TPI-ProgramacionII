package modelos;


public class Escolta extends Jugador {
    private int tiros;
    private int manejoPelota;
    private int defensa;

    public Escolta(int id, String nombreCompleto, int edad, double altura, double peso, String rolDestacado, String posicion, int tiros, int manejoPelota, int defensa) {
        super(id, nombreCompleto, edad, altura, peso, rolDestacado, posicion);
        this.tiros = tiros;
        this.manejoPelota = manejoPelota;
        this.defensa = defensa;
    }

    public Escolta() {
    }

    public int getTiros() {
        return tiros;
    }

    public void setTiros(int tiros) {
        this.tiros = tiros;
    }

    public int getManejoPelota() {
        return manejoPelota;
    }

    public void setManejoPelota(int manejoPelota) {
        this.manejoPelota = manejoPelota;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public String toString() {
        return "Escolta{" + super.toString() + ", tiros=" + tiros + ", manejoPelota=" + manejoPelota + ", defensa=" + defensa + '}';
    }
}
