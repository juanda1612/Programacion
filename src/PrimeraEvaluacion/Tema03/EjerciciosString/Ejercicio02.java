package PrimeraEvaluacion.Tema03.EjerciciosString;
/*
Realizar un programa que compruebe si una cadena leída por teclado comienza por una subcadena introducida también por teclado.
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = teclado.nextLine();
        System.out.println("Ahora introduce el texto que quieres comprobar si esta: ");
        String cadena2 = teclado.nextLine();
        if (cadena.contains(cadena2)){
            System.out.println("Si, la cadena2 \"" + cadena2 + "\" Esta dentro de " + cadena);
        }else {
            System.out.println("No, la cadena2 \"" + cadena2 + "\" No esta dentro de " + cadena);
        }

    }
}
