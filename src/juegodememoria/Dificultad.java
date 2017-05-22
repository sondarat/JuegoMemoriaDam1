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
public enum Dificultad {
    Baja(4,100,10),
    Media(8,200,20),
    Alta(16,300,30);
    
    private int numeroParejas;
    private int incrmento;
    private int decremento;

    private Dificultad(int numeroParejas, int incrmento, int decremento) {
        this.numeroParejas = numeroParejas;
        this.incrmento = incrmento;
        this.decremento = decremento;
    }

    public int getNumeroParejas() {
        return numeroParejas;
    }

    public int getIncrmento() {
        return incrmento;
    }

    public int getDecremento() {
        return decremento;
    }
    
}
