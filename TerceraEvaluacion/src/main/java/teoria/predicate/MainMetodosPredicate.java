package teoria.predicate;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainMetodosPredicate {
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

        socios.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
        System.out.println(socios);
        // vamos a ordenar por nombre

        System.out.println("\nSin el nombre por B");
        socios.removeIf(socio -> socio.getNombre().startsWith("B"));
        System.out.println(socios);

        // lo metemos dentro
        socios.add(socio2);

        // elimicamos los socion que han nacido antes del siglo XXI
        System.out.println("\nSin los nacidos antes del Siglo XXI");
        socios.removeIf(socio -> socio.getFechaNac().isBefore(LocalDate.of(2000,1,1)));
        System.out.println(socios);

        socios.stream().filter(socio -> socio.getNombre().startsWith("A"));
        System.out.println(socios);

    }
}
