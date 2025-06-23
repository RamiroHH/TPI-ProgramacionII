/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelos.Jugador;

/**
 *
 * @author lichi
 */
public class Vista {
    private Scanner sc = new Scanner(System.in);
    
    public int menu() {
        int opcion = 0;
        System.out.println("1. Registrar jugador para fichaje");
        System.out.println("2. Registrar temporada");
        System.out.println("3. Listar jugadores disponibles por posicion");
        System.out.println("4. Ver fichajes de una temporada");
        System.out.println("5. Ordenar jugadores por rendimiento");
        System.out.println("6. Informe detallado de un jugador");
        System.out.println("7. Mostrar jugadores destacados");
        System.out.println("8. Calcular valor de plantilla");
        System.out.println("0. SALIR");
        opcion = Integer.parseInt(sc.nextLine());
        return opcion;
    }
    
    public String[] pedirJugador() {
        String[] jugador = new String[11];
        
        System.out.println("ID: ");
        jugador[0] = sc.nextLine(); 
        System.out.println("Nombre completo: ");
        jugador[1] = sc.nextLine();
        System.out.println("Edad: ");
        jugador[2] = sc.nextLine();
        System.out.println("Altura en metros: ");
        jugador[3] = sc.nextLine();
        System.out.println("Peso en kg: ");
        jugador[4] = sc.nextLine();
        System.out.println("Rol destacado... OFENSIVO o DEFENSIVO: ");
        jugador[5] = sc.nextLine();
        System.out.println("Tipo de jugador (Base, Escolta, Alero, Ala Pivot o Pivot): ");
        jugador[6] = sc.nextLine();
        
        if (jugador[6].equalsIgnoreCase("Base")) {
            System.out.println("Visión: ");
            jugador[7] = sc.nextLine(); 
            System.out.println("Pases: ");
            jugador[8] = sc.nextLine(); 
            System.out.println("Manejo de pelota: ");
            jugador[9] = sc.nextLine(); 
            System.out.println("Velocidad: ");
            jugador[10] = sc.nextLine(); 
        } else if (jugador[6].equalsIgnoreCase("Alero")) {
            System.out.println("Versatilidad: ");
            jugador[7] = sc.nextLine(); 
            System.out.println("Ofensivas: ");
            jugador[8] = sc.nextLine(); 
            System.out.println("Defensas: ");
            jugador[9] = sc.nextLine(); 
            System.out.println("Rebote: ");
            jugador[10] = sc.nextLine(); 
        } else if (jugador[6].equalsIgnoreCase("Escolta")) {
            System.out.println("Tiros: ");
            jugador[7] = sc.nextLine(); 
            System.out.println("Manejo de pelota: ");
            jugador[8] = sc.nextLine(); 
            System.out.println("Defensa: ");
            jugador[9] = sc.nextLine(); 
        } else if (jugador[6].equalsIgnoreCase("Ala Pivot")) {
            System.out.println("Tamaño/Fuerza: ");
            jugador[7] = sc.nextLine(); 
            System.out.println("Rebote: ");
            jugador[8] = sc.nextLine(); 
            System.out.println("Bloqueo: ");
            jugador[9] = sc.nextLine(); 
            System.out.println("Defensa: ");
            jugador[10] = sc.nextLine(); 
        } else if (jugador[6].equalsIgnoreCase("Pivot")) {
            System.out.println("Tamaño/Fuerza: ");
            jugador[7] = sc.nextLine(); 
            System.out.println("Rebote: ");
            jugador[8] = sc.nextLine(); 
            System.out.println("Bloqueo: ");
            jugador[9] = sc.nextLine(); 
            System.out.println("Defensa: ");
            jugador[10] = sc.nextLine(); 
        }
    return jugador;
}
    
    public String[] pedirTemporada() {
        String[] temporada = new String[6];
        
        System.out.println("Año: ");
        temporada[0] = sc.nextLine();
        System.out.println("Equipo: ");
        temporada[1] = sc.nextLine();
        System.out.println("Partidos jugados: ");
        temporada[2] = sc.nextLine();
        System.out.println("Puntos por partido: ");
        temporada[3] = sc.nextLine();
        System.out.println("Rebotes por partido: ");
        temporada[4] = sc.nextLine();
        System.out.println("ID del jugador");
        temporada[5] = sc.nextLine();
        return temporada;
    }
    
    public String pedirPos() {
        System.out.println("Posicion: ");
        return sc.nextLine();
    }
    
    public int pedirIdTemp() {
        System.out.println("ID de temporada: ");
        return Integer.parseInt(sc.nextLine());
    }
    
    public int pedirIdJug() {
        System.out.println("ID de jugador: ");
        return Integer.parseInt(sc.nextLine());
    }
    
    public String pedirNombreEquipoTemporada() {
        System.out.println("Ingrese nombre del equipo de la temporada: ");
        return sc.nextLine();
    }
    
    public double pedirPuntosDeseados() {
        System.out.println("Ingrese los puntos necesarios para un buen rendimiento: ");
        return Double.parseDouble(sc.nextLine());
    }
}