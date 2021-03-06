/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Personaje;
import Modelo.FabricaAlien;
import Modelo.FabricaHibrido;
import Modelo.FabricaHumano;
import Modelo.FabricaPersonaje;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author gorym
 */
public class JFVInicio extends javax.swing.JFrame implements ActionListener {
    
    int idn = 0;
    int index = 0;
    /**
     * Creates new form JFrame
     */
    public JFVInicio() {

        super("Mars Wars");
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

        jLabel2 = new javax.swing.JLabel();
        jLElige = new javax.swing.JLabel();
        jLFlechaDer = new javax.swing.JLabel();
        jLFlecaIzq = new javax.swing.JLabel();
        jLgif = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Elegir.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 210, 70));

        jLElige.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Elige.png"))); // NOI18N
        getContentPane().add(jLElige, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 340, 200));

        jLFlechaDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FlecaDer.png"))); // NOI18N
        jLFlechaDer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLFlechaDerFocusGained(evt);
            }
        });
        jLFlechaDer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLFlechaDerMouseClicked(evt);
            }
        });
        getContentPane().add(jLFlechaDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 100, 110));

        jLFlecaIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FlecaIzq.png"))); // NOI18N
        jLFlecaIzq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLFlecaIzqFocusGained(evt);
            }
        });
        jLFlecaIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLFlecaIzqMouseClicked(evt);
            }
        });
        getContentPane().add(jLFlecaIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, 110));

        jLgif.setMaximumSize(new java.awt.Dimension(350, 350));
        jLgif.setMinimumSize(new java.awt.Dimension(350, 350));
        getContentPane().add(jLgif, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 280, 350));

        jLabel1.setFont(new java.awt.Font("Zorque", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Titulo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 300, 100));

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fondo.jpg"))); // NOI18N
        jLFondo.setMaximumSize(new java.awt.Dimension(350, 500));
        getContentPane().add(jLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLFlecaIzqFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLFlecaIzqFocusGained
       
    }//GEN-LAST:event_jLFlecaIzqFocusGained

    private void jLFlechaDerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLFlechaDerFocusGained
        
    }//GEN-LAST:event_jLFlechaDerFocusGained

    private void jLFlechaDerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFlechaDerMouseClicked
         switch(idn){
           case 0:
               jLElige.setVisible(false);
               jLgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/marcianitotxt.gif")));
               index = 3;
               idn = 1;
               break;
           case 1:
               jLgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/hibrid200x200.gif")));
               idn = 2;
               index = 2;
               break;
           case 2:
               jLgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/soldier200x200.gif")));
               idn = 3;
               index = 1;
               break;
           case 3:
               jLgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/marcianitotxt.gif")));
               idn = 1;
               index = 3;
               break;
       }
    }//GEN-LAST:event_jLFlechaDerMouseClicked

    private void jLFlecaIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLFlecaIzqMouseClicked
        
        switch(idn){
           case 0:
               jLElige.setVisible(false);
               jLgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/soldier200x200.gif")));
               idn = 1;
               index = 1;
               break;
           case 1:
               jLgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/hibrid200x200.gif")));
               idn = 2; 
               index = 2;
               break;
           case 2:
               jLgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/marcianitotxt.gif")));
               idn = 3;
               index = 3;
               break;
           case 3:
               jLgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/soldier200x200.gif")));
               idn = 1;
               index = 1;
               break;
       }
    }//GEN-LAST:event_jLFlecaIzqMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if( idn == 0){
            
        }
        if (index == 1){
            ventana = "humano";
            AbrirVentanaPj();
            this.setVisible(false);
            
        }
        if (index == 2){
            ventana = "hibrido";
            AbrirVentanaPj();
            this.setVisible(false);
        }
        if (index == 3){
            ventana = "alien";
            AbrirVentanaPj();
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    public void AbrirVentanaPj() {
        preJuego v = new preJuego();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }

    public static String getVentana() {
        return ventana;
    }

    private static String ventana = null;

   

    public void run() {
        new JFVInicio().setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLElige;
    private javax.swing.JLabel jLFlecaIzq;
    private javax.swing.JLabel jLFlechaDer;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLgif;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
