package co.com.ps.c4;

public class ControlDeFlujo {

    public static void main(String[] args) {
        int numero = 10;


        // Ejemplo de if-else
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }




        String ruta = "Home";

        switch (ruta){
            case "amigos":
               System.out.println("www.facebook.com/amigos");
               break;
            case "Home":
                System.out.println("www.facebook.com/home");
                break;
            case "marketplace":
                System.out.println("www.facebook.com/marketplace");
                break;
        }


        // Ejemplo de switch
        String diaDeLaSemana = "lunes";
        switch (diaDeLaSemana) {
            case "lunes":
                System.out.println("Hoy es lunes.");
                break;
            case "martes":
                System.out.println("Hoy es martes.");
                break;
            case "miércoles":
                System.out.println("Hoy es miércoles.");
                break;
            case "jueves":
                System.out.println("Hoy es jueves.");
                break;
            case "viernes":
                System.out.println("Hoy es viernes.");
                break;
            case "sábado":
            case "domingo":
                System.out.println("¡Es fin de semana!");
                break;
            default:
                System.out.println("Día no válido.");
                break;
        }



    }
}
