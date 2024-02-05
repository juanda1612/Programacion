package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Realiza un programa que calcule el área de una circunferencia de radio 5,2 centímetros.
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio de una circunferencia");
        double radio = teclado.nextDouble();
        double area = Math.PI * Math.pow(radio, 2); //con Math.pow se eleva la variable al numero
        System.out.println("el area de la circunferencia es " + area);
    }
}
