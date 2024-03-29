package modelo;

public class Alumno {
    private String numControl;
    private String nombre;
    private String PrimerAp;
    private String segundoAp;
    private byte edad;
    private byte semestre;
    private String carrera;

    public Alumno() {
        super();
        this.numControl = null;
        this.nombre = null;
        this.PrimerAp = null;
        this.segundoAp = null;
        this.edad = 0;
        this.semestre = 0;
        this.carrera = null;
    }

    public Alumno(String numControl, String nombre, String primerAp, String segundoAp, byte edad, byte semestre, String carrera) {
        super();
        this.numControl = numControl;
        this.nombre = nombre;
        this.PrimerAp = primerAp;
        this.segundoAp = segundoAp;
        this.edad = edad;
        this.semestre = semestre;
        this.carrera = carrera;
    }


    public String getNumControl() {
        return numControl;
    }
    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerAp() {
        return PrimerAp;
    }
    public void setPrimerAp(String primerAp) {
        this.PrimerAp = primerAp;
    }

    public String getSegundoAp() {
        return segundoAp;
    }
    public void setSegundoAp(String segundoAp) {
        this.segundoAp = segundoAp;
    }

    public byte getEdad() {
        return edad;
    }
    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
    public byte getSemestre() {
        return semestre;
    }
    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String toString() {
        return "Alumno [numControl=" + numControl + ", nombre=" + nombre + ", primerAp=" + PrimerAp + ", segundoAp="
            + segundoAp + ", edad=" + edad +", semestre=" + semestre + ", carrera=" + carrera + "]";
    }
}