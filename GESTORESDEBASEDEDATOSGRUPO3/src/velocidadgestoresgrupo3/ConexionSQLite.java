package velocidadgestoresgrupo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionSQLite {

    private Connection conexionBD;
    
    public Connection getConexion() {
        return conexionBD;
    }
    
    public void setConexion(Connection conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    public ConexionSQLite conectar() {
        try {
            String baseDeDatos = "jdbc:sqlite:/home/kali/Escritorio/dtabase/dtabase.db";
            
            conexionBD = DriverManager.getConnection(baseDeDatos);
            
            if (conexionBD != null) {
                JOptionPane.showMessageDialog(null, "¡OK ESTÁS CONECTADO A SQLite!");
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
            conexionBD.setAutoCommit(false);
            java.sql.Statement sentencia = getConexion().createStatement();
            sentencia.executeUpdate(sql);
            
            getConexion().commit();
            
            sentencia.getConnection().setAutoCommit(true);
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
