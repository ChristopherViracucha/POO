package Ejercicio5;

/**
 *
 * @author chris
 */
public class Moto extends Vehiculo {
    private double cilindrada;

    public Moto(String marca, String color, double cilindrada) {
        super(marca, color);
        this.cilindrada = cilindrada;
    }

    public void encender() {
        System.out.println("Encendiendo la moto");
    }

    public void apagar() {
        System.out.println("Apagando la moto");
    }

    public void acelerar() {
        System.out.println("La moto acelera");
    }
}
