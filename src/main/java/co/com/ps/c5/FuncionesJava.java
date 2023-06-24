package co.com.ps.c5;

public class FuncionesJava {

    public static void main(String[] args) {
       saludar("Mauricio");
       suma(1,2);
       resta(1,2);


    }

    public static int suma(int a, int b) {
       return a + b;
    }

   public static int resta(int a , int b){
        return a-b;
    }

    public static void saludar(String nombre){
        System.out.println("Saludos a, "+nombre);
    }

}
