package ejercicios.ejerciciosLamda.ejercicio3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1");
        Predicate<Integer> ejercicio1 = multiplo -> multiplo % 5 == 0;
        System.out.println(ejercicio1.test(25));

        System.out.println("\nEJERCICIO 2");
        Predicate<String> ejercicio2 = s -> s.toLowerCase().endsWith("s");
        System.out.println(ejercicio2.test("HOLAS"));

        System.out.println("\nEJERCICIO 3");
        Predicate<Integer> ejercicio3 = par -> (par % 2 == 0) && (par % 3 == 0);
        System.out.println(ejercicio3.test(30));

        System.out.println("\nEJERCICIO 4");
        Predicate<Character> ejercicio4 = mayus -> Character.isLetter(mayus) && Character.isUpperCase(mayus);
        System.out.println(ejercicio4.test('C'));

        System.out.println("\nEJERCICIO 5");
        Predicate<Integer> ejercicio5 = par -> (par % 2 == 1) && (par % 7 == 0);
        System.out.println(ejercicio5.test(7));

        System.out.println("\nEJERCICIO 6");
        Predicate<Integer> ejercicio6 = par -> (par % 2 == 1) || (par % 7 == 0);
        System.out.println(ejercicio6.test(11));
    }
}
