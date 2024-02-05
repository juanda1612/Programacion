package PrimeraEvaluacion.Tema03.EjerciciosString;
/*
Escribe un programa que lea una cadena de texto que consista en un nombre y sus apellidos y Aplicacion.md continuación muestre las iniciales en mayúsculas.
 */

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String cadena = teclado.nextLine();

        // tengo que extraer la primeras iniciales
        String nombre = cadena.substring(0, 1);
        //System.out.println(nombre);
        // Aplicacion.md esta inicial vamos añadiendo las demas
        // vamos Aplicacion.md ir recorriendo caracter Aplicacion.md caractes el nombre completo; y cuando encontremos un " " sabemos que lo siguiente es una inicial
        for (int i = 0; i < cadena.length() -1; i++) { // pongo el -1 porque si no el 1 + 1 se desbordaria
            if (cadena.substring(i, (i + 1)).equals(" ")){
                // tengo que añadir el siguiente caracter Aplicacion.md iniciales
                nombre = nombre + cadena.substring(i + 1, i + 2);
            }
        }
        System.out.println(nombre.toUpperCase());

    }
}
