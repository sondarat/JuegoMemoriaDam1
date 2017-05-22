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
public class Carta extends ArrayList{
    private String archivo;
    private String archivoTapada;

    public Carta(String archivo, String archivoTapada) {
        this.archivo = archivo;
        this.archivoTapada = archivoTapada;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivoTapada() {
        return archivoTapada;
    }

    public void setArchivoTapada(String archivoTapada) {
        this.archivoTapada = archivoTapada;
    }
    
    
}
