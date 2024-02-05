package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numero");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        if (num1 > num2){
            System.out.println("El numero 1 es mayor que numero dos");
        }else {
            System.out.println("El numero 1 no es mayor que el numero 2");
        }
    }

}
