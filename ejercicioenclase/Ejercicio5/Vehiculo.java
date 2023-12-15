package Ejercicio5;

/**
 *
 * @author chris
 */
public abstract class Vehiculo {
    private String marca;
    private String color;

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public abstract void encender();
    public abstract void apagar();
}
