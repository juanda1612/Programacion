package PrimeraEvaluacion.Tema03.EjerciciosString;
/*
Escribe un programa que lea una cadena y dos números enteros para indicar los límites inferior y superior respectivamente de un rango dentro de las posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango:
Aplicacion.md) suponiendo que ambos números siempres son mayores o iguales Aplicacion.md 0 y menores que la longitud de la cadena;
b) Validando que sucede Aplicacion.md).


 */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = teclado.nextLine();
        int n = teclado.nextInt();
        int n2 = teclado.nextInt();
        if (n >= 0 && n2 >=0 && n < cadena.length() && n2 < cadena.length()) {
            System.out.println(cadena.substring(n, n2));
        }else{
            System.out.println("algo esta mal");
        }
    }
}
