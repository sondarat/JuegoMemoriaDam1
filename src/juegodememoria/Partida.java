/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodememoria;

/**
 *
 * @author jesus
 */
public class Partida {

    private Dificultad dificultad;
    private Jugador elJugador;
    private Temas tema;
    private int aciertos;
    private int fallos;
    private int puntosAcierto;
    private int puntosFallo;
    private int puntuacion=puntosAcierto-puntosFallo;

    public Dificultad getDificultad() {
        return dificultad;
    }

    public Jugador getElJugador() {
        return elJugador;
    }

    public Temas getTema() {
        return tema;
    }
    public void apuntarAcierto(){
        aciertos=aciertos+1;
        puntosAcierto=aciertos*dificultad.getIncrmento();
    }
     public void apuntarFallo(){
        fallos=fallos+1;
        puntosFallo=fallos*dificultad.getIncrmento();
        
    }
}
