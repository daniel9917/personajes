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
public class Hibrido implements Personaje {

    private String nombre = "";

    @Override
    public String getCasco() {
        System.out.println("Hibrido creado!");
        String texto = "Casco hecho con material de Tharsis";
        System.out.println("Descripcion: " + texto);
        return texto;        
    }

    @Override
    public String getArmadura() {
        String texto = "Armadura corporal generada por un campo de fuerza electrico";
        System.out.println("Descripcion: " + texto);
        return texto;
    }

    @Override
    public String getBotas() {
        String texto = "Botas con propulsion energetica";
        System.out.println("Descripcion: " + texto);
        return texto;
    }

    @Override
    public String getNombre() {
        nombre = "Hibrido1";
        return nombre;
    }

    public Personaje Clonar() {
        Hibrido objHibrido = new Hibrido();
        objHibrido.getCasco();
        objHibrido.getArmadura();
        objHibrido.getBotas();
        return objHibrido;
    }
}
