package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Generar un array de 10 enteros ordenados crecientemente. Pedir un número por teclado y buscarlo en el array. Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Random generador = new Random();
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generador.nextInt(0, 10);
        }
        Arrays.sort(numeros);
        System.out.println("Los numeros son: " + Arrays.toString(numeros));
        System.out.println("Introduce un numero para buscar");
        int buscar = teclado.nextInt();
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (buscar == numeros[i]){
                posicion = i;
                break;
            }
        }
        if (posicion >= 0){
            System.out.println("El numero " + buscar + " esta en la posicion " + posicion);
            }else {
            System.out.println("El numero " + buscar + " no esta");
        }
        }
    }

