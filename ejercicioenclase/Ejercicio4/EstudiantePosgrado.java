package Ejercicio4;

/**
 *
 * @author chris
 */
public class EstudiantePosgrado extends Estudiante {
    private final String titulo;

    public EstudiantePosgrado(String nombre, String apellido, String carrera, String titulo) {
        super(nombre, apellido, carrera);
        this.titulo = titulo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Estudiante posgrado: " + getNombre() + " " + getApellido());
        System.out.println("Carrera: " + getCarrera());
        System.out.println("Título: " + titulo);
    }
}
