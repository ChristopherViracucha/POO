package Ejercicio5;

/**
 *
 * @author chris
 */
public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda", "Rojo", 250);
        moto.encender();
        moto.apagar();
        moto.acelerar();

        Carro carro = new Carro("Toyota", "Blanco", 4);
        carro.encender();
        carro.apagar();
        carro.frenar();
    }
}
