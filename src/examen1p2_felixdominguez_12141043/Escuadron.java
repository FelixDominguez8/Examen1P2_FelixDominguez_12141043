/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_felixdominguez_12141043;

import java.util.ArrayList;

/**
 *
 * @author Lenovo I7
 */
public class Escuadron {
    private String nombre;
    private String lugarbase;
    private Persona lider;
    private boolean heroeovillano;
    private ArrayList<Persona> miembros=new ArrayList();

    public Escuadron() {
        
    }

    public Escuadron(String nombre, String lugarbase, Persona lider, boolean heroeovillano) {
        this.nombre = nombre;
        this.lugarbase = lugarbase;
        this.lider = lider;
        this.heroeovillano = heroeovillano;
    }

    public Escuadron(String planeta, String lugarbase, Persona lider, boolean heroeovillano, ArrayList<Persona> miembros) {
        this.nombre = planeta;
        this.lugarbase = lugarbase;
        this.lider = lider;
        this.heroeovillano = heroeovillano;
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String planeta) {
        this.nombre = planeta;
    }

    public String getLugarbase() {
        return lugarbase;
    }

    public void setLugarbase(String lugarbase) {
        this.lugarbase = lugarbase;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public boolean isHeroeovillano() {
        return heroeovillano;
    }

    public void setHeroeovillano(boolean heroeovillano) {
        this.heroeovillano = heroeovillano;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", lugarbase=" + lugarbase + ", lider=" + lider + ", heroeovillano=" + heroeovillano + ", miembros=" + miembros;
    }
    
}
