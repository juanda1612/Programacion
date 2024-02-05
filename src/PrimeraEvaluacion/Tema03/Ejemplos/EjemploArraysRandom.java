package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Arrays;
import java.util.Random;

public class EjemploArraysRandom {
    public static void main(String[] args) {
        Random generador = new Random();
        int[] numeros = new int[100];

        int max = 1000;
        int min = -1000;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generador.nextInt(min, max + 1);
        }

        System.out.print(Arrays.toString(numeros));

        // lo ordena para ver claramente cual es el numero menor y mayor
        System.out.println();
        Arrays.sort(numeros);
        System.out.print(Arrays.toString(numeros));

    }
}
