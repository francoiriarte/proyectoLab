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

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String marcaProducto;
    private String categoriaProducto;
    private String proveedorProducto;
    private Double precioProducto;
    private int stockProducto;
    private String fechaAltaProducto;
    private boolean promocionProducto;
    
    //CONSTRUCTOR PARA SELECCIONAR LISTA DE DATOS
    public Producto(int id, String nombre, String marca, String categoria, String proveedor, Double precio, int stock, String fecha, boolean promocion) {
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.marcaProducto = marca;
        this.categoriaProducto = categoria;
        this.proveedorProducto = proveedor;
        this.precioProducto = precio;
        this.stockProducto = stock;
        this.fechaAltaProducto = fecha;
        this.promocionProducto = promocion;
    }
    
    //CONSTRUCTOR PARA CARGAR
    public Producto(String nombre, String marca, String categoria, String proveedor, Double precio, int stock, String fecha, boolean promocion) {
        this.nombreProducto = nombre;
        this.marcaProducto = marca;
        this.categoriaProducto = categoria;
        this.proveedorProducto = proveedor;
        this.precioProducto = precio;
        this.stockProducto = stock;
        this.fechaAltaProducto = fecha;
        this.promocionProducto = promocion;
    }
    
    //CONSTRUCTOR PARA MODIFICAR DATOS
    public Producto(int id, String nombre, String marca, String categoria, String proveedor, Double precio, int stock, boolean promocion) {
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.marcaProducto = marca;
        this.categoriaProducto = categoria;
        this.proveedorProducto = proveedor;
        this.precioProducto = precio;
        this.stockProducto = stock;
        this.promocionProducto = promocion;
    }
    
    //CONSTRUCTOR PARA BORRAR
    public Producto (int id) {
        this.idProducto = id;
    }

    Producto(String nombreProducto, Double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }
    
    //GETTERS
    public int getIdProducto() { return idProducto; }
    public String getNombreProducto() { return nombreProducto; }
    public String getMarcaProducto() { return marcaProducto; }
    public String getCategoriaProducto() { return categoriaProducto; }
    public String getProveedorProducto() { return proveedorProducto; }
    public Double getPrecioProducto() { return precioProducto; }
    public int getStockProducto() { return stockProducto; }
    public String getFechaAltaProducto() { return fechaAltaProducto; }
    public boolean isPromocionProducto() { return promocionProducto; }
    
    //SETTERS
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }
    public void setMarcaProducto(String marcaProducto) { this.marcaProducto = marcaProducto; }
    public void setCategoriaProducto(String categoriaProducto) { this.categoriaProducto = categoriaProducto; }
    public void setProveedorProducto(String proveedorProducto) { this.proveedorProducto = proveedorProducto; }
    public void setPrecioProducto(Double precioProducto) { this.precioProducto = precioProducto; }
    public void setFechaAltaProducto(String fechaProducto) { this.fechaAltaProducto = fechaProducto; }
    public void setStockProducto(int stockProducto) { this.stockProducto = stockProducto; }
    public void setPromocionProducto(boolean promocionProducto) { this.promocionProducto = promocionProducto; }
        
    //SQL
    private static final String BDD = "jdbc:mysql://localhost:3306/proyectolab?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String SQL_SELECT = "SELECT id_producto, nombre_producto, marca_producto, categoria_producto, proveedor_producto, precio_producto, stock_producto, fechadealta_producto, promocion_producto FROM productos";
    private static final String SQL_INSERT = "INSERT INTO productos(nombre_producto, marca_producto, categoria_producto, proveedor_producto, precio_producto, stock_producto, fechadealta_producto, promocion_producto) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; 
    private static final String SQL_UPDATE = "UPDATE productos SET nombre_producto = ?, marca_producto = ?, categoria_producto = ?, proveedor_producto = ?, precio_producto = ?, stock_producto = ?, promocion_producto = ? WHERE id_producto = ?";
    private static final String SQL_DELETE = "DELETE FROM productos WHERE id_producto = ?";
    
    //REGRESAR LISTA DE PRODUCTOS
    public static ArrayList<Producto> seleccionar() throws ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        ResultSet rs;
        Producto producto;
        ArrayList productos = new ArrayList<>();
        
        try {
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = Conexion.devolverLista(stmt);
            
            while( rs.next() ) {
                int idProducto = rs.getInt("id_producto");
                String nombreProducto = rs.getString("nombre_producto");
                String marcaProducto = rs.getString("marca_producto");
                String categoriaProducto = rs.getString("categoria_producto");
                String proveedorProducto = rs.getString("proveedor_producto");
                Double precioProducto = rs.getDouble("precio_producto");
                int stockProducto = rs.getInt("stock_producto");
                boolean promocionProducto = rs.getBoolean("promocion_producto");
        
                producto = new Producto(idProducto, nombreProducto, marcaProducto, categoriaProducto, proveedorProducto, precioProducto, stockProducto, promocionProducto);
                productos.add(producto);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        return productos;
    }
    
    //INSERTAR PRODUCTO    
    public static void insertar(Producto producto) throws ParseException, ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        
        try {
            String fechaAlta = producto.getFechaAltaProducto();
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilFechaAlta = sdf1.parse(fechaAlta);
            java.sql.Date sqlFechaAlta = new java.sql.Date(utilFechaAlta.getTime());
            
            boolean promo;
            if (producto.isPromocionProducto() == true) { promo = true; } else { promo = false; }
            
            conn = getConnection(BDD);
            stmt = conn.prepareStatement(SQL_INSERT);
            
            stmt.setString(1, producto.getNombreProducto());
            stmt.setString(2, producto.getMarcaProducto());
            stmt.setString(3, producto.getCategoriaProducto());
            stmt.setString(4, producto.getProveedorProducto());
            stmt.setDouble(5, producto.getPrecioProducto());
            stmt.setInt(6, producto.getStockProducto());         
            stmt.setDate(7, sqlFechaAlta);
            stmt.setBoolean(8, promo);
            
            boolean ejecutar = Conexion.ejecutar(stmt);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    //MODIFICAR PRODUCTO
        public static void modificar(Producto producto) throws ParseException, SQLException, ClassNotFoundException {
            Connection conn = getConnection(BDD);
            PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE);
            
            try {    
                boolean promo;
                if (producto.isPromocionProducto() == true) { promo = true; } else { promo = false; }
            
                stmt.setString(1, producto.getNombreProducto());
                stmt.setString(2, producto.getMarcaProducto());
                stmt.setString(3, producto.getCategoriaProducto());
                stmt.setString(4, producto.getProveedorProducto());
                stmt.setDouble(5, producto.getPrecioProducto());
                stmt.setInt(6, producto.getStockProducto());
                stmt.setBoolean(7, promo);
                stmt.setInt(8, producto.getIdProducto());
                
                boolean ejecutar = Conexion.ejecutar(stmt);
                
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
    //ELIMINAR PRODUCTO    
        public static void eliminar(Producto producto) throws ClassNotFoundException {
            Connection conn;
            PreparedStatement stmt;

            try {
                conn = getConnection(BDD);
                stmt = conn.prepareStatement(SQL_DELETE);
                stmt.setInt(1, producto.getIdProducto());

                boolean ejecutar = Conexion.ejecutar(stmt);

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
}
