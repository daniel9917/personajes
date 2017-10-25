/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Personaje;
import Modelo.FabricaPersonaje;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiantes
 */
public class dibujarPre extends JPanel {
    
   
    public dibujarPre() {
        setLocation(50, 75);
        setSize(400, 300);
        setFocusable(true);
        this.setOpaque(false);
        
    }

    public void paint(Graphics gr) {
        
        super.paint(gr);
        BufferedImage cabeza = null;
        BufferedImage cuerpo = null;
        BufferedImage piernas = null;
        int xcabeza = 0;
        int ycabeza = 0;
        int xcuerpo = 0;
        int ycuerpo = 0;
        int xpiernas = 0;
        int ypiernas = 0;
        String sCabeza = null;
        String sCuerpo = null;
        String sPiernas = null;
        JFVInicio j = new JFVInicio();
        this.setOpaque(false);
        Font font = new Font ("Zorque", Font.PLAIN, 14);
        gr.setFont(font);
        gr.setColor(Color.BLACK);
        
        try {
            if (j.getVentana() == "humano") {
                cabeza = ImageIO.read(new File("Imagenes\\cabezaHumano.png"));
                cuerpo = ImageIO.read(new File("Imagenes\\cuerpoHumano.png"));
                piernas = ImageIO.read(new File("Imagenes\\piernasHumano.png"));
                xcabeza = 50;
                ycuerpo = 45;
                xpiernas = 30;
                ypiernas = 95;
                sCabeza = "Casco militar de fibra de carbono";
                sCuerpo = "Armadura de nanofibra de carbono ionizada";
                sPiernas = "Exo-piernas con 20+ caballos de fuerza";
                this.setOpaque(false);
            }
            if (j.getVentana() == "hibrido") {
                cabeza = ImageIO.read(new File("Imagenes\\cabezaHibrido.gif"));
                cuerpo = ImageIO.read(new File("Imagenes\\cuerpoHibrido.gif"));
                piernas = ImageIO.read(new File("Imagenes\\piernasHibrido.gif"));
                xcabeza = 11;
                ycuerpo = 87;
                xcuerpo = 1;
                ypiernas = 135;
                sCabeza = "Casco de Titanio marciano";
                sCuerpo = "Armadura corporal generadora de campo de fuerza electrico";
                sPiernas = "Botas con propulsion energetica";
                this.setOpaque(false);
            }
            if (j.getVentana() == "alien") {
                cabeza = ImageIO.read(new File("Imagenes\\cabezaAlien.gif"));
                cuerpo = ImageIO.read(new File("Imagenes\\cuerpoAlien.gif"));
                piernas = ImageIO.read(new File("Imagenes\\piernasAlien.gif"));
                xcuerpo = -5;
                ycuerpo = 60;
                ypiernas = 115;
                sCabeza = "Cabina blindada con conexion soldado-soldado";
                sCuerpo = "Armadura de titanio ultraligero";
                sPiernas = "Piernas roboticas con 40+ c/ fuerza";
                this.setOpaque(false);
            }
            this.setOpaque(false);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Graphics2D g2 = (Graphics2D) gr;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawImage(cabeza, xcabeza, ycabeza, null);
        g2.drawImage(cuerpo, xcuerpo, ycuerpo, null);
        g2.drawImage(piernas, xpiernas, ypiernas, null);
        g2.drawString(sCabeza, 150, 25);
        g2.drawString(sCuerpo, 150, 75);
        g2.drawString(sPiernas, 150, 140);
        this.setOpaque(false);
    }
    


}
