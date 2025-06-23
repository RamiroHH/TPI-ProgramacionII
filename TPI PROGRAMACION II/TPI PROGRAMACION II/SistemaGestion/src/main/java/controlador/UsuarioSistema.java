/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelos.AlaPivot;
import modelos.Alero;
import modelos.Base;
import modelos.Escolta;
import modelos.Jugador;
import modelos.Pivot;
import modelos.Temporada;
import vista.Vista;

/**
 *
 * @author lichi
 */
public class UsuarioSistema {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private ArrayList<Temporada> temporadas = new ArrayList<>();
    private ArrayList<Jugador> fichados = new ArrayList<>();
    private Vista vista = new Vista();
    
public void registrarJugador() {
    String[] j = vista.pedirJugador();
    if (j[6].equalsIgnoreCase("Base")) {
        jugadores.add(new Base(
            Integer.parseInt(j[0]),
            j[1],
            Integer.parseInt(j[2]),
            Double.parseDouble(j[3]),
            Double.parseDouble(j[4]),
            j[5],
            j[6],
            Integer.parseInt(j[7]), 
            Integer.parseInt(j[8]), 
            Integer.parseInt(j[9]), 
            Integer.parseInt(j[10]) 
        ));
        System.out.println("Jugador " + j[6] + " registrado con éxito.");
    } else if (j[6].equalsIgnoreCase("Alero")) {
        jugadores.add(new Alero(
            Integer.parseInt(j[0]),
            j[1],
            Integer.parseInt(j[2]),
            Double.parseDouble(j[3]),
            Double.parseDouble(j[4]),
            j[5],
            j[6],
            Integer.parseInt(j[7]),
            Integer.parseInt(j[8]), 
            Integer.parseInt(j[9]),
            Integer.parseInt(j[10]) 
        ));
        System.out.println("Jugador " + j[6] + " registrado con éxito.");
    } else if (j[6].equalsIgnoreCase("Escolta")) {
        jugadores.add(new Escolta(
            Integer.parseInt(j[0]),
            j[1],
            Integer.parseInt(j[2]),
            Double.parseDouble(j[3]),
            Double.parseDouble(j[4]),
            j[5],
            j[6],
            Integer.parseInt(j[7]), 
            Integer.parseInt(j[8]), 
            Integer.parseInt(j[9])  
        ));
        System.out.println("Jugador " + j[6] + " registrado con éxito.");
    } else if (j[6].equalsIgnoreCase("Ala Pivot")) {
        jugadores.add(new AlaPivot(
            Integer.parseInt(j[0]),
            j[1],
            Integer.parseInt(j[2]),
            Double.parseDouble(j[3]),
            Double.parseDouble(j[4]),
            j[5],
            j[6],
            Integer.parseInt(j[7]),
            Integer.parseInt(j[8]), 
            Integer.parseInt(j[9]), 
            Integer.parseInt(j[10]) 
        ));
        System.out.println("Jugador " + j[6] + " registrado con éxito.");
    } else if (j[6].equalsIgnoreCase("Pivot")) {
        jugadores.add(new Pivot(
            Integer.parseInt(j[0]),
            j[1],
            Integer.parseInt(j[2]),
            Double.parseDouble(j[3]),
            Double.parseDouble(j[4]),
            j[5],
            j[6],
            Integer.parseInt(j[7]), 
            Integer.parseInt(j[8]), 
            Integer.parseInt(j[9]), 
            Integer.parseInt(j[10]) 
        ));
        System.out.println("Jugador " + j[6] + " registrado con éxito.");
    } else {
        System.out.println("No se pudo registrar el jugador");
    }
}
    
    public void registrarTemporada() {
        String[] t = vista.pedirTemporada();
        Temporada temporada = new Temporada(Integer.parseInt(t[0]), t[1], Integer.parseInt(t[2]), Double.parseDouble(t[3]), Double.parseDouble(t[4]), Integer.parseInt(t[5]));
        temporadas.add(temporada);
        System.out.println("Temporada registrada con exito");
    }
    
