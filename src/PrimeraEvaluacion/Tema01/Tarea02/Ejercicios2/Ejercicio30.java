package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que lea los números Aplicacion.md, b y c y compruebe si existe algún par de ellos que sumen exactamente 20. El programa debe imprimir un booleano (true o false).
 */

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor del numero Aplicacion.md");
        int a = teclado.nextInt();
        System.out.println("Ingresa el valor del numero b");
        int b = teclado.nextInt();
        System.out.println("Ingresa el valor del numero c");
        int c = teclado.nextInt();

        boolean resultado = true;

        if ((a + b == 20) || (b + c == 20) || (a + c == 20)){
            System.out.println(resultado);
        }else {
            System.out.println(!resultado);
        }
    }
}
