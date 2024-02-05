package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que pide 5 números por teclado y al concluir escribe el mayor y menor de ellos (sin utilizar for).
 */

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();
        int num5 = teclado.nextInt();
        int mayor = num1;
        int menor = num1;

        if (num2 > mayor){
            mayor = num2;
        } else if (num2 < menor) {
            menor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        } else if (num3 < menor) {
            menor = num3;
        }
        if (num4 > mayor){
            mayor = num4;
        } else if (num4 < menor) {
            menor = num4;
        }
        if (num5 > mayor){
            mayor = num5;
        } else if (num5 < menor) {
            menor = num5;
        }


        System.out.println("El numero mayor es " + mayor + " y el menor es " + menor);
    }
}