    public void listarJugadoresPos() {
        String pos = vista.pedirPos();
        System.out.println("Jugadores en esta posicion " + pos + ":");
        
        for(Jugador j : jugadores) {
            if(j.getPosicion().equalsIgnoreCase(pos)) {
                System.out.println(j);
            }
        }
    }
    
    public void ficharJugadorTemp() {
        String nombreEquipo = vista.pedirNombreEquipoTemporada();
        
        System.out.println("Fichajes para el equipo: " + nombreEquipo + ":");
        
        for(Temporada t : temporadas) {
            if(t.getEquipo().equalsIgnoreCase(nombreEquipo)) {
                for (Jugador j : jugadores) {
                    if (j.getId() == t.getIdJugador()) {
                        System.out.println(j);
                    }
                }
            }
        }
     }
    
    public void jugadoresRendimiento() {
        double punt = vista.pedirPuntosDeseados();
        
        for (Temporada t: temporadas) {
            if(t.getPuntosXpartido() >= punt) {
                for (Jugador j : jugadores) {
                    if(j.getId() == t.getIdJugador()) {
                        System.out.println("Jugador: " + j.getNombreCompleto() + "| PUNTOS POR PARTIDO: " + t.getPuntosXpartido());
                    }
                }
            }
        }
    }
    
    public void informeJugadorDetall() {
        int id = vista.pedirIdJug();
    
        for (Jugador j : jugadores) {
            if (j.getId() == id) {
                int idJ = j.getId();
                String nc = j.getNombreCompleto();
                int ed = j.getEdad();
                double alt = j.getAltura();
                double peso = j.getPeso();
                String rol = j.getRolDestacado();
                String pos = j.getPosicion();
                System.out.println("ID: " + idJ + "|" + " NOMBRE: " + nc + "|" + " EDAD: " + ed + "|" + " ALTURA: " + alt + "|" + " PESO: " + peso + "|" + " ROL DESTACADO: " + rol + "|" + " POSICION: " + pos);
            }
        }
    }
    
    public void jugadoresDest() {
        double punt = vista.pedirPuntosDeseados();
        
        for (Temporada t : temporadas) {
            if (t.getPuntosXpartido() >= punt) {
                for (Jugador j : jugadores) {
                    if(j.getId() == t.getIdJugador()) {
                        System.out.println("Jugador destacado: " + j.getNombreCompleto() + "|" + " Puntos: " + t.getPuntosXpartido());
                    }
                }
            }
        }
    }
    
    public void calcPlantilla() {
        double total = 0;
        
        for (Jugador j : jugadores) {
            for (Temporada t : temporadas) {
                if (t.getIdJugador() == j.getId()) {
                    double valor = (t.getPuntosXpartido() * 12 + t.getRebotesXpartido() * 4) + (j.getAltura() * 10) + (j.getPeso() * 0.3) - (j.getEdad() * 1.5); //ESTOS MULTIPLICADORES LOS PONEMOS PARA DAR MAS O MENOS PESO A CIERTAS CARACTERISTICAS DEL JUGADOR AL CALCULAR EL VALOR TOTAL.
                    total += valor;
                    
                    System.out.println("Jugador: " + j.getNombreCompleto() + "|" + " Valor: " + valor);
                    break; //TUVIMOS QUE USARLO PARA SALIR AL ENCONTRAR UNA TEMPORADA PARA EL JUGADOR.
                }
            }
        }
        System.out.println("Valor total de la plantilla: " + total);
}
    
    public void ejMenu() {
        int opcion = 0;
        do {
            opcion = vista.menu();
            switch (opcion) {
                case 1 -> {
                    registrarJugador();
                }
                case 2 -> {
                    registrarTemporada();
                }
                case 3 -> {
                    listarJugadoresPos();
                }
                case 4 -> {
                    ficharJugadorTemp();
                }
                case 5 -> {
                    jugadoresRendimiento();
                }
                case 6 -> {
                    informeJugadorDetall();
                }
                case 7 -> {
                    jugadoresDest();
                }
                case 8 -> {
                    calcPlantilla();
                }
            }
        }while (opcion != 0);
    }
}
