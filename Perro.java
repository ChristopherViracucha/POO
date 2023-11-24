package ejercicios;

/**
 *
 * @author chris
 */
public class Perro {
    String nombre;
    int edad; 
    String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
 public void comer (){
     System.out.println(this.nombre + "Empezo a comer");
 }
    
}
