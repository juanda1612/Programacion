package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
/*
Escribe un programa que lea un valor por teclado y verifique si es menor que 10. El programa debe imprimir un booleano (true o false).
 */

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*System.out.println("Introduce un valor");
        int num1 = teclado.nextInt();
        if (num1 <= 10){
            boolean valor = true;
            System.out.println(valor);
        }else {
            boolean valor = false;
            System.out.println(valor);
        }

         */
        //segunda forma
        System.out.println("Segunda forma");
        int num1 = teclado.nextInt();
        boolean resultado = num1 < 10;
        System.out.println(resultado);
        //Tercera forma
        System.out.println("Tercera forma");
        resultado = num1 < 10 ? true : false;

    }
}
