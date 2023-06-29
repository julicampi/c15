package co.com.ps.CFinal;

public class Prueba {
    public static void main(String[] args) {
        Carro carro = new Carro();
        String frenos = carro.frenos;

        DiaSemana dia = DiaSemana.VIERNES;

        if (dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("No es fin de semana");
        }

    }
}
