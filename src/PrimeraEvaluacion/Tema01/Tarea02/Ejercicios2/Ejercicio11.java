package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Realiza un programa que calcule la longitud de una circunferencia de radio 3 metros.
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio de una circunferencia");
        int radio = teclado.nextInt();
        double longitud = 2 * Math.PI * radio; //Con Math se hacen cosas de matematicas, en este caso el numero PI
        System.out.printf("La longitud es %.2f", longitud);
    }


}
