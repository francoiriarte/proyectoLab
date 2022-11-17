package gui;
import domain.Cliente;
import domain.Factura;
import domain.Producto;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class PantallaVentas extends javax.swing.JFrame {
    
    private void imprimirTablaMaestro(ArrayList<domain.Factura> maestro) {
        maestro.forEach(factura -> {
            try {
                DefaultTableModel tablita = (DefaultTableModel)tablaMaestro.getModel();
                Cliente cliente = Factura.devolverCliente(factura.getIdCliente());
                String nombreCliente = cliente.getNombreCliente();
                tablita.addRow(new Object[]{factura.getIdFactura(), factura.getTipoFactura(), factura.getFechaFactura(), nombreCliente, factura.getFormaPagoFactura(), factura.getTotalFactura(), factura.getEstadoFactura()});
            } catch (SQLException ex) {
                Logger.getLogger(PantallaVentas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PantallaVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    } 

    public PantallaVentas() throws ClassNotFoundException {
        initComponents();
        imprimirTablaMaestro(Factura.seleccionarMaestro());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMaestro = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        campoAnularBtn = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("VENTAS");
        labelTitulo.setPreferredSize(new java.awt.Dimension(450, 50));
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 20, -1, -1));
        labelTitulo.getAccessibleContext().setAccessibleDescription("");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(800, 420));

        tablaMaestro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Factura", "Tipo de factura", "Fecha", "Cliente", "Forma de pago", "Total", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMaestro.setPreferredSize(new java.awt.Dimension(300, 90));
        tablaMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMaestroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaMaestro);
        if (tablaMaestro.getColumnModel().getColumnCount() > 0) {
            tablaMaestro.getColumnModel().getColumn(4).setHeaderValue("Descuento");
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 190));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 420));

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Producto", "Cantidad", "Precio Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaDetalle.setPreferredSize(new java.awt.Dimension(300, 90));
        jScrollPane1.setViewportView(tablaDetalle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 190));

        campoAnularBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        campoAnularBtn.setText("Anular compra");
        campoAnularBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        campoAnularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAnularBtnActionPerformed(evt);
            }
        });
        jPanel1.add(campoAnularBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, -1, -1));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        jPanel1.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Stock");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 190, -1, -1));

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

    private void campoAnularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAnularBtnActionPerformed
        try {
            DefaultTableModel tablitaMaestro = (DefaultTableModel) tablaMaestro.getModel();
            int filaSeleccionada = tablaMaestro.getSelectedRow();
            int idFactura = ((int) tablaMaestro.getValueAt(filaSeleccionada, 0));
            
            Factura.modificarEstado(idFactura);
            
            tablitaMaestro.setRowCount(0);
            imprimirTablaMaestro(Factura.seleccionarMaestro());
            
        } catch (ParseException ex) {
            Logger.getLogger(PantallaVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_campoAnularBtnActionPerformed

    private void tablaMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMaestroMouseClicked
        DefaultTableModel tablitaDetalle = (DefaultTableModel) tablaDetalle.getModel();
        tablitaDetalle.setRowCount(0);
        
        try {
            int filaSeleccionada = tablaMaestro.getSelectedRow();
            int idFactura = ((int) tablaMaestro.getValueAt(filaSeleccionada, 0));
            
            ArrayList<Factura> detalles = Factura.seleccionarDetalle(idFactura);
            for(Factura detalle : detalles) {
                int idProducto = detalle.getIdProducto();
                Producto producto = Factura.devolverProducto(idProducto);
                tablitaDetalle.addRow(new Object[]{detalle.getIdFactura(), producto.getNombreProducto(), detalle.getCantidadProducto(), detalle.getPrecioUnitarioProducto(), detalle.getTotalProducto()});
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PantallaVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaMaestroMouseClicked

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PantallaVentas().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PantallaVentas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campoAnularBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTable tablaMaestro;
    // End of variables declaration//GEN-END:variables
}
