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
public class Universo {
    private String nombre;
    private ArrayList<Escuadron> escuadrones;

    public Universo() {
        
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public Universo(String nombre, ArrayList<Escuadron> escuadrones) {
        this.nombre = nombre;
        this.escuadrones = escuadrones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getEscuadrones() {
        return escuadrones;
    }

    public void setEscuadrones(ArrayList<Escuadron> escuadrones) {
        this.escuadrones = escuadrones;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", escuadrones=" + escuadrones;
    }
    
}
