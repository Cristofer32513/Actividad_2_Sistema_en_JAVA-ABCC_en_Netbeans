package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import conexionBD.Conexion;
import modelo.Usuario;

public class UsuarioDAO {
    Conexion conexion = Conexion.getConexion();
    
    public boolean agregarUsuario(Usuario usuario){
        boolean resultado;
        String sql="INSERT INTO Usuarios VALUES (?, ?)";

        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, usuario);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public boolean eliminarUsuario(String usuario){
        boolean resultado;
        String sql="DELETE FROM Usuarios WHERE usuario = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarBaja(sql, usuario);
        conexion.cerrarConexion();

        return resultado;
    }
	
    public boolean modificarUsuario(Usuario usuario){
        boolean resultado;
        String sql="UPDATE Usuarios SET Contraseña = ? WHERE Usuario = ?";

        conexion.abrirConexion();
        resultado = conexion.ejecutarModificacion(sql, usuario);
        conexion.cerrarConexion();
        
        return resultado;
    }
	
    public Usuario buscarUsuario(String usuario, String contraseña){
        Usuario usua=new Usuario ();
        String sql="SELECT * FROM Usuarios WHERE Usuario=? AND Contraseña=?";

        conexion.abrirConexion();
        ResultSet resultado=conexion.ejecutarConsultaUsuarios(sql, usuario, contraseña);
        try {
                resultado.last();
                usua.setUsuario(resultado.getString(1));
                usua.setContraseña(resultado.getString(2));
        }
        catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return usua;
    }
}