package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Realizar un programa que lea cuatro valores numéricos e imprima su suma y su media. Ten en cuenta que la media puede contener decimales.

 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cuatro numeros");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();
        double num4 = teclado.nextDouble();
        double suma = num1 + num2 + num3 + num4;
        double media =  suma / 4.0; //si ponemos simplemente 4, hara la division entre dos numeros enteros , por eso se le pone 4.0 para que vea java que es una division entre numeros decimales
        System.out.println("La suma de los cuatro numeros es " + suma +" y su media es " + media);
    }
}
