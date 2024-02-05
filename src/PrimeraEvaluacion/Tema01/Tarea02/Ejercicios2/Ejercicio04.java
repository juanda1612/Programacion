package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que lea un valor entero n de la entrada estándar y muestre el resultado de la siguiente expresión aritmética:
((n + 1) * n + 2) * n + 3

 */

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n = teclado.nextInt();
        int expresion = ((n + 1) * n + 2) * n + 3;
        int resultado = expresion;
        System.out.println(resultado);

    }
}
