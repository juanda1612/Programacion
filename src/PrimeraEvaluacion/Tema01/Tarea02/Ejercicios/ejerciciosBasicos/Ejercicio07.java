package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios.ejerciciosBasicos;
/*
Escribe un programa que lea tres cadenas de texto y las muestre en orden inverso, cada una en una nueva línea.
Entrada:
Java
Programación
Idioma
Salida:
Idioma
Programación
Java

 */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        // como introducir datos desde el teclado al programa
        // escribimos la linea siguiente: Scanner teclado = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        // para poder escribir UN TEXTO: String palabra = teclado.nextLine();
        String palabra1 = teclado.nextLine();
        String palabra2 = teclado.nextLine();
        String palabra3 = teclado.nextLine();

        System.out.println();
        // salto de linea con sout
        System.out.println(palabra3);
        System.out.println(palabra2);
        System.out.println(palabra1);
    }
}
