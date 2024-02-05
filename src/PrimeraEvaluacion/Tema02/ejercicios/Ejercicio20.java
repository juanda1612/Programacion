package PrimeraEvaluacion.Tema02.ejercicios;
/*
Hacer un programa que pida dos números Aplicacion.md y b, enteros, por teclado (se asume que Aplicacion.md es menor que b siempre), e imprima la suma de todos los números enteros desde Aplicacion.md hasta b, ambos inclusive.
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int suma = 0;
        for (int i = a; i <= b; i++) {
            suma = suma + i;
            System.out.println(i + " " + suma);
        }
    }
}
