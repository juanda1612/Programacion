package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y mezclarlos en un tercero de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
 */

import java.util.Arrays;
import java.util.Random;

public class Ejercicio12 {
    public static void main(String[] args) {
        Random generador = new Random();
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = generador.nextInt(1, 10);
            b[i] = generador.nextInt(1, 10);
        }
        System.out.println("Los numeros Aplicacion.md son: " + Arrays.toString(a));
        System.out.println("Los numeros b son: " + Arrays.toString(b));

        for (int i = 0; i < 10; i++) {
            int e = 1;
            c[i] = a[e - 1];
            for (int j = 1; j < 10; j++) {
                c[j] = b[j - 1];
                break;
            }
            e++;
            i = 1;
        }
        System.out.println("Los numeros c son: " + Arrays.toString(c));
    }
}
