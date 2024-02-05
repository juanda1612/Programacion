package PrimeraEvaluacion.Tema02.ejercicios2;
/*
Realiza un programa que lea un número y Aplicacion.md continuación escriba el carácter “*” tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá escribir un único asterisco.
 */

import java.util.Scanner;

public class EjercicioE03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        if (n >= 0){
            for (int i = 0; i < n; i++) {
                System.out.print("*\t");
            }
        }else {
            System.out.println("*");
        }
    }
}
