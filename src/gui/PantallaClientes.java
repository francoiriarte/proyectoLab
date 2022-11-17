package gui;
import domain.Cliente;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PantallaClientes extends javax.swing.JFrame {

    private void imprimirTablaClientes(ArrayList<domain.Cliente> clientes) {
        clientes.forEach(cliente -> {
            DefaultTableModel tablita = (DefaultTableModel)tablaClientes.getModel();
            tablita.addRow(new Object[]{cliente.getIdCliente(), cliente.getNombreCliente(), cliente.getCuitCliente(), cliente.getDomicilioCliente(), cliente.getLocalidadCliente(), cliente.getCpCliente(), cliente.getTelefonoCliente(), cliente.getEmailCliente(), cliente.getCondicionCliente()});
        });
    }
    
    private void vaciarTablaClientes() {
        DefaultTableModel tablita = (DefaultTableModel)tablaClientes.getModel();
        tablita.setRowCount(0);
    }
    
    public PantallaClientes() throws ClassNotFoundException {
        initComponents();
        imprimirTablaClientes(Cliente.seleccionar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        agregarClienteBtn = new javax.swing.JButton();
        campoCuitCliente = new javax.swing.JTextField();
        campoNombreCliente = new javax.swing.JTextField();
        campoCorreoCliente = new javax.swing.JTextField();
        campoLocalidadCliente = new javax.swing.JTextField();
        campoIdCliente = new javax.swing.JTextField();
        campoCpCliente = new javax.swing.JTextField();
        campoCondicionCliente = new javax.swing.JComboBox<>();
        modificarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
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
        campoTelefonoCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoDomicilioCliente = new javax.swing.JTextField();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("CLIENTES");
        labelTitulo.setPreferredSize(new java.awt.Dimension(450, 50));
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 20, -1, -1));
        labelTitulo.getAccessibleContext().setAccessibleDescription("");

        agregarClienteBtn.setBackground(new java.awt.Color(204, 255, 204));
        agregarClienteBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        agregarClienteBtn.setText("Agregar cliente");
        agregarClienteBtn.setPreferredSize(new java.awt.Dimension(150, 35));
        agregarClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarClienteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(agregarClienteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 325, -1, -1));

        campoCuitCliente.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(campoCuitCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        campoNombreCliente.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(campoNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        campoCorreoCliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(campoCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 210, 270, -1));

        campoLocalidadCliente.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(campoLocalidadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        campoIdCliente.setEnabled(false);
        campoIdCliente.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(campoIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        campoCpCliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(campoCpCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        campoCondicionCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consumidor Final", "Monotributo", "Exento", "Responsable Inscripto" }));
        campoCondicionCliente.setMinimumSize(new java.awt.Dimension(250, 22));
        campoCondicionCliente.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(campoCondicionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 270, -1, -1));

        modificarBtn.setBackground(new java.awt.Color(255, 255, 204));
        modificarBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        modificarBtn.setText("Modificar cliente");
        modificarBtn.setPreferredSize(new java.awt.Dimension(160, 35));
        modificarBtn.setRequestFocusEnabled(false);
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(modificarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 325, 160, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 420));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "CUIT/CUIL", "Domicilio", "Localidad", "C.P.", "Teléfono", "Correo", "Condición AFIP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaClientes.setPreferredSize(new java.awt.Dimension(300, 90));
        jScrollPane1.setViewportView(tablaClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 190));

        eliminarBtn.setBackground(new java.awt.Color(255, 204, 204));
        eliminarBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        eliminarBtn.setText("Eliminar cliente");
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
        jLabel1.setText("C.U.I.T/C.U.I.L");
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Domicilio");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Teléfono");
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("ID");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 50, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setText("Código Postal");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Correo electrónico");
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel7.setText("Condición AFIP");
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel8.setText("Localidad");
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        campoTelefonoCliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(campoTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel9.setText("Nombre del cliente");
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        campoDomicilioCliente.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(campoDomicilioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

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

    private void agregarClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarClienteBtnActionPerformed
        //RECOLECCIÓN DE DATOS
        String nombre = campoNombreCliente.getText();
        String cuitTxt = campoCuitCliente.getText();
        int cuit = Integer.parseInt(cuitTxt);
        String domicilio = campoDomicilioCliente.getText();
        String localidad = campoLocalidadCliente.getText();
        int cp = Integer.parseInt(campoCpCliente.getText());
        int telefono = Integer.parseInt(campoTelefonoCliente.getText());
        String email = campoCorreoCliente.getText();
        String condicion = (String) campoCondicionCliente.getSelectedItem();

        //EJECUTAR INSERTAR
        Cliente cliente = new Cliente(nombre, cuit, domicilio, localidad, cp, telefono, email, condicion);

        try {
            Cliente.insertar(cliente);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        //VACIAR CAMPOS
        campoNombreCliente.setText("");
        campoCuitCliente.setText("");
        campoDomicilioCliente.setText("");
        campoLocalidadCliente.setText("");
        campoCpCliente.setText("");
        campoTelefonoCliente.setText("");
        campoCorreoCliente.setText("");

        //ACTUALIZAR TABLA
        vaciarTablaClientes();
        try {
            imprimirTablaClientes(Cliente.seleccionar());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_agregarClienteBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        //OBTENER VALORES DE LA TABLA
        int filaSeleccionada = tablaClientes.getSelectedRow();
        campoIdCliente.setText(String.valueOf(tablaClientes.getValueAt(filaSeleccionada, 0)));
        campoNombreCliente.setText((String) tablaClientes.getValueAt(filaSeleccionada, 1));
        campoCuitCliente.setText(String.valueOf(tablaClientes.getValueAt(filaSeleccionada, 2)));
        campoDomicilioCliente.setText((String) tablaClientes.getValueAt(filaSeleccionada, 3));
        campoLocalidadCliente.setText((String) tablaClientes.getValueAt(filaSeleccionada, 4));
        campoCpCliente.setText(String.valueOf(tablaClientes.getValueAt(filaSeleccionada, 5)));
        campoTelefonoCliente.setText(String.valueOf(tablaClientes.getValueAt(filaSeleccionada, 6)));
        campoCorreoCliente.setText((String) tablaClientes.getValueAt(filaSeleccionada, 7));
        campoCondicionCliente.setSelectedItem(tablaClientes.getValueAt(filaSeleccionada, 8));

        agregarClienteBtn.setEnabled(false);
        guardarCambiosBtn.setEnabled(true);
        modificarBtn.setEnabled(false);
        eliminarBtn.setEnabled(false);
        tablaClientes.setEnabled(false);
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void guardarCambiosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosBtnActionPerformed
        //RECOLECCIÓN DE DATOS
        int id = Integer.parseInt(campoIdCliente.getText());
        String nombre = campoNombreCliente.getText();
        int cuit = Integer.parseInt(campoCuitCliente.getText());
        String domicilio = campoDomicilioCliente.getText();
        String localidad = campoLocalidadCliente.getText();
        int telefono = Integer.parseInt(campoTelefonoCliente.getText());
        int cp = Integer.parseInt(campoCpCliente.getText());
        String email = campoCorreoCliente.getText();
        String condicion = (String) campoCondicionCliente.getSelectedItem();

        //EJECUTAR INSERTAR
        Cliente cliente = new Cliente(id, nombre, cuit, domicilio, localidad, telefono, cp, email, condicion);
        try {
            Cliente.modificar(cliente);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        //VACIAR CAMPOS
        campoIdCliente.setText("");
        campoNombreCliente.setText("");
        campoCuitCliente.setText("");
        campoDomicilioCliente.setText("");
        campoLocalidadCliente.setText("");
        campoTelefonoCliente.setText("");
        campoCpCliente.setText("");
        campoCorreoCliente.setText("");

        //ACTUALIZAR TABLA
        vaciarTablaClientes();
        try {
            imprimirTablaClientes(Cliente.seleccionar());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        //HABILITAR DESHABILITAR BOTONES
        agregarClienteBtn.setEnabled(true);
        guardarCambiosBtn.setEnabled(false);
        modificarBtn.setEnabled(true);
        eliminarBtn.setEnabled(true);
        tablaClientes.setEnabled(true);
    }//GEN-LAST:event_guardarCambiosBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        int filaSeleccionada = tablaClientes.getSelectedRow();
        int id = (int) tablaClientes.getValueAt(filaSeleccionada, 0);

        Cliente cliente = new Cliente(id);
        try {
            Cliente.eliminar(cliente);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        //ACTUALIZAR TABLA
        vaciarTablaClientes();
        try {
            imprimirTablaClientes(Cliente.seleccionar());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PantallaClientes().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PantallaClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarClienteBtn;
    private javax.swing.JComboBox<String> campoCondicionCliente;
    private javax.swing.JTextField campoCorreoCliente;
    private javax.swing.JTextField campoCpCliente;
    private javax.swing.JTextField campoCuitCliente;
    private javax.swing.JTextField campoDomicilioCliente;
    private javax.swing.JTextField campoIdCliente;
    private javax.swing.JTextField campoLocalidadCliente;
    private javax.swing.JTextField campoNombreCliente;
    private javax.swing.JTextField campoTelefonoCliente;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
