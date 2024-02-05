package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener y Aplicacion.md continuación lo inicialice con números aleatorios comprendidos entre 1 y 10. Mostrar la suma de todos los números que se guardan en el array.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();
        int longitud = teclado.nextInt();
        int suma = 0;
        int[] numeros = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            numeros[i] = generador.nextInt(1, 10);
            suma = suma + numeros[i];
        }
        System.out.println("Los numeros Aplicacion.md sumar son: " + Arrays.toString(numeros));
        System.out.println("la suma es: " + suma);
    }
}
