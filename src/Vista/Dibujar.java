/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Personaje;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author gorym
 */
public class Dibujar extends JPanel implements ActionListener {

    private Timer vel;
    private Image imagen;
    private Pj[] pjs;
    private int clones=0;

    public Dibujar(int clones) {
        System.out.println(clones);
        setSize(803, 503);
        setFocusable(true);
        addKeyListener(new teclado());
        pjs = new Pj[clones];
        for (int i = 0; i < clones; i++) {
            pjs[i] = new Pj();
        }
        vel = new Timer(25, this);
        vel.start();
        this.clones=clones;
    }

    public void paint(Graphics gr) {
        super.paint(gr);
        int xcabeza = 0;
        int ycabeza = 0;
        int xcuerpo = 0;
        int ycuerpo = 0;
        int xpiernas = 0;
        int ypiernas = 0;
        BufferedImage cabeza = null;
        BufferedImage cuerpo = null;
        BufferedImage piernas = null;
        BufferedImage img = null;
        JFVInicio j = new JFVInicio();
        try {
            img = ImageIO.read(new File("Imagenes\\fondojuego.png"));
            if (j.getVentana() == "humano") {
                cabeza = ImageIO.read(new File("Imagenes\\cabezaHumano.png"));
                cuerpo = ImageIO.read(new File("Imagenes\\cuerpoHumano.png"));
                piernas = ImageIO.read(new File("Imagenes\\piernasHumano.png"));
                xcabeza = 77;
                ycuerpo = 41;
                xpiernas = 51;
                ypiernas = 85;
            }
            if (j.getVentana() == "hibrido") {
                cabeza = ImageIO.read(new File("Imagenes\\cabezaHibrido.gif"));
                cuerpo = ImageIO.read(new File("Imagenes\\cuerpoHibrido.gif"));
                piernas = ImageIO.read(new File("Imagenes\\piernasHibrido.gif"));
                xcabeza = 21;
                ycuerpo = 84;
                xcuerpo = 11;
                ypiernas = 128;
            }
            if (j.getVentana() == "alien") {
                cabeza = ImageIO.read(new File("Imagenes\\cabezaAlien.gif"));
                cuerpo = ImageIO.read(new File("Imagenes\\cuerpoAlien.gif"));
                piernas = ImageIO.read(new File("Imagenes\\piernasAlien.gif"));
                xcuerpo = 8;
                ycuerpo = 54;
                ypiernas = 96;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        gr.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        Graphics2D g2 = (Graphics2D) gr;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int corridox = 0;
        int i;
        for (i = 0; i < clones; i++) {
            g2.drawImage(cabeza, pjs[i].getDx() + xcabeza + corridox, pjs[i].getDy() + ycabeza, null);
            g2.drawImage(cuerpo, pjs[i].getDx() + xcuerpo + corridox, pjs[i].getDy() + ycuerpo, null);
            g2.drawImage(piernas, pjs[i].getDx() + xpiernas + corridox, pjs[i].getDy() + ypiernas, null);
            corridox = corridox + 150;
        }
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < clones; i++) {
            pjs[i].mover();
            repaint();
        }
    }

    private class teclado extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            for (int i = 0; i < clones; i++) {
                pjs[i].KeyReleased(e);
            }
        }

        public void keyPressed(KeyEvent e) {
            for (int i = 0; i < clones; i++) {
                pjs[i].KeyPressed(e);
            }
        }
    }
}
