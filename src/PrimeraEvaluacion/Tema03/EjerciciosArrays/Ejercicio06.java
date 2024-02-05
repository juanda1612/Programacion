package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Realizar un programa en el se se inicialice un array de longitud 20 con números aleatorios comprendidos entre -10 y 10. A continuación, mostrar la media de los números positivos,la media de los negativos y contar el número de ceros.

 */

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {
    public static void main(String[] args) {
        Random generador = new Random();
        int[] numeros = new int[10];

        int[] numerosPositivo = new int[numeros.length];
        int[] numerosNegativo = new int[numeros.length];
        int[] numerosCero = new int[numeros.length];
        int  indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generador.nextInt(-10, 10);
        }

        System.out.print("los numeros son: " + Arrays.toString(numeros));
        System.out.print("\n los numeros Positivos son: " + Arrays.toString(numerosPositivo));
        System.out.print("\n los numeros Negativos son : " + Arrays.toString(numerosNegativo));
        System.out.print("\n los ceros son: " + Arrays.toString(numerosCero));
    }
}
