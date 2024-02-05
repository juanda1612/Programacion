package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación y muestre la nota final (la nota final es la media de las tres evaluaciones) con un decimal.

 */

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota de la primera evaluacion");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduce la nota de la segunda evaluacion");
        double nota2 = teclado.nextDouble();
        System.out.println("Introduce la nota de la tercera evaluacion");
        double nota3 = teclado.nextDouble();
        double notaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("La nota final del modulo Programacion es " + notaFinal);
    }
}
