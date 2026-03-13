/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fideburguesas.logic;

/**
 *
 * @author USER
 */
import fideburguesas.model.Orden;
import fideburguesas.model.ElementoMenu; 
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Facturador {

    public static void generarFactura(Orden orden) {
        File archivo = new File("factura.txt");

        try (PrintWriter escritor = new PrintWriter(archivo)) {
            escritor.println("========== FIDEBURGUESAS ==========");
            escritor.println("Factura N: " + orden.getIdOrden());
            escritor.println("-----------------------------------");

           
            for (ElementoMenu p : orden.getItems()) {
                escritor.println(p.getNombre() + " ....... ₡" + p.calcularPrecioFinal());
            }

            escritor.println("-----------------------------------");
            escritor.println("TOTAL A PAGAR: ₡" + orden.calcularTotal());
            escritor.println("===================================");
            
            
            escritor.close();

            
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(archivo);
            }

        } catch (IOException e) {
            System.err.println("Error al crear factura: " + e.getMessage());
        }
    }
}