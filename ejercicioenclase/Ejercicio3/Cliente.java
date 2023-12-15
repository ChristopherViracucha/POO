package Ejercicio3;

/**
 *
 * @author chris
 */
public class Cliente extends Persona {
    private double saldo;

    public Cliente(String nombre, String apellido, String cedula, double saldo) {
        super(nombre, apellido, cedula);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }
}
