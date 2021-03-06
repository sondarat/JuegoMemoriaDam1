/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodememoria;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private String temita;
    private String dificultadita;
    private GestoraJugadores gestora;

    public String getTemita() {
        return temita;
    }

    public String getDificultadita() {
        return dificultadita;
    }

    public GestoraJugadores getGestora() {
        return gestora;
    }

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        establecerImagenFondoElIcono();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TEMA1 = new javax.swing.JRadioButton();
        TEMA2 = new javax.swing.JRadioButton();
        TEMA3 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        DIFICULTAD1 = new javax.swing.JRadioButton();
        DIFICULTAD2 = new javax.swing.JRadioButton();
        DIFICULTAD3 = new javax.swing.JRadioButton();
        botonTabla = new javax.swing.JButton();
        botonJugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TEMAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 255, 51))); // NOI18N
        jPanel1.setOpaque(false);

        TEMA1.setForeground(new java.awt.Color(51, 255, 51));
        TEMA1.setText("SITHS");
        TEMA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEMA1ActionPerformed(evt);
            }
        });

        TEMA2.setForeground(new java.awt.Color(51, 255, 51));
        TEMA2.setText("OTRA COSA");
        TEMA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEMA2ActionPerformed(evt);
            }
        });

        TEMA3.setForeground(new java.awt.Color(51, 255, 51));
        TEMA3.setText("algo mas");
        TEMA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEMA3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEMA1)
                    .addComponent(TEMA2)
                    .addComponent(TEMA3))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(TEMA1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TEMA2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TEMA3))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIFICULTAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 255, 102))); // NOI18N
        jPanel2.setOpaque(false);

        DIFICULTAD1.setForeground(new java.awt.Color(51, 255, 51));
        DIFICULTAD1.setText("BAJA");
        DIFICULTAD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIFICULTAD1ActionPerformed(evt);
            }
        });

        DIFICULTAD2.setForeground(new java.awt.Color(51, 255, 51));
        DIFICULTAD2.setText("MEDIA");
        DIFICULTAD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIFICULTAD2ActionPerformed(evt);
            }
        });

        DIFICULTAD3.setForeground(new java.awt.Color(51, 255, 51));
        DIFICULTAD3.setText("ALTA");
        DIFICULTAD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIFICULTAD3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DIFICULTAD2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DIFICULTAD1)
                    .addComponent(DIFICULTAD3)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DIFICULTAD1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DIFICULTAD2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DIFICULTAD3))
        );

        botonTabla.setForeground(new java.awt.Color(255, 0, 0));
        botonTabla.setText("RANKING");
        botonTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTablaActionPerformed(evt);
            }
        });

        botonJugar.setForeground(new java.awt.Color(255, 51, 51));
        botonJugar.setText("JUGAR");
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("MEMORIUM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonJugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonJugar)
                    .addComponent(botonTabla))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TEMA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEMA1ActionPerformed
        TEMA2.setSelected(false);
        TEMA3.setSelected(false);
        temita = TEMA1.getText().toLowerCase();
    }//GEN-LAST:event_TEMA1ActionPerformed

    private void TEMA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEMA2ActionPerformed
        TEMA1.setSelected(false);
        TEMA3.setSelected(false);
        temita = TEMA2.getText().toLowerCase();
    }//GEN-LAST:event_TEMA2ActionPerformed

    private void TEMA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEMA3ActionPerformed
        TEMA1.setSelected(false);
        TEMA2.setSelected(false);
        temita = TEMA3.getText().toLowerCase();
    }//GEN-LAST:event_TEMA3ActionPerformed

    private void DIFICULTAD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIFICULTAD1ActionPerformed
        DIFICULTAD2.setSelected(false);
        DIFICULTAD3.setSelected(false);
        dificultadita = TEMA1.getText().toLowerCase();
    }//GEN-LAST:event_DIFICULTAD1ActionPerformed

    private void DIFICULTAD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIFICULTAD2ActionPerformed
        DIFICULTAD1.setSelected(false);
        DIFICULTAD3.setSelected(false);
        dificultadita = TEMA1.getText().toLowerCase();
    }//GEN-LAST:event_DIFICULTAD2ActionPerformed

    private void DIFICULTAD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIFICULTAD3ActionPerformed
        DIFICULTAD2.setSelected(false);
        DIFICULTAD1.setSelected(false);
        dificultadita = TEMA1.getText().toLowerCase();
    }//GEN-LAST:event_DIFICULTAD3ActionPerformed

    private void botonTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTablaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTablaActionPerformed

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        try {
            Comprobar();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_botonJugarActionPerformed

    private void Comprobar() throws Exception{
        if(temita==null || dificultadita==null){
            throw new Exception("La dificultad o el tema no han sido selecionados");
        }else{
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DIFICULTAD1;
    private javax.swing.JRadioButton DIFICULTAD2;
    private javax.swing.JRadioButton DIFICULTAD3;
    private javax.swing.JRadioButton TEMA1;
    private javax.swing.JRadioButton TEMA2;
    private javax.swing.JRadioButton TEMA3;
    private javax.swing.JButton botonJugar;
    private javax.swing.JButton botonTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
public void establecerImagenFondoElIcono() {
        String imagenFondo = "/imagenesindependientes/fondo.jpg";
        this.setContentPane(new PanelImagen(imagenFondo));

    }

}
