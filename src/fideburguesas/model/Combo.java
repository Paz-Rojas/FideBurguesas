/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fideburguesas.model;

/**
 *
 * @author USER
 */
public class Combo extends Producto {
    
    private final double porcentajeDescuento;

   
    public Combo(String nombre, double precio, double descuento) {
        super(nombre, precio); 
        this.porcentajeDescuento = descuento;
    }

    
    @Override
    public double calcularPrecioFinal() {
        
        double descuento = this.getPrecioBase() * (porcentajeDescuento / 100);
        return this.getPrecioBase() - descuento;
    }
}