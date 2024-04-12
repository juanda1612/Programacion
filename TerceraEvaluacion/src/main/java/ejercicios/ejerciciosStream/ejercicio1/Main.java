package ejercicios.ejerciciosStream.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        Supplier<Integer> random = generador.nextInt(1,16);
        for (int i = 0; i < 20; i++) {
            numeros.add(random)
        }

    }
}
