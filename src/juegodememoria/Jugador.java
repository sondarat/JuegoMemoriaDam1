/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodememoria;

import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class Jugador extends ArrayList implements Comparable<Jugador> {

    private String nombre;
    private int puntuacion;

    public Jugador(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public int compareTo(Jugador o) {
        int resultado=0;
        if(this.getNombre().equals(o.getNombre())){
            resultado=1;
        }else{
            resultado=0;
        }
       return resultado;
    }
}
