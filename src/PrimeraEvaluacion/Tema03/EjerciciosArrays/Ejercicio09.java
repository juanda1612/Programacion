package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Realizar un programa que declare un array y lo vaya llenando de números intoducidos por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los elementos que contiene (el número negativo sólo sirve para finalizar el programa, no entra en el array).
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamaño = teclado.nextInt();
        int[] array = new int[tamaño];

            for (int i = 0; i < array.length; i++) {
                do {
                    array[i] = teclado.nextInt();
                }while (array[i] > 0);
            }
        System.out.println(Arrays.toString(array));
    }
}
