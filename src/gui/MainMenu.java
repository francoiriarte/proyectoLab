package gui;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        productosBtn = new javax.swing.JButton();
        clientesBtn = new javax.swing.JButton();
        facturacionBtn = new javax.swing.JButton();
        ventasBtn = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SOFTWARE DE GESTIÓN");
        jLabel2.setPreferredSize(new java.awt.Dimension(450, 50));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 50, -1, -1));

        productosBtn.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        productosBtn.setText("Productos");
        productosBtn.setPreferredSize(new java.awt.Dimension(350, 50));
        productosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosBtnActionPerformed(evt);
            }
        });
        jPanel1.add(productosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        clientesBtn.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        clientesBtn.setText("Clientes");
        clientesBtn.setPreferredSize(new java.awt.Dimension(350, 50));
        clientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clientesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        facturacionBtn.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        facturacionBtn.setText("Facturación");
        facturacionBtn.setPreferredSize(new java.awt.Dimension(350, 50));
        facturacionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturacionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(facturacionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        ventasBtn.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        ventasBtn.setText("Ventas");
        ventasBtn.setPreferredSize(new java.awt.Dimension(350, 50));
        ventasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ventasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        jPanel1.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosBtnActionPerformed
        PantallaProductos pantallaProductos;
        try {
            pantallaProductos = new PantallaProductos();
            pantallaProductos.setVisible(true);
            pantallaProductos.setLocationRelativeTo(null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_productosBtnActionPerformed

    private void clientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesBtnActionPerformed
        PantallaClientes pantallaClientes;
        try {
            pantallaClientes = new PantallaClientes();
            pantallaClientes.setVisible(true);
            pantallaClientes.setLocationRelativeTo(null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clientesBtnActionPerformed

    private void facturacionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturacionBtnActionPerformed
        PantallaFacturacion pantallaFacturacion;
        try {
            pantallaFacturacion = new PantallaFacturacion();
            pantallaFacturacion.setVisible(true);
            pantallaFacturacion.setLocationRelativeTo(null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_facturacionBtnActionPerformed

    private void ventasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasBtnActionPerformed
        PantallaVentas pantallaVentas;
        try {
            pantallaVentas = new PantallaVentas();
            pantallaVentas.setVisible(true);
            pantallaVentas.setLocationRelativeTo(null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ventasBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientesBtn;
    private javax.swing.JButton facturacionBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JButton productosBtn;
    private javax.swing.JButton ventasBtn;
    // End of variables declaration//GEN-END:variables
}
