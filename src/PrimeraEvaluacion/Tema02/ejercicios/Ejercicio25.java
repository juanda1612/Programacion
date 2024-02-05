package PrimeraEvaluacion.Tema02.ejercicios;
/*
[FOR ANIDADO]Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de multiplicar, hasta llegar Aplicacion.md él. (Nota: para  que los números queden alineados en columnas puedes usar el tabulador \t). Ejemplo:
 */

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Tabla de multiplicar del " + i + " = ");
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
