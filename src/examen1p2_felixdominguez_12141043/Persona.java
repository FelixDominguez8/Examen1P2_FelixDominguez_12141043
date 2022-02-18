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
public class Persona {
    private String nombre;
    private String poder;
    private String debilidad;
    private String heroeovillano;
    private int fuerza;
    private int habilidadfisica;
    private int habilidadmental;
    private boolean tieneescuadron;

    public Persona() {
    }

    public Persona(String nombre, String poder, String debilidad, String heroeovillano, int fuerza, int habilidadfisica, int habilidadmental, boolean tieneescuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroeovillano = heroeovillano;
        this.fuerza = fuerza;
        this.habilidadfisica = habilidadfisica;
        this.habilidadmental = habilidadmental;
        this.tieneescuadron = tieneescuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroeovillano() {
        return heroeovillano;
    }

    public void setHeroeovillano(String heroeovillano) {
        this.heroeovillano = heroeovillano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidadfisica() {
        return habilidadfisica;
    }

    public void setHabilidadfisica(int habilidadfisica) {
        this.habilidadfisica = habilidadfisica;
    }

    public int getHabilidadmental() {
        return habilidadmental;
    }

    public void setHabilidadmental(int habilidadmental) {
        this.habilidadmental = habilidadmental;
    }

    public boolean isTieneescuadron() {
        return tieneescuadron;
    }

    public void setTieneescuadron(boolean tieneescuadron) {
        this.tieneescuadron = tieneescuadron;
    }
    
    public void FinalChance(Persona p1, Persona p2){
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", heroeovillano=" + heroeovillano + ", fuerza=" + fuerza + ", habilidadfisica=" + habilidadfisica + ", habilidadmental=" + habilidadmental + ", tieneescuadron=" + tieneescuadron + '}';
    }
    
    
}
