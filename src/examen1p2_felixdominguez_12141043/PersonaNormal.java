/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_felixdominguez_12141043;

/**
 *
 * @author Lenovo I7
 */
public class PersonaNormal extends Persona{

    public PersonaNormal() {
        
    }
    
    public PersonaNormal(String nombre, String poder, String debilidad, String heroeovillano, int fuerza, int habilidadfisica, int habilidadmental, boolean tieneescuadron) {
        super(nombre, poder, debilidad, heroeovillano, fuerza, habilidadfisica, habilidadmental, tieneescuadron);
    }
    
    @Override
    public void FinalChance(Persona p1, Persona p2){
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
