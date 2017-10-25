/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author gorym
 */
public class Alien implements Personaje {

    private String nombre = "";

    @Override
    public String getCasco() {
        System.out.println("Alien creado!");
        String texto = "Cabina blindada con conexion soldado-soldado";
        System.out.println("Descripcion: " + texto);
        return texto;
    }

    @Override
    public String getArmadura() {
        String texto = "Armadura de titanio ultraligero";
        System.out.println("Descripcion: " + texto);
        return texto;
    }

    @Override
    public String getBotas() {
        String texto = "Piernas roboticas con 40+ c/ fuerza";
        System.out.println("Descripcion: " + texto);
        return texto;
    }

    @Override
    public String getNombre() {
        nombre = "Alien1";
        return nombre;
    }

    @Override
    public Personaje Clonar() {
        Alien objAlien = new Alien();
        objAlien.getCasco();
        objAlien.getArmadura();
        objAlien.getBotas();
        return objAlien;
    }
}
