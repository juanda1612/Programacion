package teoria.biblioteca;

import java.util.Comparator;

public class CompararFechasNacimiento implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio socio1 = (Socio) o1;
        Socio socio2 = (Socio) o2;
        if (socio1.getFechaNac().isBefore(socio2.getFechaNac())){
            return -1;
        } else if (socio1.getFechaNac().isAfter(socio2.getFechaNac())) {
            return 1;
        }else {
            return 0;
        }
    }
}
