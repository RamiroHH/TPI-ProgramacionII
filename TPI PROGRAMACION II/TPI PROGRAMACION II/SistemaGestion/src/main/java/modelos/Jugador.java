/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Scanner;

/**
 *
 * @author lichi
 */
public class Jugador {
    private int id;
    private String nombreCompleto;
    private int edad;
    private double altura;
    private double peso;
    private String rolDestacado;
    private String posicion;

    public Jugador(int id, String nombreCompleto, int edad, double altura, double peso, String rolDestacado, String posicion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.rolDestacado = rolDestacado;
        this.posicion = posicion;
    }

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRolDestacado() {
        return rolDestacado;
    }

    public void setRolDestacado(String rolDestacado) {
        this.rolDestacado = rolDestacado;
    }
    
    public String getPosicion() {
        return posicion;
    }
    
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombreCompleto=" + nombreCompleto + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", rolDestacado=" + rolDestacado + ", posicion=" + posicion + '}';
    }
}