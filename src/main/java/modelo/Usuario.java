package modelo;

public class Usuario {
    private String usuario;
    private String contraseña;
    
    public Usuario() {
        super();
        this.usuario = null;
        this.contraseña = null;
    }

    public Usuario(String usuario, String contraeña) {
        super();
        this.usuario = usuario;
        this.contraseña = contraeña;
    }


    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    @Override
    public String toString() {
        return "Usuario [usuario=" + usuario + ", contraseña=" + contraseña + "]";
    }
}