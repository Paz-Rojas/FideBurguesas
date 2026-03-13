/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fideburguesas.model;

  public abstract class Producto extends ElementoMenu {
    
    /**
     *
     */
    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    protected String nombre;
    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    protected double precioBase;

   
    public Producto(String nombre, double precioBase) {
        super(nombre, precioBase); 
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    
    @Override
    public String getNombre() { 
        return nombre; 
    }

    public double getPrecioBase() { 
        return precioBase; 
    }

    
    @Override
    public double calcularPrecioFinal() { 
        return precioBase; 
    }
}