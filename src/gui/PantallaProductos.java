package gui;
import domain.Producto;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PantallaProductos extends javax.swing.JFrame {
    
    private void imprimirTablaProductos(ArrayList<domain.Producto> productos) {
        productos.forEach(producto -> {
            DefaultTableModel tablita = (DefaultTableModel)tablaProductos.getModel();
            String promo;
            if (producto.isPromocionProducto() == true) {
                promo = "SI";
            } else {
                promo = "NO";
            }
            tablita.addRow(new Object[]{producto.getIdProducto(), producto.getNombreProducto(), producto.getMarcaProducto(), producto.getCategoriaProducto(), producto.getProveedorProducto(), producto.getPrecioProducto(), producto.getStockProducto(), promo});
        });
    }
    
    private void vaciarTablaProductos() {
        DefaultTableModel tablita = (DefaultTableModel)tablaProductos.getModel();
        tablita.setRowCount(0);
    }

    public PantallaProductos() throws ClassNotFoundException {
        initComponents();
        campoFechaProducto.setText((LocalDate.now()).toString());
        imprimirTablaProductos(Producto.seleccionar());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JButton();
        campoMarcaProducto = new javax.swing.JTextField();
        campoNombreProducto = new javax.swing.JTextField();
        campoFechaProducto = new javax.swing.JTextField();
        campoCategoriaProducto = new javax.swing.JComboBox<>();
        campoProveedorProducto = new javax.swing.JTextField();
        campoStockProducto = new javax.swing.JTextField();
        campoPrecioProducto = new javax.swing.JTextField();
        campoPromocionProducto = new javax.swing.JComboBox<>();
        modificarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        eliminarBtn = new javax.swing.JButton();
        guardarCambiosBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("PRODUCTOS");
        labelTitulo.setPreferredSize(new java.awt.Dimension(450, 50));
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 20, -1, -1));
        labelTitulo.getAccessibleContext().setAccessibleDescription("");

        agregarBtn.setBackground(new java.awt.Color(204, 255, 204));
        agregarBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        agregarBtn.setText("Agregar producto");
        agregarBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(agregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 325, -1, -1));

        campoMarcaProducto.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(campoMarcaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        campoNombreProducto.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(campoNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        campoFechaProducto.setEnabled(false);
        campoFechaProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(campoFechaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 210, -1, -1));

        campoCategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mates", "Termos", "Bombillas", "Yerbas" }));
        campoCategoriaProducto.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(campoCategoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        campoProveedorProducto.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(campoProveedorProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        campoStockProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(campoStockProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 210, -1, -1));

        campoPrecioProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(campoPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        campoPromocionProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        campoPromocionProducto.setMinimumSize(new java.awt.Dimension(250, 22));
        campoPromocionProducto.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(campoPromocionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 270, -1, -1));

        modificarBtn.setBackground(new java.awt.Color(255, 255, 204));
        modificarBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        modificarBtn.setText("Modificar producto");
        modificarBtn.setPreferredSize(new java.awt.Dimension(160, 35));
        modificarBtn.setRequestFocusEnabled(false);
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(modificarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 325, 160, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 420));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Marca", "Categoria", "Proveedor", "Precio", "Stock", "Promocion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaProductos.setPreferredSize(new java.awt.Dimension(300, 90));
        jScrollPane1.setViewportView(tablaProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 190));

        eliminarBtn.setBackground(new java.awt.Color(255, 204, 204));
        eliminarBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        eliminarBtn.setText("Eliminar producto");
        eliminarBtn.setOpaque(true);
        eliminarBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 325, -1, -1));

        guardarCambiosBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        guardarCambiosBtn.setText("Guardar cambios");
        guardarCambiosBtn.setEnabled(false);
        guardarCambiosBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        guardarCambiosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosBtnActionPerformed(evt);
            }
        });
        jPanel1.add(guardarCambiosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 325, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setText("Marca del producto");
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Categoría del producto");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Stock");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Nombre del producto");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setText("Precio de venta");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de alta");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel7.setText("¿Producto en promoción?");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel8.setText("Proveedor");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

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
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        //RECOLECCIÓN DE DATOS
        String nombre = campoNombreProducto.getText();
        String marca = campoMarcaProducto.getText();
        String categoria = (String) campoCategoriaProducto.getSelectedItem();
        String proveedor = campoProveedorProducto.getText();
        Double precio = Double.parseDouble(campoPrecioProducto.getText());
        int stock = Integer.parseInt(campoStockProducto.getText());
        String fecha = campoFechaProducto.getText();
        String valorPromocion = (String) campoPromocionProducto.getSelectedItem();
        Boolean promocion;
        if (valorPromocion == "SI") {
            promocion = true;
        } else {
            promocion = false;
        }

        //EJECUTAR INSERTAR
        Producto producto = new Producto(nombre, marca, categoria, proveedor, precio, stock, fecha, promocion);

        try {
            Producto.insertar(producto);
        } catch (ParseException ex) {
            Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

        //VACIAR CAMPOS
        campoNombreProducto.setText("");
        campoMarcaProducto.setText("");
        campoProveedorProducto.setText("");
        campoPrecioProducto.setText("");
        campoStockProducto.setText("");

        //ACTUALIZAR TABLA
        vaciarTablaProductos();
        try {
            imprimirTablaProductos(Producto.seleccionar());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        //OBTENER VALORES DE LA TABLA
        int filaSeleccionada = tablaProductos.getSelectedRow();
        campoNombreProducto.setText((String) tablaProductos.getValueAt(filaSeleccionada, 1));
        campoMarcaProducto.setText((String) tablaProductos.getValueAt(filaSeleccionada, 2));
        campoCategoriaProducto.setSelectedItem(tablaProductos.getValueAt(filaSeleccionada, 3));
        campoProveedorProducto.setText((String) tablaProductos.getValueAt(filaSeleccionada, 4));
        campoPrecioProducto.setText(String.valueOf(tablaProductos.getValueAt(filaSeleccionada, 5)));
        campoStockProducto.setText(String.valueOf(tablaProductos.getValueAt(filaSeleccionada, 6)));
        campoPromocionProducto.setSelectedItem(tablaProductos.getValueAt(filaSeleccionada, 7));

        agregarBtn.setEnabled(false);
        guardarCambiosBtn.setEnabled(true);
        modificarBtn.setEnabled(false);
        eliminarBtn.setEnabled(false);
        tablaProductos.setEnabled(false);
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void guardarCambiosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosBtnActionPerformed
        //RECOLECCIÓN DE DATOS
        int filaSeleccionada = tablaProductos.getSelectedRow();
        int id = (int) tablaProductos.getValueAt(filaSeleccionada, 0);
        String nombre = campoNombreProducto.getText();
        String marca = campoMarcaProducto.getText();
        String categoria = (String) campoCategoriaProducto.getSelectedItem();
        String proveedor = campoProveedorProducto.getText();
        Double precio = Double.parseDouble(campoPrecioProducto.getText());
        int stock = Integer.parseInt(campoStockProducto.getText());
        String valorPromocion = (String) campoPromocionProducto.getSelectedItem();
        Boolean promocion;
        if (valorPromocion == "SI") {
            promocion = true;
        } else {
            promocion = false;
        }

        //EJECUTAR INSERTAR
        Producto producto = new Producto(id, nombre, marca, categoria, proveedor, precio, stock, promocion);
        try {
            Producto.modificar(producto);
        } catch (ParseException ex) {
            Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

        //VACIAR CAMPOS
        campoNombreProducto.setText("");
        campoMarcaProducto.setText("");
        campoProveedorProducto.setText("");
        campoPrecioProducto.setText("");
        campoStockProducto.setText("");

        //ACTUALIZAR TABLA
        vaciarTablaProductos();
        try {
            imprimirTablaProductos(Producto.seleccionar());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

        //HABILITAR DESHABILITAR BOTONES
        agregarBtn.setEnabled(true);
        guardarCambiosBtn.setEnabled(false);
        modificarBtn.setEnabled(true);
        eliminarBtn.setEnabled(true);
        tablaProductos.setEnabled(true);
    }//GEN-LAST:event_guardarCambiosBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        int filaSeleccionada = tablaProductos.getSelectedRow();
        int id = (int) tablaProductos.getValueAt(filaSeleccionada, 0);

        Producto producto = new Producto(id);
        try {
            Producto.eliminar(producto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

        //ACTUALIZAR TABLA
        vaciarTablaProductos();
        try {
            imprimirTablaProductos(Producto.seleccionar());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PantallaProductos().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PantallaProductos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JComboBox<String> campoCategoriaProducto;
    private javax.swing.JTextField campoFechaProducto;
    private javax.swing.JTextField campoMarcaProducto;
    private javax.swing.JTextField campoNombreProducto;
    private javax.swing.JTextField campoPrecioProducto;
    private javax.swing.JComboBox<String> campoPromocionProducto;
    private javax.swing.JTextField campoProveedorProducto;
    private javax.swing.JTextField campoStockProducto;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JButton guardarCambiosBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
