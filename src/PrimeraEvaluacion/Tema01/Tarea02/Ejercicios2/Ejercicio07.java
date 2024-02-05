package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que pida un número de dos dígitos e imprima las decenas.
 */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de dos digitos");
        int num1 = teclado.nextInt();
        if (num1 >= 10 && num1 <= 99){
            int decimal = num1 / 10;
            System.out.println(decimal);
        }else {
            System.out.println("no se puede");
        }
    }
}
