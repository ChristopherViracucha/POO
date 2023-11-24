package Ejercicioclase;

import java.util.Scanner;
import java.lang.Math;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, s): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.printf("%.1f %c %.1f = %.1f%n", num1, operator, num2, num1 + num2);
                break;

            case '-':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.printf("%.1f %c %.1f = %.1f%n", num1, operator, num2, num1 - num2);
                break;

            case '*':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.printf("%.1f %c %.1f = %.1f%n", num1, operator, num2, num1 * num2);
                break;

            case '/':
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    System.out.printf("%.1f %c %.1f = %.1f%n", num1, operator, num2, num1 / num2);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            case 's':
                System.out.printf("sin(%.1f) = %.1f%n", num1, Math.sin(Math.toRadians(num1)));
                break;

            // operator doesn't match any case constant (+, -, *, /, s)
            default:
                System.out.println("Error! Invalid operator. Please enter correct operator.");
                break;
        }

        scanner.close();
    }
}














