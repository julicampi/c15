package co.com.ps.c4;

public class ArreglosEnJava {

    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de enteros
        int[] numeros = new int[5];
        int[] numeros1={1,2,3,4,5};

        // TIPODEDATO[] NOMBREVARIABLE  = new TIPODEDATO[TAMANO]

        // Asignación de valores a los elementos del arreglo
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acceso y muestra de los elementos del arreglo
        System.out.println("Elementos del arreglo 'numeros':");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // Declaración e inicialización de un arreglo de cadenas
        String[] nombres = {"Juan", "María", "Pedro", "Luisa"};

        // Acceso y muestra de los elementos del arreglo
        System.out.println("\nElementos del arreglo 'nombres':");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombres[" + i + "] = " + nombres[i]);
        }

        // Uso de arreglos en expresiones y funciones
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("\nSuma de los elementos del arreglo 'numeros': " + suma);
        System.out.println("Promedio de los elementos del arreglo 'numeros': " + (suma / numeros.length));
    }





































}
