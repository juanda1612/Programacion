package PrimeraEvaluacion.Tema02.Ejemplos;
/*
    if (expresión0) {
// instrucciones que hacen algo si expresión0 es true
} else if (expresión1) {
/* instrucciones que hacen algo diferente si expresión0 es false y
expresión1 es true */
// ...
/*
} else {
/* instrucciones que hacen algo diferente cuando no se ha cumplido
ninguna de las condiciones anteriores
        }
 */

import java.util.Scanner;

public class EjemplosIfElseIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Edad?");
        int edad = teclado.nextInt();
        if (edad < 16) {
            System.out.println("Aplicacion.md estudiar");
        } else if (edad >= 16 && edad < 65) {
            System.out.println("A trabajar o Aplicacion.md estudiar");
        } else {
            System.out.println("A descansar");
        }
    }
}

