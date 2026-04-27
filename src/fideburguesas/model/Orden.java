/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fideburguesas.model;

/**
 *
 * @author USER
 */

import java.util.ArrayList;

public class Orden {
    
    private final ArrayList<ElementoMenu> items = new ArrayList<>();
    private final int idOrden;

    
    public Orden(int id) {
        this.idOrden = id;
    }

   
    public void agregarItem(ElementoMenu item) throws Exception {
        if (item == null) {
            throw new Exception("Item no válido");
        }
        items.add(item);
    }

    
    public double calcularTotal() {
        double total = 0;
        for (ElementoMenu i : items) {
            total += i.calcularPrecioFinal(); 
        }
        return total;
    }

    
    public ArrayList<ElementoMenu> getItems() {
        return items;
    }

    
    public int getIdOrden() {
        return idOrden;
    }

    public Iterable<Producto> getListaProductos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void agregarElemento(Producto bebida) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}