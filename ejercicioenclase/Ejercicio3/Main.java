
package Ejercicio3;

/**
 *
 * @author chris
 */
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan", "Perez", "12345678", 3000);
        Cajero cajero = new Cajero("María", "Rodríguez", "23456789", 2500);
        Cliente cliente = new Cliente("Carlos", "Sánchez", "34567890", 5000);

        gerente.realizarAccion();
        cajero.realizarAccion();
        cliente.depositar(1000);
        cliente.retirar(500);

        System.out.println("Saldo del cliente: " + cliente.getSaldo());
    }
}