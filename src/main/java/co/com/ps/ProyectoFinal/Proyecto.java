package co.com.ps.ProyectoFinal;

import java.util.Scanner;

public class Proyecto {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la cálculadora básica");
        System.out.println("----------------------------------");

        boolean continuar = true;

        while (continuar) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nSeleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Potencia");
        System.out.println("5. División");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
        case 1:
        resultado = sumar(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);
        break;
        case 2:
        resultado = restar(num1, num2);
        System.out.println("El resultado de la resta es: " + resultado);
        break;
        case 3:
        resultado = multiplicar(num1, num2);
        System.out.println("El resultado de la multiplicación es: " + resultado);
        break;
        case 4:
        resultado = potencia(num1, num2);
        System.out.println("El resultado de la potencia es: " + resultado);
        break;
        case 5:
        if (num2 == 0) {
        System.out.println("No es posible dividir por cero.");
        } else {
        resultado = dividir(num1, num2);
        System.out.println("El resultado de la división es: " + resultado);
        }
        break;
default:
        System.out.println("Opción inválida.");
        break;
        }

        System.out.println("----------------------------------");
        System.out.print("¿Desea realizar otra operación? (S/N): ");
        String opcionContinuar = scanner.next();

        if (opcionContinuar.equalsIgnoreCase("N")) {
        continuar = false;
        }

        System.out.println();
        }

        System.out.println("¡Gracias por utilizar la calculadora!");
        scanner.close();
        }

public static double sumar(double num1, double num2) {
        return num1 + num2;
        }

public static double restar(double num1, double num2) {
        return num1 - num2;
        }

public static double multiplicar(double num1, double num2) {
        return num1 * num2;
        }

public static double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
        }

public static double dividir(double num1, double num2) {
        return num1 / num2;
        }
        }
