package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

   public class Conexion {
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    //método para acceder a la base de datos
    public static Connection getConnection(String bdd) throws SQLException, ClassNotFoundException{
        return DriverManager.getConnection(bdd, JDBC_USER, JDBC_PASSWORD);
    }
    
    //metodo ejecutar insertar, actualizar, eliminar
    public static boolean ejecutar(PreparedStatement stmt) throws SQLException {
        stmt.executeUpdate();
        return true;
    }
    
    //metodo regresar listado
    public static ResultSet devolverLista (PreparedStatement stmt) throws SQLException {
        ResultSet rs = stmt.executeQuery();
        return rs;
    } 
}
