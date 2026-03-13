package fideburguesas.view;

import fideburguesas.logic.Facturador;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;


 
    
/**
 *
 * @author USER
 */


public class FrmCajero extends javax.swing.JFrame {
    private fideburguesas.model.Orden ordenActual = new fideburguesas.model.Orden(101); 
    private final javax.swing.table.DefaultTableModel modeloTabla;
    private Object fideburguesas;
  
    
public FrmCajero() {
    initComponents();
    this.setLocationRelativeTo(null); 
    
    
    modeloTabla = new javax.swing.table.DefaultTableModel(
        new Object[]{"Producto", "Precio"}, 0
    );
    
    
    jTable2.setModel(modeloTabla); 
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnHamSimple = new javax.swing.JButton();
        btnFinalizarPedido = new javax.swing.JButton();
        btnCombo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        textField1.setText("textField1");

        jScrollPane1.setViewportView(jTextPane1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHamSimple.setText("Hamburguesa");
        btnHamSimple.addActionListener(this::btnHamSimpleActionPerformed);

        btnFinalizarPedido.setText("Finalizar Pedido");
        btnFinalizarPedido.addActionListener(this::btnFinalizarPedidoActionPerformed);

        btnCombo.setText("Combo Familiar");
        btnCombo.addActionListener(this::btnComboActionPerformed);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHamSimple)
                            .addComponent(btnCombo))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFinalizarPedido)
                        .addGap(189, 189, 189))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnHamSimple)
                        .addGap(33, 33, 33)
                        .addComponent(btnCombo)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(btnFinalizarPedido)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHamSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamSimpleActionPerformed
                                            
        try {
            fideburguesas.model.Producto p = new fideburguesas.model.Producto("Hamburguesa Simple", 3000.0) {};
            ordenActual.agregarItem(p); 
            modeloTabla.addRow(new Object[]{p.getNombre(), p.getPrecioBase()}); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnHamSimpleActionPerformed

    private void btnFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoActionPerformed
      try {
        Facturador.generarFactura(ordenActual);
        JOptionPane.showMessageDialog(this, "Factura generada.");

        
        modeloTabla.setRowCount(0); 

        
        ordenActual = new fideburguesas.model.Orden(102); 
        
    } catch (HeadlessException e) {
        
    }
    }//GEN-LAST:event_btnFinalizarPedidoActionPerformed

    private void btnComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComboActionPerformed
        try {
        
        fideburguesas.model.Combo nuevoC = new fideburguesas.model.Combo("Combo Familiar", 10000.0, 15.0);
        ordenActual.agregarItem(nuevoC); 
        
        
        modeloTabla.addRow(new Object[]{nuevoC.getNombre(), nuevoC.calcularPrecioFinal()});
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnComboActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCombo;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.JButton btnHamSimple;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

}

