package co.com.ps.c4;

public class Estudiante {

    private String nombre;
    private Double nota;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Estudiante(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
}
