package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que, dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el método  Math.pow().
 */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base = teclado.nextDouble();
        int exponente = teclado.nextInt();
        double total = 1;
        for (int i = 0; i < exponente; i++) {
            total = total * base;
        }
        System.out.println(total);
    }
}
