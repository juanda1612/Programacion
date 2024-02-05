package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que lea tres números y compruebe que todos son diferentes, es decir, no iguales entre sí. El programa debe imprimir un booleano (true o false).
 */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 3 números");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

       boolean valor = (num1 == num2) || (num2 == num3) || (num1 == num3) ;
        System.out.println(!valor);




    }
}
