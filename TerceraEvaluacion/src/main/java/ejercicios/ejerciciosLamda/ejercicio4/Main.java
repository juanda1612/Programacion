package ejercicios.ejerciciosLamda.ejercicio4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1");
        Function<String, Integer> ejercicio1 = longitud -> longitud.length();
        System.out.println(ejercicio1.apply("Hola"));

        System.out.println("\nEJERCICIO 2");
        Function<Integer, Double> ejercicio2 = cuadrado -> Math.pow(cuadrado, 2);
        System.out.println(ejercicio2.apply(5));


        System.out.println("\nEJERCICIO 3");
        Function<Integer, Double> ejercicio3 = porcentaje -> porcentaje * 0.1;
        System.out.println(ejercicio3.apply(10));
    }
}
