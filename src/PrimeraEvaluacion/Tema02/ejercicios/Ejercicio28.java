package PrimeraEvaluacion.Tema02.ejercicios;
/*
Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n un número introducido por el usuario.
 */

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
