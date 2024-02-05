package PrimeraEvaluacion.Tema03.EjerciciosString;
/*
Escribe un programa que compruebe si una cadena dada comienza por “J”, sin que tenga en cuenta si está en mayúsculas o minúsculas. El programa debe imprimir true o false.
 */

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = teclado.nextLine();
        // el truco esta en pasar toda la cadena Aplicacion.md mayusculas con toUpperCase() [tambien podemos pasar todo Aplicacion.md minusculas con toLowerCase]
        cadena = cadena.toUpperCase();
        boolean comienza = cadena.startsWith("J");
        System.out.println(comienza);
    }
}
