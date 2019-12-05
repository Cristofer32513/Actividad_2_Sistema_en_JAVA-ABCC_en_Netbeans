package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import conexionBD.Conexion;
import modelo.Alumno;

public class AlumnoDAO {
    Conexion conexion = Conexion.getConexion();
    public boolean agregarAlumno(Alumno alumno){
        boolean resultado;
        String sql = "INSERT INTO Alumnos VALUES (?, ?, ?, ?, ?, ?, ?)";
        conexion.abrirConexion();
        resultado = conexion.ejecutarAlta(sql, alumno);
        conexion.cerrarConexion();
        
        return resultado;
    }

    public boolean eliminarAlumno(String numControl){
        boolean resultado;
        String sql = "DELETE FROM Alumnos WHERE Num_Control = ?";
        conexion.abrirConexion();
        resultado = conexion.ejecutarBaja(sql, numControl);
        conexion.cerrarConexion();
        
        return resultado;
    }

    public boolean modificarAlumno(Alumno alumno){
        boolean resultado;
        String sql = "UPDATE Alumnos SET Nombres = ?, Primer_Ap = ?, Segundo_Ap = ?, Edad = ?, Semestre = ?, Carrera = ? WHERE Num_Control = ?";
        conexion.abrirConexion();
        resultado = conexion.ejecutarModificacion(sql, alumno);
        conexion.cerrarConexion();
        
        return resultado;
    }

    public Alumno buscarAlumno(String numControl){
        Alumno alumno = new Alumno();
        String sql = "SELECT * FROM Alumnos WHERE Num_Control=?";
        conexion.abrirConexion();
        ResultSet resultado = conexion.ejecutarConsultaNumControl(sql, numControl);
        try {
            resultado.last();
            alumno.setNumControl(resultado.getString(1));
            alumno.setNombre(resultado.getString(2));
            alumno.setPrimerAp(resultado.getString(3));
            alumno.setSegundoAp(resultado.getString(4));
            alumno.setEdad(resultado.getByte(5));
            alumno.setSemestre(resultado.getByte(6));
            alumno.setCarrera(resultado.getString(7));
        }
        catch (SQLException e) {return null;}
        finally {conexion.cerrarConexion();}

        return alumno;
    }
}