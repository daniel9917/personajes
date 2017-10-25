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
public interface Personaje {
    public String getNombre();
    public String getCasco();
    public String getArmadura();
    public String getBotas();
    public Personaje Clonar();
}
