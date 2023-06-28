package co.com.ps.c7;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ClaseLogsYStream {
    private static final Logger logger = Logger.getLogger(ClaseLogsYStream.class.getName());

    public static void main(String[] args) {
        System.out.println("Este es un mensaje de información");
        logger.info("Este es un mensaje de información");
        logger.warning("Este es un mensaje de advertencia");
        logger.severe("Este es un mensaje de error grave");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       /* for (Integer numero:numbers) {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        }
        */
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        List<String> strings = Arrays.asList("Hola", "Mundo", "Java", "Stream");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        strings.stream()
                .map(String::length)  // Mapear cada cadena a su longitud
                .forEach(System.out::println);  // Imprimir las longitudes

        List<String> nombres = Arrays.asList("Juan", "María", "Carlos");
        List<String> nombresOrdenados = nombres.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nombresOrdenados); // Output: [Carlos, Juan, María]

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        long cantidad = numeros.stream()
                .count();
        System.out.println(cantidad); // Output: 5


    }


}
