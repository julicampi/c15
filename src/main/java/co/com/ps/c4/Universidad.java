package co.com.ps.c4;

public class Universidad {

    public static void main(String[] args) {

        String nombre = "Mauricio";
        Double nota=null;

        Estudiante estudiante = new Estudiante(nombre,nota);

        if (estudiante.getNota()==null){
            System.out.println("Revisar estudiante");
        }else if (estudiante.getNota()>=3){
            System.out.println("El estudiante gano");
        } else{
            System.out.println("El estuante perdio");
        }

    }
}
