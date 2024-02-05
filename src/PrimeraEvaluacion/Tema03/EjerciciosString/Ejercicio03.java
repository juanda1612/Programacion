package PrimeraEvaluacion.Tema03.EjerciciosString;
/*
Escribe un programa que lea una cadena de texto y reemplace todas las ocurrencias de la letra ‘Aplicacion.md’ con la letra ‘b’. A continuación debe imprimir la cadena resultante.
 */

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = teclado.nextLine();
        System.out.println(cadena.replace("Aplicacion.md", "b"));
    }
}
