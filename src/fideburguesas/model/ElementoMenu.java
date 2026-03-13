/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fideburguesas.model;

/**
 *
 * @author USER
 */


import java.io.Serializable;

public abstract class ElementoMenu implements Serializable {
    protected String nombre;
    protected double precioBase;

    public ElementoMenu(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    
    public abstract double calcularPrecioFinal();

    @Override
    public String toString() { return nombre + " - ₡" + calcularPrecioFinal(); }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
