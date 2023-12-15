package Ejercicio3;

/**
 *
 * @author chris
 */
public class Cajero extends Empleado {

    public Cajero(String nombre, String apellido, String cedula, double salario) {
        super(nombre, apellido, cedula, salario);
    }

    @Override
    public void realizarAccion() {
        System.out.println("Cajero: atendiendo a clientes");
    }
}
