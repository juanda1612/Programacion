package teoria.consumer;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

import static java.lang.System.*;

public class MainConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer1 = nombre -> out.println("Hola " + nombre);
        consumer1.accept("Ivan");

        ArrayList<Integer> numeros = new ArrayList<>();
        Random generador = new Random();

        for (int i = 0; i < 25; i++) {
            numeros.add(generador.nextInt(1,1001));
        }

        out.println("\n SIN ORDENAR");
        numeros.forEach(MainConsumer::accept);

        out.println("\n ORDENADOS");
        numeros.sort((o1, o2) -> o1-o2);
        numeros.forEach(out::println);

        out.println("\n CON STREAM");
        numeros.stream().sorted((o1, o2) -> o2-o1).forEach(numero -> out.println(numero));

        out.println("\n PARES ORDENADOS");
        numeros.stream().filter(integer -> integer%2 == 0).sorted((o1, o2) -> o2-o1).forEach(out::println);
    }

    private static void accept(Integer numero) {
        out.println(numero + " ");
    }
}
