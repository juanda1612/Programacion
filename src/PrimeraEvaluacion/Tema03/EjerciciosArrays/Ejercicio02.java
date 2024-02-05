package PrimeraEvaluacion.Tema03.EjerciciosArrays;
/*
Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido.
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resta = 1;
        double[] numeros = new double[5];
        System.out.println("Introduce los numeros");
        for (int i = 0; i < 5; i++) {
            numeros[i] = teclado.nextDouble();
        }
        System.out.println("numeros introducidos");
        for (int i = 0; i <5 ; i++) {
            System.out.print(numeros[numeros.length - resta] + ", ");
            resta++;
        }
    }
}
