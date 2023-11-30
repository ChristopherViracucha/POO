package Excepciones;

/**
 *
 * @author chris
 */
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado;
        String operacion;

        System.out.println("Ingrese el primer número:");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = scanner.nextInt();

        System.out.println("Ingrese la operación (+, -, *, /):");
        operacion = scanner.next();

        try {
            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new Exception("No se puede dividir por cero.");
                    }
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                default:
                    throw new Exception("Operación no válida.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
