package co.com.ps.c4;

public class ArreglosBidimencionales {

    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo bidimensional de enteros
        int[][] matriz = new int[3][4];

        // Asignación de valores a los elementos del arreglo
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;

        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[1][3] = 8;

        matriz[2][0] = 9;
        matriz[2][1] = 10;
        matriz[2][2] = 11;
        matriz[2][3] = 12;

        // Acceso y muestra de los elementos del arreglo
        System.out.println("Elementos del arreglo bidimensional 'matriz':");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

        // Declaración e inicialización de un arreglo bidimensional de cadenas
        String[][] palabras = {{"Hola", "Mundo"}, {"Java", "es", "genial"}};

        // Acceso y muestra de los elementos del arreglo
        System.out.println("\nElementos del arreglo bidimensional 'palabras':");
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length; j++) {
                System.out.println("palabras[" + i + "][" + j + "] = " + palabras[i][j]);
            }
        }
    }
}
