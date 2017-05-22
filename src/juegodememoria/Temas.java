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
public enum Temas {
    siths("imagenS1,imagenS2,imagenS3,imagenS4,imagenS5,imagenS6", "imagenST");
    private String ficheros;
    private String reverso;

    private Temas(String ficheros, String reverso) {
        this.ficheros = ficheros;
        this.reverso = reverso;
    }

    public String getFicheros() {
        return ficheros;
    }

    public String getReverso() {
        return reverso;
    }

    /**
     *
     * @param dif la dificultad con la que vamos a trabajar
     * @param tema el tema de las cartas selecionado
     * @return un array list de cartas de un tema que despues seran las utilizadas para las parejas
     */
    public ArrayList<Carta> generarCartas(Dificultad dif, Temas tema) {
        String[] cartasSeparadas = tema.ficheros.split(",");
        int contador = 1;
        int revisador = 0;
        Integer[] posicionesYaUsadas = new Integer[dif.getNumeroParejas() / 2];
        ArrayList<Carta> Devolver = new ArrayList<>();
        while (contador < (dif.getNumeroParejas() / 2)) {
            int posicionArray = (int) (Math.random() * cartasSeparadas.length * 2);
            for (Integer posicion : posicionesYaUsadas) {
                if (posicion.equals(posicionArray)) {
                    revisador = 1;
                } else {
                    revisador = 0;
                    posicionesYaUsadas[contador - 1] = posicionArray;
                }
            }
            if (revisador == 0) {
                String archivoImagen = cartasSeparadas[posicionArray];
                String tapaderaTema = archivoImagen.substring(archivoImagen.length() - 2, archivoImagen.length() - 1);
                Carta unaCarta = new Carta(archivoImagen, "imagen" + tapaderaTema + "T");
                Devolver.add(unaCarta);
                contador++;
            }
        }
        return Devolver;
    }
}
