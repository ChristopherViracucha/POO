package Ejercicio3;

/**
 *
 * @author chris
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private String cedula;

    public Persona(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }
}
