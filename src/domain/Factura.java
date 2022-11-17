package domain;

import datos.Conexion;
import static datos.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factura {
    private int idFactura;
    private String tipoFactura;
    private String fechaFactura;
    private int idCliente;
    private String formaPagoFactura;
    private Double totalFactura;
    private String estadoFactura;
    private int idProducto;
    private int cantidadProducto;
    private Double precioUnitarioProducto;
    private Double totalProducto;
    
    //CONSTRUCTOR INSERT
    public Factura(int idFactura, String tipo, String fecha, int cliente, String pago, Double totalFactura, int producto, int cantidadProducto, Double pu, Double totalProducto) {
        this.idFactura = idFactura;
        this.tipoFactura = tipo;
        this.fechaFactura = fecha;
        this.idCliente = cliente;
        this.formaPagoFactura = pago;
        this.totalFactura = totalFactura;
        this.idProducto = producto;
        this.cantidadProducto = cantidadProducto;
        this.precioUnitarioProducto = pu;
        this.totalProducto = totalProducto;
    }
    
    //CONSTRUCTOR SELECT FACTURA    
    public Factura(int id, String fecha, String tipo, int cliente, String pago, Double total, String estado) {
        this.idFactura = id;
        this.fechaFactura = fecha;
        this.tipoFactura = tipo;
        this.idCliente = cliente;
        this.formaPagoFactura = pago;
        this.totalFactura = total;
        this.estadoFactura = estado;
    }
    
    //CONSTRUCTOR INSERT FACTURA    
    public Factura(String tipo, String fecha, int cliente, String pago, Double total, String estado) {
        this.tipoFactura = tipo;
        this.fechaFactura = fecha;
        this.idCliente = cliente;
        this.formaPagoFactura = pago;
        this.totalFactura = total;
        this.estadoFactura = estado;
    }
    
    //CONSTRUCTOR INSERT DETALLE
    public Factura(int idFactura, int idProducto, int cantidad, Double pu, Double total) {
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.cantidadProducto = cantidad;
        this.precioUnitarioProducto = pu;
        this.totalProducto = total;
    }
    
    //GETTERS
    public int getIdFactura() { return idFactura; }
    public String getTipoFactura() { return tipoFactura; }
    public String getFechaFactura() { return fechaFactura; }
    public int getIdCliente() { return idCliente; }
    public String getFormaPagoFactura() { return formaPagoFactura; }
    public Double getTotalFactura() { return totalFactura; }
    public int getIdProducto() { return idProducto; }
    public int getCantidadProducto() { return cantidadProducto; }
    public Double getPrecioUnitarioProducto() { return precioUnitarioProducto; }
    public Double getTotalProducto() { return totalProducto; }
    public String getEstadoFactura() { return estadoFactura; }
    
    //SETTERS
    public void setIdFactura(int idFactura) { this.idFactura = idFactura; }
    public void setTipoFactura(String tipoFactura) { this.tipoFactura = tipoFactura; }
    public void setFechaFactura(String fechaFactura) { this.fechaFactura = fechaFactura; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
    public void setFormaPagoFactura(String formaPagoFactura) { this.formaPagoFactura = formaPagoFactura; }
    public void setTotalFactura(Double totalFactura) { this.totalFactura = totalFactura; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }
    public void setCantidadProducto(int cantidadProducto) { this.cantidadProducto = cantidadProducto; }
    public void setPrecioUnitarioProducto(Double precioUnitarioProducto) { this.precioUnitarioProducto = precioUnitarioProducto; }
    public void setTotalProducto(Double totalProducto) { this.totalProducto = totalProducto; }
    
    //SQL
    private static final String BDD = "jdbc:mysql://localhost:3306/proyectolab?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
   
    //SENTENCIAS MAESTRO
    private static final String SQL_SELECT_MAESTRO = "SELECT id_factura, tipo_factura, fecha_factura, id_cliente_factura, pago_factura, total_factura, estado_Factura FROM facturas";
    private static final String SQL_INSERT_MAESTRO = "INSERT INTO facturas(tipo_factura, fecha_factura, id_cliente_factura, pago_factura, total_factura, estado_factura) VALUES (?, ?, ?, ?, ?, ?)"; 
    private static final String SQL_UPDATE_MAESTRO = "UPDATE facturas SET estado_factura = ? WHERE id_factura = ?";
    
    //SENTENCIAS DETALLE
    private static final String SQL_SELECT_DETALLE = "SELECT id_producto, cantidad_producto, precio_producto, total_producto, nro_registro FROM detallefactura WHERE id_factura = ?";
    private static final String SQL_INSERT_DETALLE = "INSERT INTO detallefactura(id_factura, id_producto, cantidad_producto, pu_producto, total_producto) VALUES (?, ?, ?, ?, ?)";
    
    //SENTENCIAS CLIENTE
    private static final String SQL_SELECT_CLIENTE = "SELECT nombre_cliente, cuit_cliente, domicilio_cliente, localidad_cliente, cp_cliente, telefono_cliente, email_cliente, condicion_cliente FROM clientes WHERE id_cliente = ?";
    
    //SENTENCIAS PRODUCTO
    private static final String SQL_SELECT_PRODUCTO = "SELECT nombre_producto, precio_producto FROM productos WHERE id_producto = ?";
    
    //ACTUALIZAR ESTADO FACTIURA
    public static void modificarEstado(int id) throws ParseException, SQLException, ClassNotFoundException {
            Connection conn = getConnection(BDD);
            PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE_MAESTRO);
            
            stmt.setString(1, "ANULADO");
            stmt.setInt(2, id);
            
            boolean ejecutar = Conexion.ejecutar(stmt);
        }
    
    //DEVOLVER LISTADO MAESTRO
    public static ArrayList<Factura> seleccionarMaestro() throws ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        ResultSet rs;
        Factura factura;
        ArrayList facturas = new ArrayList<>();
        
        try {
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_SELECT_MAESTRO);
            rs = Conexion.devolverLista(stmt);
            
            while( rs.next() ) {
                int idFactura = rs.getInt("id_factura");
                String fechaFactura = (rs.getDate("fecha_factura")).toString();
                String tipoFactura = rs.getString("tipo_factura");
                int idCliente = rs.getInt("id_cliente_factura");
                String pagoFactura = rs.getString("pago_factura");
                Double totalFactura = rs.getDouble("total_factura");
                String estadoFactura = rs.getString("estado_factura");
        
                factura = new Factura(idFactura, fechaFactura, tipoFactura, idCliente, pagoFactura, totalFactura, estadoFactura);
               
                //agregamos la factura a la lista de maestro de facturas
                facturas.add(factura);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        return facturas;
    }
    
    //DEVOLVER CLIENTE POR ID
    public static Cliente devolverCliente(int id) throws SQLException, ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        Cliente cliente = null;
        ResultSet rs;
       
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_SELECT_CLIENTE);
            stmt.setInt(1, id);
            
            rs = Conexion.devolverLista(stmt);      
 
            while (rs.next()) {
            String nombreCliente = rs.getString("nombre_cliente");
            int cuitCliente = rs.getInt("cuit_cliente");
            String domicilioCliente = rs.getString("domicilio_cliente");
            String localidadCliente = rs.getString("localidad_cliente");
            int cpCliente = rs.getInt("cp_cliente");
            int telefonoCliente = rs.getInt("telefono_cliente");
            String emailCliente = rs.getString("email_cliente");
            String condicionCliente = rs.getString("condicion_cliente");
        
            cliente = new Cliente(nombreCliente, cuitCliente, domicilioCliente, localidadCliente, cpCliente, telefonoCliente, emailCliente, condicionCliente);
            }
            
        return cliente;
    }
    
    //DEVOLVER PRODUCTO POR ID
    public static Producto devolverProducto(int id) throws SQLException, ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        ResultSet rs;
        Producto producto = null;
        
       
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_SELECT_PRODUCTO);
            stmt.setInt(1, id);
            
            rs = Conexion.devolverLista(stmt);      
 
            while (rs.next()) {
            String nombreProducto = rs.getString("nombre_producto");
            Double precioProducto = rs.getDouble("precio_producto");
            
            producto = new Producto(nombreProducto, precioProducto);
            }
            
        return producto;
    }
    
    //DEVOLVER DETALLE POR ID DE FACTURA
    public static ArrayList<Factura> seleccionarDetalle(int id) throws ClassNotFoundException, SQLException {
            Connection conn;
            PreparedStatement stmt;
            ResultSet rs;          
            ArrayList facturas = new ArrayList<>();
            
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_SELECT_DETALLE);
            stmt.setInt(1, id);
            
            rs = Conexion.devolverLista(stmt);
            
            while (rs.next()) {
                int nroRegistro = rs.getInt("nro_registro");
                int idProducto = rs.getInt("id_producto");
                int cantidadProducto = rs.getInt("cantidad_producto");
                Double puProducto = rs.getDouble("precio_producto");
                Double totalProducto = rs.getDouble("total_producto");
                
                Factura factura = new Factura(nroRegistro, idProducto, cantidadProducto, puProducto, totalProducto);
                facturas.add(factura);
            }            
        
         return facturas;
    }
    
    //INSERTAR MAESTRO Y DETALLE    
    public static void insertarMaestro(Factura factura) throws ParseException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stmtMaestro = null;
        
        try {
            String fechaFactura = factura.getFechaFactura();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilFechaFactura = sdf1.parse(fechaFactura);
            java.sql.Date sqlFechaFactura = new java.sql.Date(utilFechaFactura.getTime());
            
            conn = getConnection(BDD);
            stmtMaestro = conn.prepareStatement(SQL_INSERT_MAESTRO);
            
            //INSERT MAESTRO
            stmtMaestro.setString(1, factura.getTipoFactura());
            stmtMaestro.setString(2, factura.getFechaFactura());
            stmtMaestro.setInt(3, factura.getIdCliente());
            stmtMaestro.setString(4, factura.getFormaPagoFactura());
            stmtMaestro.setDouble(5, factura.getTotalFactura());
            stmtMaestro.setString(6, factura.getEstadoFactura());
            
            boolean ejecutarMaestro = Conexion.ejecutar(stmtMaestro);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void insertarDetalle(Factura factura) throws ParseException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stmtDetalle = null;
        
        try {
            conn = getConnection(BDD);
            stmtDetalle = conn.prepareStatement(SQL_INSERT_DETALLE);

            //INSERT DETALLE
            stmtDetalle.setInt(1, factura.getIdFactura());
            stmtDetalle.setInt(2, factura.getIdProducto());
            stmtDetalle.setInt(3, factura.getCantidadProducto());
            stmtDetalle.setDouble(4, factura.getPrecioUnitarioProducto());
            stmtDetalle.setDouble(5, factura.getTotalProducto());
            
            boolean ejecutarDetalle = Conexion.ejecutar(stmtDetalle);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    } 
}
