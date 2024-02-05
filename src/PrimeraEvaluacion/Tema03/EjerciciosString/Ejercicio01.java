package PrimeraEvaluacion.Tema03.EjerciciosString;
/*
Escribir por pantalla cada carácter de una cadena introducida por teclado.
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String cadena = teclado.nextLine();
        // para ver el caracter Aplicacion.md caracter -> charAt
        for (int i = 0; i < cadena.length(); i++) { //tamaño: cadena.length() pero la ultima posicion es ...
            System.out.println(cadena.charAt(i));
        }
    }
}
