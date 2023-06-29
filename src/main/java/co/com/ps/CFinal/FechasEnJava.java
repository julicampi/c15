package co.com.ps.CFinal;

import java.util.Calendar;
import java.util.Date;

public class FechasEnJava {
    public static void main(String[] args) {
     /*   Date fechaActual = new Date();
        System.out.println("Fecha y hora actual: " + fechaActual);
*/
        Calendar calendar = Calendar.getInstance();

        // Obtener información específica de la fecha actual
        int ano = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH) + 1; // Los meses comienzan en 0, se suma 1
        int día = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Fecha actual: " + día + "/" + mes + "/" + ano);

        // Agregar 7 días a la fecha actual
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        Date nuevaFecha = calendar.getTime();
        System.out.println("Fecha después de agregar 7 días: " + nuevaFecha);
    }
}
