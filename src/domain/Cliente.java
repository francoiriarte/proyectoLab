package domain;

import datos.Conexion;
import static datos.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private int cuitCliente;
    private String domicilioCliente;
    private String localidadCliente;
    private int cpCliente;
    private int telefonoCliente;
    private String emailCliente;
    private String condicionCliente;
    
    //CONSTRUCTOR PARA LEER Y MODIFICAR DATOS    
    public Cliente(int id, String nombre, int cuit, String domicilio, String localidad, int cp, int telefono, String email, String condicion) {
        this.idCliente = id;
        this.nombreCliente = nombre;
        this.cuitCliente = cuit;
        this.domicilioCliente = domicilio;
        this.localidadCliente = localidad;
        this.cpCliente = cp;
        this.telefonoCliente = telefono;
        this.emailCliente = email;
        this.condicionCliente = condicion;
    }
    
    //CONSTRUCTOR PARA INSERTAR DATOS    
    public Cliente(String nombre, int cuit, String domicilio, String localidad, int cp, int telefono, String email, String condicion) {
        this.nombreCliente = nombre;
        this.cuitCliente = cuit;
        this.domicilioCliente = domicilio;
        this.localidadCliente = localidad;
        this.cpCliente = cp;
        this.telefonoCliente = telefono;
        this.emailCliente = email;
        this.condicionCliente = condicion;
    }
    
    //CONSTRUCTOR PARA ELIMINAR
    public Cliente (int id) {
        this.idCliente = id;
    }
    
    //GETTERS
    public int getIdCliente() { return idCliente; }
    public String getNombreCliente() { return nombreCliente; }
    public int getCuitCliente() { return cuitCliente; }
    public String getDomicilioCliente() { return domicilioCliente; }
    public String getLocalidadCliente() { return localidadCliente; }
    public int getCpCliente() { return cpCliente; }
    public int getTelefonoCliente() { return telefonoCliente; }
    public String getEmailCliente() { return emailCliente; }
    public String getCondicionCliente() { return condicionCliente; }
    
    //SETTERS
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }
    public void setCuitCliente(int cuitCliente) { this.cuitCliente = cuitCliente; }
    public void setDomicilioCliente(String domicilioCliente) { this.domicilioCliente = domicilioCliente; }
    public void setLocalidadCliente(String localidadCliente) { this.localidadCliente = localidadCliente; }
    public void setCpCliente(int cpCliente) { this.cpCliente = cpCliente; }
    public void setTelefonoCliente(int telefonoCliente) { this.telefonoCliente = telefonoCliente; }
    public void setEmailCliente(String emailCliente) { this.emailCliente = emailCliente; }
    public void setCondicionCliente(String condicionCliente) { this.condicionCliente = condicionCliente; }
    
    //SQL
    private static final String BDD = "jdbc:mysql://localhost:3306/proyectolab?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
    private static final String SQL_SELECT = "SELECT id_cliente, nombre_cliente, cuit_cliente, domicilio_cliente, localidad_cliente, cp_cliente, telefono_cliente, email_cliente, condicion_cliente FROM clientes";
    private static final String SQL_INSERT = "INSERT INTO clientes(nombre_cliente, cuit_cliente, domicilio_cliente, localidad_cliente, cp_cliente, telefono_cliente, email_cliente, condicion_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; 
    private static final String SQL_UPDATE = "UPDATE clientes SET nombre_cliente = ?, cuit_cliente = ?, domicilio_cliente = ?, localidad_cliente = ?, cp_cliente = ?, telefono_cliente = ?, email_cliente = ?, condicion_cliente = ? WHERE id_cliente = ?";
    private static final String SQL_DELETE = "DELETE FROM clientes WHERE id_cliente = ?";
    
    //REGRESAR LISTA DE CLIENTES
    public static ArrayList<Cliente> seleccionar() throws ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        ResultSet rs;
        Cliente cliente;
        ArrayList clientes = new ArrayList<>();
        
        try {
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = Conexion.devolverLista(stmt);
            
            while( rs.next() ) {
                int idCliente = rs.getInt("id_cliente");
                String nombreCliente = rs.getString("nombre_cliente");
                int cuitCliente = rs.getInt("cuit_cliente");
                String domicilioCliente = rs.getString("domicilio_cliente");
                String localidadCliente = rs.getString("localidad_cliente");
                int cpCliente = rs.getInt("cp_cliente");
                int telefonoCliente = rs.getInt("telefono_cliente");
                String emailCliente = rs.getString("email_cliente");
                String condicionCliente = rs.getString("condicion_cliente");
        
                cliente = new Cliente(idCliente, nombreCliente, cuitCliente, domicilioCliente, localidadCliente, cpCliente, telefonoCliente, emailCliente, condicionCliente);
                //agregamos el producto a la lista de productos
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        return clientes;
    }
    
    //INSERTAR CLIENTE 
    public static void insertar (Cliente cliente) throws ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        
        try {            
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setString(1, cliente.getNombreCliente());
            stmt.setInt(2, cliente.getCuitCliente());
            stmt.setString(3, cliente.getDomicilioCliente());
            stmt.setString(4, cliente.getLocalidadCliente());
            stmt.setInt(5, cliente.getCpCliente());
            stmt.setInt(6, cliente.getTelefonoCliente());         
            stmt.setString(7, cliente.getEmailCliente());
            stmt.setString(8, cliente.getCondicionCliente());
            
            boolean ejecutar = Conexion.ejecutar(stmt);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    //MODIFICAR CLIENTE
    public static void modificar(Cliente cliente) throws ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        
        try {            
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_UPDATE);
            
            stmt.setString(1, cliente.getNombreCliente());
            stmt.setInt(2, cliente.getCuitCliente());
            stmt.setString(3, cliente.getDomicilioCliente());
            stmt.setString(4, cliente.getLocalidadCliente());
            stmt.setInt(5, cliente.getCpCliente());
            stmt.setInt(6, cliente.getTelefonoCliente());         
            stmt.setString(7, cliente.getEmailCliente());
            stmt.setString(8, cliente.getCondicionCliente());
            stmt.setInt(9, cliente.getIdCliente());
            
            boolean ejecutar = Conexion.ejecutar(stmt);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    //ELIMINAR PRODUCTO    
    public static void eliminar(Cliente cliente) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cliente.getIdCliente());
            
            boolean ejecutar = Conexion.ejecutar(stmt);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
