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
public class Humano implements Personaje {
    
    private String nombre = "";

    @Override
    public String getCasco() {
        System.out.println("Humano creado!");
        String texto = "Casco militar de fibra de carbono";
        System.out.println("Descripcion de casco: " + texto);
        return texto;
    }

    @Override
    public String getArmadura() {
        String texto = "Armadura de nanofibra de carbono ionizada";
        System.out.println("Descripcion de armadura: " + texto);
        return texto;
    }

    @Override
    public String getBotas() {
        String texto = "Exo-piernas con 20+ caballos de fuerza";
        System.out.println("Descripcion de botas: " + texto);
        return texto;
    }

    @Override
    public Personaje Clonar() {
        Humano objHumano = new Humano();
        objHumano.getCasco();
        objHumano.getArmadura();
        objHumano.getBotas();
        return objHumano;
    }

    @Override
    public String getNombre() {
        nombre = "Humano1";
        return nombre;
    }
}
