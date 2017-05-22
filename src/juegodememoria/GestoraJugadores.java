/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodememoria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class GestoraJugadores extends TreeMap<String, Jugador> {

    private String FILENAME_JUGADORES = "/archivos/Jugadores.dat";
   

    public Jugador agregarJugador(String nombre) {
        Jugador Manfredo = new Jugador(nombre, 0);
        this.put(nombre, Manfredo);
        return Manfredo;

    }

    public Jugador[] devuelveJugadores() {
        return (Jugador[]) this.values().toArray();
    }

    public boolean cambiarPuntuacion(Jugador j, int nuevaPuntiacion) {
        boolean algo = false;
        for (Jugador unJugador : devuelveJugadores()) {
            if (unJugador.getNombre().compareTo(j.getNombre()) == 1) {
                return algo = false;
            } else {
                unJugador.setPuntuacion(nuevaPuntiacion);
                return algo = true;
            }
        }
        return algo;
    }

    public void guardarJugadores() {
        String nombrecitoAEscribir;
        int puntuacionAEscribir;
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(FILENAME_JUGADORES))) {
            for (Jugador unJugador : devuelveJugadores()) {
                nombrecitoAEscribir = unJugador.getNombre();
                puntuacionAEscribir = unJugador.getPuntuacion();
                escritor.write(nombrecitoAEscribir + "," + puntuacionAEscribir);
                escritor.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(GestoraJugadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Jugador[] leerArchivo() {
        String nombrecitoALeer;
        int puntuacionALeer;
        try (BufferedReader lector = new BufferedReader(new FileReader(FILENAME_JUGADORES))) {
            String lineaLeia = lector.readLine();
            ArrayList<Jugador> jugadoresLeidos = new ArrayList<>();
            while (lineaLeia != null) {
                String[] obtenido = lineaLeia.split(",");
                nombrecitoALeer = obtenido[0];
                puntuacionALeer = Integer.parseInt(obtenido[1]);
                Jugador jugadorLeido = new Jugador(nombrecitoALeer, puntuacionALeer);
                jugadoresLeidos.add(jugadorLeido);
            }
            return jugadoresLeidos.toArray(new Jugador[jugadoresLeidos.size()]);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestoraJugadores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestoraJugadores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
