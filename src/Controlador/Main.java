/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.JFVInicio;
import java.util.Scanner;

/**
 *
 * @author gorym
 */
public class Main {

    private static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args) {
        JFVInicio v = new JFVInicio();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }
}

