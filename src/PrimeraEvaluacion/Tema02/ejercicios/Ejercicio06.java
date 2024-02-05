package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que pida tres números y los muestre ordenados (de menor Aplicacion.md mayor).
 */

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa 3 numeros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        int numeroMayor;
        int numeroMedio;
        int numeroPeque;

        if (num1 >= num2 && num1 >= num3){
            numeroMayor = num1;
            if (num2 > num3){
                numeroMedio = num2;
                numeroPeque = num3;
            }else {
                numeroMedio = num3;
                numeroPeque = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            numeroMayor = num2;
            if (num1 > num3){
                numeroMedio = num1;
                numeroPeque = num3;
            }else {
                numeroMedio = num3;
                numeroPeque = num1;
            }
        } else {
            numeroMayor = num3;
            if (num1 > num2){
                numeroMedio = num1;
                numeroPeque = num2;
            }else {
                numeroMedio = num2;
                numeroPeque = num1;
            }
        }
        System.out.println( numeroPeque + " ," + numeroMedio + ", " + numeroMayor );
        }
    }

