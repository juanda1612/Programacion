package PrimeraEvaluacion.Tema02.ejercicios2;
/*
Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
 */

import java.util.Scanner;

public class EjercicioE01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        boolean esPrimo = true;

        if (numero == 0 || numero == 1){
            System.out.println("No es primo");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0){
                    System.out.println("No es primo porque es divisible entre " + i);
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo){
                System.out.println("Es primo");
            }
        }
    }
}
