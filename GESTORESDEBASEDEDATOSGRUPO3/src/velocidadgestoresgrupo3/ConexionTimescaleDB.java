package velocidadgestoresgrupo3;
    
import java.sql.*;
import javax.swing.JOptionPane;
public class ConexionTimescaleDB {

    private Connection conexionBD;
    
    public Connection getConexion() {
        return conexionBD;
    }
    
    public void setConexion(Connection conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    public ConexionTimescaleDB conectar() {
        try {
            Class.forName("org.postgresql.Driver");
          
            String baseDeDatos = "jdbc:postgresql://localhost:5152/grupo3?autoReconnect=true&relaxAutoCommit=true";
            String usuario = "grupon3";
            String contraseña = "grupo3";
            
            conexionBD = DriverManager.getConnection(baseDeDatos, usuario, contraseña);
            
            if (conexionBD != null) {
                JOptionPane.showMessageDialog(null, "¡OK ESTÁS CONECTADO A TIMESCALEDB!");
            } else {
                JOptionPane.showMessageDialog(null, "Error en la Conexión..");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error en la Conexión..");
        }
        
        return this;
    }
    
    public boolean ejecutar(String sql) {
        try {
            Statement sentencia = getConexion().createStatement();
            sentencia.executeUpdate(sql);
            
            getConexion().commit();
            
            //sentencia.getConnection().setAutoCommit(false);
        } catch (SQLException e) {
            if (e.getErrorCode() == 0) {
                return false; // Por error "Cannot commit when autocommit is enabled"
            }
            JOptionPane.showMessageDialog(null, e.getErrorCode());
            return false;
        }
        
        return true;
    }
}

