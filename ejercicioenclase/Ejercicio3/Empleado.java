package Ejercicio3;

/**
 *
 * @author chris
 */
public abstract class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, String apellido, String cedula, double salario) {
        super(nombre, apellido, cedula);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void realizarAccion();
}
