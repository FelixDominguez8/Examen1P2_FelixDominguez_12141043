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
public class PorAccidenteRadioactivo extends Persona{
    private int edadaccidente;
    private String tipoaccidente;

    public PorAccidenteRadioactivo() {
        
    }

    public PorAccidenteRadioactivo(int edadaccidente, String tipoaccidente, String nombre, String poder, String debilidad, String heroeovillano, int fuerza, int habilidadfisica, int habilidadmental, boolean tieneescuadron) {
        super(nombre, poder, debilidad, heroeovillano, fuerza, habilidadfisica, habilidadmental, tieneescuadron);
        this.edadaccidente = edadaccidente;
        this.tipoaccidente = tipoaccidente;
    }

    public int getEdadaccidente() {
        return edadaccidente;
    }

    public void setEdadaccidente(int edadaccidente) {
        this.edadaccidente = edadaccidente;
    }

    public String getTipoaccidente() {
        return tipoaccidente;
    }

    public void setTipoaccidente(String tipoaccidente) {
        this.tipoaccidente = tipoaccidente;
    }
    
    @Override
    public void FinalChance(Persona p1, Persona p2){
        
    }

    @Override
    public String toString() {
        return super.toString() + "edadaccidente=" + edadaccidente + ", tipoaccidente=" + tipoaccidente;
    }
    
}
