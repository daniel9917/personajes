package Modelo;

import Controlador.Humano;
import Controlador.Personaje;
import java.util.Hashtable;

public class FabricaHumano implements FabricaPersonaje{
    
    private Hashtable hPersonaje = new Hashtable();

    @Override
    public Personaje crearPersonaje() {
        return new Humano();
    }

    public Personaje getClon(String nombre) {
        Personaje prototipo = (Humano) hPersonaje.get(nombre);
        return (Personaje) prototipo.Clonar();
    }
    
}
