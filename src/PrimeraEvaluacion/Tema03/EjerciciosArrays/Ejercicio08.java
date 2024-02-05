package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Realizar un programa que pida un tamaño de array por teclado y Aplicacion.md continuación cree un array formado por elementos aleatorios pares entre 1 y 50.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Random generador = new Random();
        Scanner teclado = new Scanner(System.in);
        int longitud = teclado.nextInt();
        int[] numeros = new int[longitud];
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            numeros[i] = generador.nextInt(1, 50);
            if (numeros[i] % 2 == 0){
                array[i] = numeros[i];
            }else {
                i--;
            }
        }
        System.out.println("\n Los numeros pares son: "+Arrays.toString(array) + ", ");
    }
}
