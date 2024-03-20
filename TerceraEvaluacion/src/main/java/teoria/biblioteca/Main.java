package teoria.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Caleb", "Calvo", LocalDate.of(2000,12,1));
        Socio socio2 = new Socio("Blas", "Bles", LocalDate.of(2010,12,1));
        Socio socio3 = new Socio("Fermin", "fez", LocalDate.of(1999,1,1));
        Socio socio4 = new Socio("Alba", "Alvarez", LocalDate.of(2005,10,1));

        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
        System.out.println("\nORDEN NATURAL");
        for(Socio socio: socios){
            System.out.println(socio);
        }

        System.out.println("\nCON COMPARABLE");
        Collections.sort(socios);

        for(Socio socio: socios){
            System.out.println(socio);
        }

        System.out.println("\nCON COMPARATOR");

        CompararFechasNacimiento comparador = new CompararFechasNacimiento();

        socios.sort(comparador);
        for (Socio elemento : socios){
            System.out.println(elemento);
        }

        System.out.println("\nCON COMPARATOR INVERSO");
        socios.sort(comparador.reversed());
        for (Socio elemento : socios){
            System.out.println(elemento);
        }
    }
}
