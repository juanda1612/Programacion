package PrimeraEvaluacion.Tema02.ejercicios2;
/*
Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará: El total de números introducidos, excluido el 0. El total de números fallados.
 */

import java.util.Scanner;

public class EjercicioE02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorFallos = 0;
        int contadorExito = 0;
        int n = teclado.nextInt();
        int n2 = 0;
        while (n != 0){
            if (n > n2){
                n2 = n;
            }else {
                System.out.println("Fallo es menor");
                contadorFallos++;
                n2 = n;
            }
            contadorExito++;
            n = teclado.nextInt();
        }
        System.out.println("Total de numeros introducidos: " + contadorExito);
        System.out.println("Total de numeros fallados: " + contadorFallos);
    }
}
