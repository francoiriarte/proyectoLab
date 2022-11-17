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

public class PantallaFacturacion extends javax.swing.JFrame {
    
    private void llenarListasDesplegables() {
        try {
            ArrayList<Producto> productos = Producto.seleccionar();
            ArrayList<Cliente> clientes = Cliente.seleccionar();
            
            DefaultComboBoxModel listaProductos = (DefaultComboBoxModel)campoNombreProducto.getModel();
            DefaultComboBoxModel listaClientes = (DefaultComboBoxModel)campoNombreCliente.getModel();
            
            campoNombreProducto.removeAllItems();
            campoNombreCliente.removeAllItems();
            
            for(Cliente cliente : clientes) {
                listaClientes.addElement(cliente.getNombreCliente());
            }
            
            for(Producto producto : productos) {
                listaProductos.addElement(producto.getNombreProducto());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private int numeroFactura() throws ClassNotFoundException {
        ArrayList<Factura> facturas = Factura.seleccionarMaestro();
        
        if (!facturas.isEmpty()) {
            int ultimaFactura = facturas.get(facturas.size()-1).getIdFactura() + 1;
            return ultimaFactura;
        } else {
            int ultimaFactura = 1;
            return ultimaFactura;
        }
    }

    public PantallaFacturacion() throws ClassNotFoundException {
        initComponents();
        campoFechaFacturacion.setText((LocalDate.now()).toString());
        llenarListasDesplegables();
        String numeroFactura = Integer.toString(numeroFactura());
        campoIdFactura.setText(numeroFactura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        agregarProductoBtn = new javax.swing.JButton();
        campoIdFactura = new javax.swing.JTextField();
        campoPrecioProducto = new javax.swing.JTextField();
        campoNombreCliente = new javax.swing.JComboBox<>();
        campoIdCliente = new javax.swing.JTextField();
        campoIdProducto = new javax.swing.JTextField();
        campoCantidadProducto = new javax.swing.JTextField();
        campoFormaPago = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        eliminarProductoBtn = new javax.swing.JButton();
        campoCargarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoFechaFacturacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoNombreProducto = new javax.swing.JComboBox<>();
        campoPromocionProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoTotalFactura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoTipoFactura = new javax.swing.JComboBox<>();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("FACTURACIÓN");
        labelTitulo.setPreferredSize(new java.awt.Dimension(450, 50));
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 20, -1, -1));
        labelTitulo.getAccessibleContext().setAccessibleDescription("");

        agregarProductoBtn.setBackground(new java.awt.Color(204, 255, 204));
        agregarProductoBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        agregarProductoBtn.setText("Agregar producto");
        agregarProductoBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        agregarProductoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(agregarProductoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        campoIdFactura.setEnabled(false);
        campoIdFactura.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(campoIdFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 90, -1, -1));

        campoPrecioProducto.setEnabled(false);
        campoPrecioProducto.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(campoPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 210, -1, -1));

        campoNombreCliente.setMaximumSize(new java.awt.Dimension(675, 32767));
        campoNombreCliente.setMinimumSize(new java.awt.Dimension(675, 22));
        campoNombreCliente.setName(""); // NOI18N
        campoNombreCliente.setPreferredSize(new java.awt.Dimension(675, 30));
        campoNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(campoNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 675, -1));

        campoIdCliente.setEnabled(false);
        campoIdCliente.setPreferredSize(new java.awt.Dimension(50, 30));
        campoIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdClienteActionPerformed(evt);
            }
        });
        jPanel1.add(campoIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 150, -1, -1));

        campoIdProducto.setEnabled(false);
        campoIdProducto.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(campoIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 210, 50, -1));

        campoCantidadProducto.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(campoCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        campoFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Débito", "Crédito" }));
        campoFormaPago.setMinimumSize(new java.awt.Dimension(250, 22));
        campoFormaPago.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(campoFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 420));

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Producto", "Cantidad", "Precio Unitario", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaDetalle.setPreferredSize(new java.awt.Dimension(300, 90));
        jScrollPane1.setViewportView(tablaDetalle);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 160));

        eliminarProductoBtn.setBackground(new java.awt.Color(255, 204, 204));
        eliminarProductoBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        eliminarProductoBtn.setText("Eliminar producto");
        eliminarProductoBtn.setOpaque(true);
        eliminarProductoBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        eliminarProductoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarProductoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        campoCargarBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        campoCargarBtn.setText("Cargar compra");
        campoCargarBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        campoCargarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCargarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(campoCargarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setText("Tipo de factura");
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("ID");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("ID");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 190, 50, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("ID Factura");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setText("Producto");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Precio Unitario");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel7.setText("Forma de pago");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel8.setText("Cliente");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        campoFechaFacturacion.setEnabled(false);
        campoFechaFacturacion.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(campoFechaFacturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel9.setText("Fecha de facturación");
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 70, -1, -1));

        campoNombreProducto.setMaximumSize(new java.awt.Dimension(675, 32767));
        campoNombreProducto.setMinimumSize(new java.awt.Dimension(675, 22));
        campoNombreProducto.setName(""); // NOI18N
        campoNombreProducto.setPreferredSize(new java.awt.Dimension(300, 30));
        campoNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreProductoActionPerformed(evt);
            }
        });
        jPanel1.add(campoNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        campoPromocionProducto.setEnabled(false);
        campoPromocionProducto.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(campoPromocionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel10.setText("Total");
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel11.setText("Cantidad");
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        campoTotalFactura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoTotalFactura.setEnabled(false);
        campoTotalFactura.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(campoTotalFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, -1, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel12.setText("Promoción");
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 190, -1, -1));

        campoTipoFactura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        campoTipoFactura.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(campoTipoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

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

    private void campoNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreProductoActionPerformed
        try {
            ArrayList<Producto> productos = Producto.seleccionar();
            
            String seleccion = (String) campoNombreProducto.getSelectedItem();
            
            for(Producto producto : productos) {
                if (seleccion == null ? producto.getNombreProducto() == null : seleccion.equals(producto.getNombreProducto())) {
                    campoIdProducto.setText(Integer.toString(producto.getIdProducto()));
                    campoPrecioProducto.setText(Double.toString(producto.getPrecioProducto()));
                    if (producto.isPromocionProducto()){
                        campoPromocionProducto.setText("SI");
                    } else {
                        campoPromocionProducto.setText("NO");
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_campoNombreProductoActionPerformed

    private void campoNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreClienteActionPerformed
        try {
            ArrayList<Cliente> clientes = Cliente.seleccionar();
            
            String seleccion = (String) campoNombreCliente.getSelectedItem();
            
            for(Cliente cliente : clientes) {
                if (seleccion == null ? cliente.getNombreCliente() == null : seleccion.equals(cliente.getNombreCliente())) {
                    campoIdCliente.setText(Integer.toString(cliente.getIdCliente()));
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_campoNombreClienteActionPerformed

    private void campoIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdClienteActionPerformed

    private void agregarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoBtnActionPerformed
        DefaultTableModel tablita = (DefaultTableModel)tablaDetalle.getModel();
        int id = Integer.parseInt(campoIdProducto.getText());
        String descripcion = (String)campoNombreProducto.getSelectedItem();
        int cantidad = Integer.parseInt(campoCantidadProducto.getText());
        Double precioUnitario = Double.parseDouble(campoPrecioProducto.getText());
        String promo = campoPromocionProducto.getText();
        Double total;
        if ("SI".equals(promo)) {
            total = precioUnitario * 0.90 * cantidad;

        } else {
            total = precioUnitario * cantidad;
        }

        tablita.addRow(new Object[]{id, descripcion, cantidad, precioUnitario, promo, total});

        Double importeTotal = 0.00;
        int filaSeleccionada = 0;
        int filas = tablita.getRowCount();

        while(filaSeleccionada < filas) {
            Double totalFila = (Double)tablita.getValueAt(filaSeleccionada, 5);
            importeTotal += totalFila;
            filaSeleccionada++;
        }

        campoTotalFactura.setText(Double.toString(importeTotal));
    }//GEN-LAST:event_agregarProductoBtnActionPerformed

    private void eliminarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoBtnActionPerformed
        DefaultTableModel tablita = (DefaultTableModel)tablaDetalle.getModel();
        tablita.removeRow(tablaDetalle.getSelectedRow());
    }//GEN-LAST:event_eliminarProductoBtnActionPerformed

    private void campoCargarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCargarBtnActionPerformed
        DefaultTableModel tablita = (DefaultTableModel)tablaDetalle.getModel();

        int filaSeleccionada = 0;
        int filas = tablita.getRowCount();

        String tipoFactura = (String)campoTipoFactura.getSelectedItem();
        String fechaFactura = campoFechaFacturacion.getText();
        int idCliente = Integer.parseInt(campoIdCliente.getText());
        String pagoFactura = (String)campoFormaPago.getSelectedItem();
        Double totalFactura = Double.parseDouble(campoTotalFactura.getText());
        String estadoFactura = "CONFIRMADA";

        Factura maestro = new Factura(tipoFactura, fechaFactura, idCliente, pagoFactura, totalFactura, estadoFactura);

        try {
            Factura.insertarMaestro(maestro);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PantallaFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        while(filaSeleccionada<filas) {
            int idProducto = Integer.parseInt(String.valueOf(tablita.getValueAt(filaSeleccionada, 0)));
            int cantidadProducto = Integer.parseInt(String.valueOf(tablita.getValueAt(filaSeleccionada, 2)));
            Double puProducto = Double.parseDouble(String.valueOf(tablita.getValueAt(filaSeleccionada, 3)));
            Double totalProducto = Double.parseDouble(String.valueOf(tablita.getValueAt(filaSeleccionada, 5)));
            int idFactura = Integer.parseInt(campoIdFactura.getText());
            Factura detalle = new Factura(idFactura, idProducto, cantidadProducto, puProducto, totalProducto);
            try {
                Factura.insertarDetalle(detalle);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PantallaFacturacion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(PantallaFacturacion.class.getName()).log(Level.SEVERE, null, ex);
            }

            filaSeleccionada++;
        }
       
        try {
            String numeroFactura = Integer.toString(numeroFactura());
            campoIdFactura.setText(numeroFactura);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tablita.setRowCount(0);
        campoCantidadProducto.setText(null);
    }//GEN-LAST:event_campoCargarBtnActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PantallaFacturacion().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PantallaFacturacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarProductoBtn;
    private javax.swing.JTextField campoCantidadProducto;
    private javax.swing.JButton campoCargarBtn;
    private javax.swing.JTextField campoFechaFacturacion;
    private javax.swing.JComboBox<String> campoFormaPago;
    private javax.swing.JTextField campoIdCliente;
    private javax.swing.JTextField campoIdFactura;
    private javax.swing.JTextField campoIdProducto;
    private javax.swing.JComboBox<String> campoNombreCliente;
    private javax.swing.JComboBox<String> campoNombreProducto;
    private javax.swing.JTextField campoPrecioProducto;
    private javax.swing.JTextField campoPromocionProducto;
    private javax.swing.JComboBox<String> campoTipoFactura;
    private javax.swing.JTextField campoTotalFactura;
    private javax.swing.JButton eliminarProductoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tablaDetalle;
    // End of variables declaration//GEN-END:variables
}
