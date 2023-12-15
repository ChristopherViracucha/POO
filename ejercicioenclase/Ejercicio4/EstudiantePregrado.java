package Ejercicio4;

/**
 *
 * @author chris
 */
public class EstudiantePregrado extends Estudiante {
    private int semestre;

    public EstudiantePregrado(String nombre, String apellido, String carrera, int semestre) {
        super(nombre, apellido, carrera);
        this.semestre = semestre;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Estudiante pregrado: " + getNombre() + " " + getApellido());
        System.out.println("Carrera: " + getCarrera());
        System.out.println("Semestre: " + semestre);
    }
}
