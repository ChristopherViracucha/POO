package Ejercicio4;

/**
 *
 * @author chris
 */
public class Main {
    public static void main(String[] args) {
        EstudiantePregrado estudiantePregrado = new EstudiantePregrado("Christopher", "Viracucha", "Ingeniería en Sistemas", 2);
        EstudiantePosgrado estudiantePosgrado = new EstudiantePosgrado("Marta", "Suarez", "Maestría en Inteligencia Artificial", "Magíster en Inteligencia Artificial");

        estudiantePregrado.mostrarInfo();
        estudiantePosgrado.mostrarInfo();
    }
}
