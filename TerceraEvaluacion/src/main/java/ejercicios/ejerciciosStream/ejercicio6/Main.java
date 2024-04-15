package ejercicios.ejerciciosStream.ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Random generador = new Random();
        Supplier<Integer> random = () -> generador.nextInt(0,1001);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numeros.add(random.get());
        }

        System.out.println("\nNUMERO MAYOR");
        System.out.println(numeros.stream().max(Comparator.naturalOrder()).orElseThrow());

        System.out.println("\nNUMERO MENOR");
        System.out.println(numeros.stream().min(Comparator.naturalOrder()).orElseThrow());

        System.out.println("\nSUMA");
        System.out.println(numeros.stream().reduce(0,(o1,o2) -> o1 + o2));

        // OTRA FORMA
        System.out.println(numeros.stream().mapToInt(n -> n).sum());

        System.out.println("\nPROMEDIO");
        System.out.println(numeros.stream()
                                  .mapToDouble(n ->n)
                                  .average().orElseThrow());

    }
}
