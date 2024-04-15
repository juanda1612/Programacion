package ejercicios.ejerciciosStream.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random generador = new Random();
        Supplier<Integer> random = () -> generador.nextInt(-20,21);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            numeros.add(random.get());
        }


        System.out.println("\nSTREAM POSITIVOS");
        Stream<Integer> numerosPositivo = numeros.stream().filter(numero -> numero >= 0).distinct();
        numerosPositivo.forEach(s -> System.out.print(s + " "));

        System.out.println("\nSTREAM NEGATIVOS");
        Stream<Integer> numerosNegativos = numeros.stream().filter(numero -> numero < 0).distinct();
        numerosNegativos.forEach(s -> System.out.print(s + " "));

        System.out.println("\nSTREAM CONTAR NUMEROS");
        Stream<Integer> contarNumeros = numeros.stream().filter(n -> n >= -10 && n <= 10).distinct();
        System.out.println(contarNumeros.count());



    }
}
