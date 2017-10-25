/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Hibrido;
import Controlador.Humano;
import Controlador.Personaje;
import java.util.Hashtable;

/**
 *
 * @author gorym
 */
public class FabricaHibrido implements FabricaPersonaje{
    
        private Hashtable hPersonaje = new Hashtable();

    @Override
    public Personaje crearPersonaje() {
        return new Hibrido();
    }
    
    public Personaje getClon(String nombre) {
        Personaje prototipo = (Hibrido) hPersonaje.get(nombre);
        return (Personaje) prototipo.Clonar();
    }
}
