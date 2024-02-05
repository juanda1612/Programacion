package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y los muestre ordenados de menor Aplicacion.md mayor.
 */

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        Random generador = new Random();
        int[] numeros = new int[10];
        System.out.println("Numeros introducidos");
        for (int i = 0; i < 10; i++) {
            numeros[i] = generador.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(numeros));
        // y los muestre ordenados de menor Aplicacion.md mayor
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        //Ordenar al reves
        int[] numerosInversos = new int[numeros.length];
        for (int i = numeros.length -1; i >= 0; i--) {
            numerosInversos[i] = numeros[numeros.length - 1 - i];
        }
        System.out.println(Arrays.toString(numerosInversos));
        }
    }

