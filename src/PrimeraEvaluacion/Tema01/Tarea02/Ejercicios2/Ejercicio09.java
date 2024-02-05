package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que lea un número de tres cifras y muestre el número invertido. Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si introducimos 976, el programa debe mostrar 679.
 */

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de 3 cifras");
        int num1 = teclado.nextInt();

        /*if (num1 >= 100 && num1 <=999){
            int centenas = num1 / 100;
            int decenas = (num1 / 10) % 10;
            int unidades = num1 % 10;
            System.out.println(unidades * 100 + decenas * 10 + centenas);
         */

        //PROFE
        int centenas = num1 / 100;
        int resto = num1 % 100; // en este tengo las decenas y las unidades
        int decenas = resto / 10; // en el resto de esta division quedan las unidades
        int unidades = resto % 10;
        //mostramos los tres digitos invertidos
        System.out.println(unidades + "" + decenas + "" + centenas);
        }
    }
