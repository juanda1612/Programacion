package PrimeraEvaluacion.Tema03.EjerciciosString;
/*
Escribe un programa que lea el nombre de una ciudad y compruebe si el nombre termina con “burgo”. El programa debe imprimir true o false.
 */

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = teclado.nextLine();
        boolean comprueba = cadena.endsWith("burgo");
        System.out.println(comprueba);
    }
}
