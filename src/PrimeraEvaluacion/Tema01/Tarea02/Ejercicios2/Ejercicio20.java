package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Realiza un programa que pida un número y un porcentaje, y
Calcule y muestre ese número incrementado en ese porcentaje.
Calcule y muestre ese número decrementado en ese porcentaje.
	Por ejemplo: si se introduce 10 y 20, el resultado es 12 y 8.

 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = teclado.nextInt();
        int porcentaje = teclado.nextInt();
        double numIncrementado = (num1 * porcentaje) / 100 + num1;
        double numDecrementado = num1 - (num1 * porcentaje) / 100;
        System.out.print("La suma del " + porcentaje +"% de " + num1 +" es = " + numIncrementado + "\n El descuento del " + porcentaje +"% de " + num1 +" es = " + numDecrementado);

    }
}
