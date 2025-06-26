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
        System.out.println("Jugador " + j[1] + " registrado con exito.");
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
        System.out.println("Jugador " + j[1] + " registrado con exito.");
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
        System.out.println("Jugador " + j[1] + " registrado con exito.");
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
        System.out.println("Jugador " + j[1] + " registrado con exito.");
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
        System.out.println("Jugador " + j[1] + " registrado con exito.");
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
        
        System.out.println("Fichajes para el equipo " + nombreEquipo + ":");
        
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
    ArrayList<Jugador> filtrados = new ArrayList<>();

    for (Temporada t : temporadas) {
        if (t.getPuntosXpartido() >= punt) {
            for (Jugador j : jugadores) {
                if (j.getId() == t.getIdJugador()) {
                    filtrados.add(j);
                }
            }
        }
    }

    if (filtrados.size() == 0) {
        System.out.println("Sin jugadores que superen ese rendimiento.");
        return;
    }

    filtrados.sort((a, b) -> {
        double pa = 0;
        double pb = 0;

        for (Temporada t : temporadas) {
            if (t.getIdJugador() == a.getId()) {
                pa = t.getPuntosXpartido();
            }
            if (t.getIdJugador() == b.getId()) {
                pb = t.getPuntosXpartido();
            }
        }

        return Double.compare(pb, pa);
    });

    for (Jugador j : filtrados) {
        double puntos = 0;
        for (Temporada t : temporadas) {
            if (t.getIdJugador() == j.getId()) {
                puntos = t.getPuntosXpartido();
            }
        }
        System.out.println("Jugador: " + j.getNombreCompleto() + " | Puntos por partido: " + puntos);
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
    double[] puntos = vista.pedirPuntosDestacados();  
    double puntosOfensivos = puntos[0]; 
    double puntosDefensivos = puntos[1];  
    
    int jugadoresEncontrados = 0;  

    for (Temporada t : temporadas) {
        if (t.getPuntosXpartido() >= puntosOfensivos || t.getRebotesXpartido() >= puntosDefensivos) {
            for (Jugador j : jugadores) {
                if (j.getId() == t.getIdJugador()) {
                    System.out.println("Jugador destacado: " + j.getNombreCompleto() + "| Puntos: " + t.getPuntosXpartido() + "| Rebotes: " + t.getRebotesXpartido());
                    jugadoresEncontrados++; 
                }
            }
        }
    }

    if (jugadoresEncontrados == 0) {
        System.out.println("No se encontraron jugadores destacados...");
    }
}
        public void mostrarMejoresJugadoresPorPosicion() {
    Jugador mejorBase = null;
    Jugador mejorEscolta = null;
    Jugador mejorAlero = null;
    Jugador mejorAlaPivot = null;
    Jugador mejorPivot = null;

    double maxBase = -1, maxEscolta = -1, maxAlero = -1, maxAlaPivot = -1, maxPivot = -1;

    for (Jugador j : jugadores) {
        if (j instanceof Base) {
            Base b = (Base) j;
            double promedio = (b.getVision() + b.getPases() + b.getManejoPelota() + b.getVelocidad()) / 4.0;
            if (promedio > maxBase) {
                maxBase = promedio;
                mejorBase = b;
            }
        } else if (j instanceof Escolta) {
            Escolta e = (Escolta) j;
            double promedio = (e.getTiros() + e.getManejoPelota() + e.getDefensa()) / 3.0;
            if (promedio > maxEscolta) {
                maxEscolta = promedio;
                mejorEscolta = e;
            }
        } else if (j instanceof Alero) {
            Alero a = (Alero) j;
            double promedio = (a.getVersatilidad() + a.getOfensivas() + a.getDefensas() + a.getRebote()) / 4.0;
            if (promedio > maxAlero) {
                maxAlero = promedio;
                mejorAlero = a;
            }
        } else if (j instanceof AlaPivot) {
            AlaPivot ap = (AlaPivot) j;
            double promedio = (ap.getTamañoFuerza() + ap.getRebote() + ap.getBloqueo() + ap.getDefensa()) / 4.0;
            if (promedio > maxAlaPivot) {
                maxAlaPivot = promedio;
                mejorAlaPivot = ap;
            }
        } else if (j instanceof Pivot) {
            Pivot p = (Pivot) j;
            double promedio = (p.getTamañoFuerza() + p.getRebote() + p.getBloqueo() + p.getDefensa()) / 4.0;
            if (promedio > maxPivot) {
                maxPivot = promedio;
                mejorPivot = p;
            }
        }
    }

    System.out.println("   Mejor jugador por posicion    ");
    if (mejorBase != null) System.out.println("Base: " + mejorBase);
    if (mejorEscolta != null) System.out.println("Escolta: " + mejorEscolta);
    if (mejorAlero != null) System.out.println("Alero: " + mejorAlero);
    if (mejorAlaPivot != null) System.out.println("Ala-Pivot: " + mejorAlaPivot);
    if (mejorPivot != null) System.out.println("Pivot: " + mejorPivot);
}
    
    public void calcPlantilla() {
    double total = 0;

    for (Jugador j : jugadores) {
        for (Temporada t : temporadas) {
            if (t.getIdJugador() == j.getId()) {
                double rendimiento = (t.getPuntosXpartido() * 100000) + (t.getRebotesXpartido() * 30000);
                double fisico = (j.getAltura() * 100000) + (j.getPeso() * 5000);
                double edadFactor = (35 - j.getEdad()) * 50000;

                double valor = rendimiento + fisico + edadFactor;
                total += valor;

                System.out.printf("Jugador: %s | Valor estimado: $%,.2f USD%n", j.getNombreCompleto(), valor);
                break;
            }
        }
    }

    System.out.printf("Valor total de la plantilla: $%,.2f USD%n", total);
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
                    mostrarMejoresJugadoresPorPosicion();
                    break;
                }
                case 8 -> {
                    calcPlantilla();
                }
            }
        }while (opcion != 0);
    }
}
