package Ejercicio5;

/**
 *
 * @author chris
 */
public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String color, int numeroPuertas) {
        super(marca, color);
        this.numeroPuertas = numeroPuertas;
    }

    public void encender() {
        System.out.println("Encendiendo el carro");
    }

    public void apagar() {
        System.out.println("Apagando el carro");
    }

    public void frenar() {
        System.out.println("El carro frena");
    }
}
