package ejercicios.ejerciciosStream.ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
/*
Crea una lista de enteros con 20 elementos aleatorios entre 1 y 15. Utilizando streams, haz lo siguiente:
 */

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        Supplier<Integer> random = () -> generador.nextInt(1,16);
        for (int i = 0; i < 20; i++) {
            numeros.add(random.get());
        }
        // Imprime todos los elementos de la lista, sin ordenar.
        System.out.println("\nSIN ORDENAR");
        numeros.stream()
                .forEach(numero -> System.out.print(numero + " "));

        //Imprime todos los elementos de la lista, ordenados.
        System.out.println("\nORDENADO");
        numeros.stream()
                .sorted((o1, o2) -> o1-o2)
                .forEach(numero -> System.out.print(numero + " "));

        //Imprime todos los elementos de la lista, sin repetir, ordenados.
        System.out.println("\nSIN REPETIR, ORDENADO");
        numeros.stream()
                .distinct()
                .sorted()
                .forEach(numero -> System.out.print(numero + " "));

        //Imprime sólo los mayores o iguales a 5 distintos entre sí.
        System.out.println("\nMAYOR O IGUAL A 5");
        numeros.stream()
                .distinct()
                .filter(numero -> numero>= 5)
                .forEach(numero -> System.out.print(numero + " "));

        //Imprime sólo los mayores o iguales a 5 distintos entre sí, ordenados.
        System.out.println("\nMAYOR O IGUAL A 5, ORDENADO");
        numeros.stream()
                .distinct()
                .filter(numero -> numero>= 5)
                .sorted()
                .forEach(numero -> System.out.print(numero + " "));

        //Imprime sólo los mayores o iguales a 5 distintos entre sí, ordenados inversamente.
        System.out.println("\nMAYOR O IGUAL A 5, ORDENADO INVERSO");
        numeros.stream()
                .distinct()
                .filter(numero -> numero>= 5)
                .sorted(Comparator.reverseOrder())
                .forEach(numero -> System.out.print(numero + " "));

        //Suma todos los elementos de la lista.
        System.out.println("\nSUMADOS");
        System.out.println(numeros.stream()
                                  .mapToInt(numero-> numero)
                                  .sum());

        //Suma todos los elementos mayores o iguales a 5(también los que se repitan).
        System.out.println("\nSUMADO MAYOR A 5");
        System.out.println(numeros.stream()
                                  .filter(numero -> numero>= 5)
                                  .mapToInt(numero-> numero)
                                  .sum());

        //Calcula el promedio de todos los elementos de la lista(sin eliminar los repetidos).
        System.out.println("\nPROMEDIO DE LA LISTA");
        System.out.println(numeros.stream()
                                  .mapToDouble(numero-> numero)
                                  .average().orElse(0));
    }
}
