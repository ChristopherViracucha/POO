package Ejercicio4;

/**
 *
 * @author chris
 */
public abstract class Estudiante {
    private String nombre;
    private String apellido;
    private String carrera;

    public Estudiante(String nombre, String apellido, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public abstract void mostrarInfo();
}

