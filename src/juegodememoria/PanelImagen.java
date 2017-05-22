/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodememoria;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author merche
 */
public class PanelImagen extends JPanel{
    private Image imagen;

    public PanelImagen(String nombreImagen) {
       URL recurso=this.getClass().getResource(nombreImagen);
       if (recurso!=null){
           imagen=new ImageIcon(recurso).getImage();
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (imagen!=null){            
            g.drawImage(imagen, 0, 0, getWidth(),getHeight(), this);
            setOpaque(false);
        }
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
