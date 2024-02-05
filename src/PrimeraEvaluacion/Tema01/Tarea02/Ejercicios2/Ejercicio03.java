package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribir un programa en el cual se piden cuatro números y se calcule e imprima la suma de los dos primeros y el producto del tercero y el cuarto.
 */

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce 4 numeros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();
        int suma = num1 + num2;
        System.out.println("el resultado de sumar los dos primeros numeros es " + suma);
        int producto = num3 + num4;
        System.out.println("el resultado de multiplicar los dos ultimos numeros es " + producto);

    }
}
