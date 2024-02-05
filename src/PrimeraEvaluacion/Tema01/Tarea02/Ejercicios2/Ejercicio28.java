package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que lea tres números enteros e imprima true si el primer número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe imprimir false.
 */

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 3 numeros enteros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        boolean valor = (num1 >= num2) && (num1 <= num3) || (num1 <= num2) && (num1 >= num3);
        System.out.println("El primer numero esta entre el segundo y tercer numero: " + valor);
    }
}
