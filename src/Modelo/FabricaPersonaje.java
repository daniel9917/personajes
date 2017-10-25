/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Personaje;

/**
 *
 * @author gorym
 */
public interface FabricaPersonaje {
    public Personaje crearPersonaje();
    public Personaje getClon(String nombre);
}
