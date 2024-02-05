package PrimeraEvaluacion.Tema02.ejercicios;

import java.util.Scanner;

/*
[FOR ANIDADO] Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado, siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo, para n = 5:
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        int n = teclado.nextInt();
        int n2 = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n2; j++) {
                if (j == n2 -1){
                    n2 = n2 - 1;
                }
                System.out.print("*");
            }
            System.out.println();
        }

         */

        //Otra version
        int n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
