package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que lea un valor entero y verifique si es menor que 10 y mayor que 0. El programa debe imprimir un booleano (true o false).
 */

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num1 = teclado.nextInt();
        boolean valor = (num1 < 10) && (num1 > 0);
        System.out.println("El valor es menor que 10 y mayor que 0: " + valor);
    }
}
