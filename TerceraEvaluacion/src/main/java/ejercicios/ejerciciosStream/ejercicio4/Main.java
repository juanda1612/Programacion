package ejercicios.ejerciciosStream.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Clientes> clientes = new ArrayList<>();
        clientes.add(new Clientes("11111111A","Asdrúbal", LocalDate.of(2004,12,15)));
        clientes.add(new Clientes("22222222B","Benito", LocalDate.of(2001,5,6)));
        clientes.add(new Clientes("33333333C","Carlota", LocalDate.of(1988,7,9)));
        clientes.add(new Clientes("44444444D","Demetria", LocalDate.of(2003,10,10)));
        clientes.add(new Clientes("55555555E","Esperanza", LocalDate.of(1972,2,2)));



        clientes.stream().sorted((o1,o2) -> o2.getFechaNacimiento().compareTo(o1.getFechaNacimiento())).forEach(s -> System.out.println(s));
    }
}
