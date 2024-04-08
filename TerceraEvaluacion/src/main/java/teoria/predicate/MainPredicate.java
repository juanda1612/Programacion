package teoria.predicate;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        // utilizamos predicados cuando pasamos un valor por parametro y queremos que devuelva un boolean (true/false)
        // Ejemplo:
        Predicate<Integer> esMilenial = año -> 1981 <= año && año <= 1996;
        System.out.println(esMilenial.test(1985));


    }
}
