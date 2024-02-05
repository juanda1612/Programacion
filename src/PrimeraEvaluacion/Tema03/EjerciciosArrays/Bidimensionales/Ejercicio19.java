package PrimeraEvaluacion.Tema03.EjerciciosArrays.Bidimensionales;
/*
Haz un programa que realice lo siguiente:
Crea un array bidimensional de 5x5 enteros y rellénalo con valores numéricos.
Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla.

 */

import java.util.Arrays;
import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        Random generador = new Random();
        int[][] numeros = new  int[5][5];
        int[] sumaFila = new int[5];
        int[] sumaColumna = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = generador.nextInt(1, 10);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumaFila[i] = sumaFila[i] + numeros[i][j];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(sumaFila));

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                sumaColumna[j] = sumaColumna[j] + numeros[i][j];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(sumaColumna));
    }
}
