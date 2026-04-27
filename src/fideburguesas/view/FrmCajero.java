package fideburguesas.view;

import fideburguesas.logic.Facturador;
import fideburguesas.model.ElementoMenu;
import fideburguesas.model.Producto;
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnHamSimple = new javax.swing.JButton();
        btnFinalizarPedido = new javax.swing.JButton();
        btnCombo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBebida = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

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

        jLabel2.setText("Orden ");

        btnBebida.setText("Bebida Natural");
        btnBebida.addActionListener(this::btnBebidaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCombo)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2))
                            .addComponent(btnHamSimple)
                            .addComponent(btnBebida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnFinalizarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(btnBebida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHamSimple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCombo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(btnFinalizarPedido)
                .addGap(38, 38, 38))
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

    private void btnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidaActionPerformed
      
    Producto bebida = new Producto("Refresco Natural", 1000) {};
    
    ordenActual.agregarElemento(bebida);
    
    actualizarTabla();
    
    
    }//GEN-LAST:event_btnBebidaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebida;
    private javax.swing.JButton btnCombo;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.JButton btnHamSimple;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla() {
    
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable2.getModel();
    modelo.setRowCount(0);
    
    for (ElementoMenu item : ordenActual.getItems()) {
        modelo.addRow(new Object[]{item.getNombre(), item.calcularPrecioFinal()});
    }
}

}

