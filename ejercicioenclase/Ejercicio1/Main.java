package Ejercicio1;

/**
 *
 * @author chris
 */
public class Main {

    public static void main(String[] args) {
        int n = 10; //Número de terminos de la serie de Fibonacci
        int a = 0, b = 1;
        
        System.out.println("La serie de Fibonacci de" + n + "terminos es:" );
        
        for (int i = 1; i <= n; ++i){
            System.out.print(a+"");
            int suma = a+b;
            a = b;
            b = suma;
        }
    }
    
}
