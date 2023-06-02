package velocidadgestoresgrupo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionMariaDB {
    private Connection conexionBD;
    
    public Connection getConexion() {
        return conexionBD;
    }
    
    public void setConexion(Connection conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    public ConexionMariaDB conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            String baseDeDatos = "jdbc:mysql://localhost:3256/grupo3";
            String usuario = "grupo3";
            String contraseña = "grupo3";
            
            conexionBD = DriverManager.getConnection(baseDeDatos, usuario, contraseña); // Establece la conexión
            conexionBD.setAutoCommit(false);  // Deshabilita el autocommit

            if (conexionBD != null) {
                JOptionPane.showMessageDialog(null, "¡Conexión exitosa a MariaDB!");
            } else {
                JOptionPane.showMessageDialog(null, "Error en la conexión");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.getMessage());
        }
        
        return this;
    }
    
    public boolean ejecutar(String sql) {
        try {
            Statement sentencia;
            sentencia = getConexion().createStatement();
            sentencia.executeUpdate(sql);
            getConexion().commit();  // Confirmar la transacción
            sentencia.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        
        return true;
    }
}
