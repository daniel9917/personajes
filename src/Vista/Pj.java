/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.KeyEvent;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author gorym
 */
public class Pj {

    private int x;
    private int y;
    private int dx;
    private int dy;

    public void mover() {
        x += dx;
        y += dy;
    }

    public int getDx() {
        return x;
    }

    public int getDy() {
        return y;
    }

    public void KeyPressed(KeyEvent evt) {
        int tecla = evt.getKeyCode();
        if (tecla == KeyEvent.VK_LEFT) {
            if (x <= 0) {
                dx = 0;
            } else {
                dx = -3;
            }
        }
        if (tecla == KeyEvent.VK_RIGHT) {
            if (x >= 300) {
                dx = 0;
            } else {
                dx = 3;
            }
        }
        if (tecla == KeyEvent.VK_UP) {
            if (y <= 0) {
                dy = 0;
            } else {
                dy = -3;
            }
        }
        if (tecla == KeyEvent.VK_DOWN) {
            if (y >= 250) {
                dy = 0;
            } else {
                dy = 3;
            }
        }
    }
    
    public void KeyReleased(KeyEvent evt) {
        int tecla = evt.getKeyCode();
        if (tecla == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        if (tecla == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
        if (tecla == KeyEvent.VK_UP) {
            dy = 0;
        }
        if (tecla == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

}
