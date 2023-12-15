package Ejercicio3;

/**
 *
 * @author chris
 */
public class Gerente extends Empleado {

    public Gerente(String nombre, String apellido, String cedula, double salario) {
        super(nombre, apellido, cedula, salario);
    }

    @Override
    public void realizarAccion() {
        System.out.println("Gerente: revisando operaciones bancarias");
    }
}
