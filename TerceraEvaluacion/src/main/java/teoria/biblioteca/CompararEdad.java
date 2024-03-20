package teoria.biblioteca;

import ejercicios.Persona;

import java.util.Comparator;

public class CompararEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Persona persona1 = (Persona) o1;
        Persona persona2 = (Persona) o2;
        if (persona1.getEdad() > persona2.getEdad()){
            return -1;
        } else if (persona1.getEdad() < persona2.getEdad()) {
            return 1;
        }else{
            return 0;
        }
    }
}
