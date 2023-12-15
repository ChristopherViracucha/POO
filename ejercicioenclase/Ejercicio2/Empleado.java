package Ejercicio2;

/**
 *
 * @author chris
 */
public class Empleado extends Persona {
    private String puesto;
    
    public Empleado(String nombre, int edad, String puesto) {
        super(nombre, edad);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
}
