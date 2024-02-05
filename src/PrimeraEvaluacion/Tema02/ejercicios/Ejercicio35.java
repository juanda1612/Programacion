package PrimeraEvaluacion.Tema02.ejercicios;
/*
Dada una secuencia de números enteros (que finaliza con el número 0), encuentra el elemento más grande de la secuencia. El número 0 no está incuido en la secuencia, sólo se utiliza para finalizar el programa.
 */

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //YO
        /*
        int numeroMayor = 0;
        int n = teclado.nextInt();
            while (true){
            n = teclado.nextInt();
            if (numeroMayor < n) {
                numeroMayor = n;
            }
            if (n == 0) {
                System.out.println(numeroMayor);
                break;
                }
            }

         */
        //CLASE
        /*int n = teclado.nextInt();
        int numeroMayor = n;
        while (n != 0){
            n = teclado.nextInt();
            if (numeroMayor < n && n != 0){
                numeroMayor = n;
            }
        }
        System.out.println(numeroMayor);

         */
        //DO WHILE
        int n = teclado.nextInt();
        int numeroMayor = n;
            do {
                if (n != 0) {
                    n = teclado.nextInt();
                }
                if (numeroMayor < n && n != 0) { //metemos el n != 0 por si metemos todos los numeros negativos
                    numeroMayor = n;
                }
            } while (n != 0);
            System.out.println(numeroMayor);
        }
    }

