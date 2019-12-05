/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionBD;

/**
 *
 * @author casas
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;;
import javax.swing.JOptionPane;
import modelo.Alumno;
import modelo.Usuario;


public class Conexion {
    private Connection conexion;
    private PreparedStatement pstm;
    private final static String DRIVER="com.mysql.cj.jdbc.Driver";
    private final static String URL="jdbc:mysql://localhost/Escuela?useTimezone=true&serverTimezone=UTC";
    ResultSet rs=null;
    private static Conexion conexionB;
    //public static Connection con=null;
    
    public static Conexion getConexion() {
        if (conexionB==null)
            conexionB=new Conexion();
        
        return conexionB;
    }
    
    private Conexion(){
        abrirConexion();
    }
    
    public final void abrirConexion(){
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, "Cristofer", "casas");			
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontro el controlador.\n" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conctar al servidor" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        finally {}
    }
    
    public void cerrarConexion(){
        try {
            pstm.close();
            conexion.close();
        }
        catch(SQLException e){}
    }
    
    public boolean ejecutarAlta(String sql, Alumno alumno) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, alumno.getNumControl());
            pstm.setString(2, alumno.getNombre());
            pstm.setString(3, alumno.getPrimerAp());
            pstm.setString(4, alumno.getSegundoAp());
            pstm.setByte(5, alumno.getEdad());
            pstm.setByte(6, alumno.getSemestre());
            pstm.setString(7, alumno.getCarrera());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public boolean ejecutarBaja(String sql, String numControl) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, numControl);
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
	
    public boolean ejecutarModificacion(String sql, Alumno alumno) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, alumno.getNombre());
            pstm.setString(2, alumno.getPrimerAp());
            pstm.setString(3, alumno.getSegundoAp());
            pstm.setByte(4, alumno.getEdad());
            pstm.setByte(5, alumno.getSemestre());
            pstm.setString(6, alumno.getCarrera());
            pstm.setString(7, alumno.getNumControl());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
    public boolean ejecutarInstruccion(String sql) {
        try {
            pstm=conexion.prepareStatement(sql);
            int ejecucion;
            ejecucion=pstm.executeUpdate(sql);
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }

    public ResultSet ejecutarConsultaNumControl(String sql, String numControl) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, numControl);
            rs=pstm.executeQuery();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar la consulta SQL" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        
        return rs;
    }

    public ResultSet ejecutarConsultaUsuarios(String sql, String usuario, String contraseña) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, contraseña);
            rs=pstm.executeQuery();
        }
        catch(SQLException e) {}
        return rs;
    }
        
    public boolean ejecutarAlta(String sql, Usuario usuario) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, usuario.getUsuario());
            pstm.setString(2, usuario.getContraseña());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
	
    public boolean ejecutarModificacion(String sql, Usuario usuario) {
        try {
            pstm=conexion.prepareStatement(sql);
            pstm.setString(1, usuario.getContraseña());
            pstm.setString(2, usuario.getUsuario());
            int ejecucion;
            ejecucion=pstm.executeUpdate();
            
            return ejecucion==1;
        }
        catch(SQLException e){return false;}
    }
    
}
