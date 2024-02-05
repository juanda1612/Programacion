package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’) de cinco enteros cada uno, pida valores para ‘a1’ y ‘a2’ y calcule los elementos de a3 así: a3=a1+a2.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] a1 = new  int[5];
        int[] a2 = new  int[5];
        int[] a3 = new  int[5];
        for (int i = 0; i < 5; i++) {
            a1[i] = teclado.nextInt();
            a2[i] = teclado.nextInt();
        }
        System.out.println("numeros introducidos a1:" + Arrays.toString(a1));
        System.out.println("Numeros introducidos a2" + Arrays.toString(a2));
        for (int i = 0; i < 5; i++) {
            a3[i] = a1[i] + a2[i];
        }
        System.out.println("Suma:");
        System.out.print(Arrays.toString(a3));

    }
}
