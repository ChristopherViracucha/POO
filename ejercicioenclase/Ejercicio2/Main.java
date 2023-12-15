package Ejercicio2;

/**
 *
 * @author chris
 */
public class Main {
    
    public static void main(String[] args) {
       Persona persona = new Persona ("Christopher",20 );
        System.out.println("Nombre:" + persona.getNombre()+",Edad:" + persona.getEdad());
        
        Empleado empleado = new Empleado("Maria",25,"Desarrolladora");
        System.out.println("Nombre:" + empleado.getNombre()+ ",Edad:" + empleado.getEdad() + "Puesto:" + empleado.getPuesto());
        
        Bodega bodega = new Bodega(5);
        bodega.agregarProducto("Manzanas");
            bodega.agregarProducto("Pescado");
            bodega.imprimirProductos();
    }
    
}
