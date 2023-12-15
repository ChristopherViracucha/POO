package Ejercicio2;

/**
 *
 * @author chris
 */
public class Bodega {
    private String [] productos;
    
    public Bodega(int cantidadProductos){
        productos = new
            String[cantidadProductos];
    }
    public void agregarProducto(String producto){
        for (int i = 0; i < productos.length; i++){
            if (productos [i] == null) {
                productos [i] = producto;
                break;
            }
        }
    }
    public void imprimirProductos(){
        for (String producto :productos){
            if (producto != null){
                System.out.println("producto");
            }
        }
    }
}
